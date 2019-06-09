/**
 * Copyright (C), 2018-2019,
 * FileName: Appconfig
 * Author:   Kevin
 * Date:     2019/6/2 18:13
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.controller.impl.RoleController;
import cn.nh.kevin.pojo.Role;
import cn.nh.kevin.service.RoleService;
import cn.nh.kevin.service.impl.RoleServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/2
 * @since 1.0.0
 */
@ComponentScan
@ImportResource({"classpath:spring-dataSource.xml"})
public class Appconfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Role role = context.getBean(Role.class);

        RoleService rs = context.getBean(RoleServiceImpl.class);
        RoleController roleController = context.getBean(RoleController.class);

        rs.printRoleInfo();
        System.out.println("now ");
        roleController.printhello();
        context.close();

        /*
        DataSource dataSource = context.getBean(org.apache.commons.dbcp2.BasicDataSource.class);
        System.out.println(((BasicDataSource) dataSource).getUrl());*/

    }
}