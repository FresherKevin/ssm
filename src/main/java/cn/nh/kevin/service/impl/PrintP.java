/**
 * Copyright (C), 2018-2019,
 * FileName: PrintP
 * Author:   Kevin
 * Date:     2019/6/3 13:35
 * Description:
 */
package cn.nh.kevin.service.impl;

import cn.nh.kevin.pojo.Role;
import cn.nh.kevin.service.RoleService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
public class PrintP {

    private int q=0;

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public void printRoleInfo(Role role) {
        System.out.println(q);
    }
}