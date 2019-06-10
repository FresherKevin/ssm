/**
 * Copyright (C), 2018-2019,
 * FileName: RoleService
 * Author:   Kevin
 * Date:     2019/6/2 18:05
 * Description:
 */
package cn.nh.kevin.service;

import cn.nh.kevin.pojo.Role;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/2
 * @since 1.0.0
 */

public interface RoleService {
    public void printRoleInfo(Role role);
}