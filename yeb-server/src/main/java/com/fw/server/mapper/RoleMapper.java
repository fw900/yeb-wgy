package com.fw.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fw.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
