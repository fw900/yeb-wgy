package com.fw.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fw.server.pojo.Department;
import com.fw.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    /**
     * 添加部门
     * @param dep
     */
    void addDep(Department dep);

    /**
     * 删除部门
     * @param dep
     * @return
     */
    RespBean deleteDep(Department dep);
}
