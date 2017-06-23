package com.nicole.hrms.service.impl;

import com.nicole.hrms.dao.AdminDao;
import com.nicole.hrms.domain.Admin;
import com.nicole.hrms.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by xl on 2017/6/22.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    // 自动注入 DAO 对象
    @Resource
    private AdminDao adminDao;

    // 实现接口中的方法
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

    public List<Admin> findAdmins(Map<String, Object> map) {
        return adminDao.findAdmins(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return adminDao.getCount(map);
    }

    public Integer addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    public Integer updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    public Integer deleteAdmin(Integer id) {
        return adminDao.deleteAdmin(id);
    }
}
