package com.fw.server.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fw.server.pojo.Employee;
import com.fw.server.pojo.RespBean;
import com.fw.server.pojo.RespPageBean;
import com.fw.server.pojo.Salary;
import com.fw.server.service.IEmployeeService;
import com.fw.server.service.ISalaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工账套
 *
 * @author FW900
 * @date 2021-09-26 18:14
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SalarySobCfgController {

    @Autowired
    private ISalaryService salaryService;
    @Autowired
    private IEmployeeService employeeService;

    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/salaries")
    private List<Salary> getAllSalaries() {
        return salaryService.list();
    }

    @ApiOperation(value = "获取所有员工账套")
    @GetMapping("/")
    private RespPageBean getEmployeeWithSalary(@RequestParam(defaultValue = "1") Integer current,
                                               @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeWithSalary(current, size);
    }

    @ApiOperation(value = "更新员工账套")
    @PutMapping("/")
    private RespBean updateEmployeeSalary(Integer eid, Integer sid) {
        if (employeeService.update(new UpdateWrapper<Employee>().set("salaryId", sid).eq("id", eid))) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
