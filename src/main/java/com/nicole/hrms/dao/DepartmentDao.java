package com.nicole.hrms.dao;

import com.nicole.hrms.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by xl on 2017/6/24.
 */
@Repository
public interface DepartmentDao {
    /** 根据条件查询部门
     *
     * @param map
     * @return
     */
    public List<Department> findDepartments(Map<String, Object> map);

    /** 根据条件查询部门数量
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加部门
     *
     * @param department
     * @return
     */
    public Integer addDepartment(Department department);

    /** 修改部门
     *
     * @param department
     * @return
     */
    public Integer updateDepartment(Department department);

    /** 删除部门
     *
     * @param id
     * @return
     */
    public Integer deleteDepartment(Integer id);
}
