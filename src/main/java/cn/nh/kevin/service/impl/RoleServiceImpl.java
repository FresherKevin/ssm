/**
 * Copyright (C), 2018-2019,
 * FileName: RoleServiceImpl
 * Author:   Kevin
 * Date:     2019/6/2 18:09
 * Description:
 */
package cn.nh.kevin.service.impl;

import cn.nh.kevin.pojo.Role;
import cn.nh.kevin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/2
 * @since 1.0.0
 */
@Component("Kevin")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private  Role role = null;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void printRoleInfo() {
        System.out.println(role.getId());
        System.out.println(role.getNote());
        System.out.println(role.getRoleName());
    }
}