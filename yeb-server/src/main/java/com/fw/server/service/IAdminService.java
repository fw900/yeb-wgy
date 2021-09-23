package com.fw.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fw.server.pojo.Admin;
import com.fw.server.pojo.RespBean;
import com.fw.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);

    /**
     * 根据用户id查询角色列表
     * @param id
     * @return
     */
    List<Role> getRoles(Integer id);
}
