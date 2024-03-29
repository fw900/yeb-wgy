package com.fw.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fw.server.pojo.MenuRole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     */
    Integer insertRecord(Integer rid, Integer[] mids);
}
