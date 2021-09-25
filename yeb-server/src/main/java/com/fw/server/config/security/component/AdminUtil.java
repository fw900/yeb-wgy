package com.fw.server.config.security.component;

import com.fw.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 操作员工具类
 * @author FW900
 * @date 2021-09-25 15:28
 */
public class AdminUtil {

    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
