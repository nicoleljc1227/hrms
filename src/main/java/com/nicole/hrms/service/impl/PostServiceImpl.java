package com.nicole.hrms.service.impl;

import com.nicole.hrms.dao.PostDao;
import com.nicole.hrms.domain.Post;
import com.nicole.hrms.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by xl on 2017/6/22.
 */
@Service("postService")
public class PostServiceImpl implements PostService {
    // 自动注入 DAO 对象
    @Resource
    private PostDao postDao;

    // 实现接口中的方法
    public List<Post> findPosts(Map<String, Object> map) {
        return postDao.findPosts(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return postDao.getCount(map);
    }

    public Integer addPost(Post post) {
        return postDao.addPost(post);
    }

    public Integer updatePost(Post post) {
        return postDao.updatePost(post);
    }

    public Integer deletePost(Integer id) {
        return postDao.deletePost(id);
    }

    public Post getPostById(Integer id) {
        return postDao.getPostById(id);
    }
}
