/**
 * Copyright (C), 2018-2019,
 * FileName: RoleController
 * Author:   Kevin
 * Date:     2019/6/3 13:34
 * Description:
 */
package cn.nh.kevin.controller.impl;

import cn.nh.kevin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
@Component("RC")
public class RoleController {

    @Autowired
    @Qualifier("Kevin")
    private RoleService roleService=null;

    private RoleService roleService2=null;

    public RoleController(@Autowired @Qualifier("Kevin") RoleService roleService) {
        this.roleService2=roleService;
     }

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }



    public void printhello(){
        roleService.printRoleInfo();
        roleService2.printRoleInfo();
    }
}