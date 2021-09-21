package com.fw.service.impl;

import com.fw.pojo.Menu;
import com.fw.mapper.MenuMapper;
import com.fw.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fw
 * @since 2021-09-19
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
