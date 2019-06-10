/**
 * Copyright (C), 2018-2019,
 * FileName: XmlAopConfig
 * Author:   Kevin
 * Date:     2019/6/10 13:01
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.pojo.Role;
import cn.nh.kevin.service.RoleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = {"cn.nh.kevin"})
@ImportResource({"classpath:spring-dataSource.xml"})
public class XmlAopConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(XmlAopConfig.class);
        RoleService roleService = context.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1L);
        role.setNote("123");
        role.setRoleName("kevin");
        roleService.printRoleInfo(role);
    }
}