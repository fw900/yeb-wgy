package com.fw.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fw.server.pojo.Employee;
import com.fw.server.pojo.RespBean;
import com.fw.server.pojo.RespPageBean;

import java.time.LocalDate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工（分页）
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployee(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkID();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 获取所有员工账套
     * @param current
     * @param size
     * @return
     */
    RespPageBean getEmployeeWithSalary(Integer current, Integer size);
}
