package com.nicole.hrms.service.impl;

import com.nicole.hrms.dao.PositionDao;
import com.nicole.hrms.domain.Position;
import com.nicole.hrms.service.PositionService;
import com.nicole.hrms.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by xl on 2017/6/24.
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    // 自动注入 DAO 对象
    @Resource
    private PositionDao positionDao;
    public List<Position> findPositions(Map<String, Object> map) {
        return positionDao.findPositions(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return positionDao.getCount(map);
    }

    public Integer addPosition(Position position) {
        return positionDao.addPosition(position);
    }

    public Integer updatePosition(Position position) {
        return positionDao.updatePosition(position);
    }

    public Integer deletePosition(Integer id) {
        Integer flag= null;
        // 如果删除关联外键的行记录，抛出异常
        try {
            flag = positionDao.deletePosition(id);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return flag;
    }
}
