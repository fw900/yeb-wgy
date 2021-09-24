package com.fw.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fw.server.pojo.MenuRole;
import com.fw.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
