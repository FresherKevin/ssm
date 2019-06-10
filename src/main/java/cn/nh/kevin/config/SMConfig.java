/**
 * Copyright (C), 2018-2019,
 * FileName: SMConfig
 * Author:   Kevin
 * Date:     2019/6/10 15:58
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.Mapper.RoleMapper;
import cn.nh.kevin.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
public class SMConfig {
    public static void main(String[] args) {
       //Logger logger = Logger.getLogger("SMConfig.class");
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-datasource.xml");
        RoleMapper roleMapper = context.getBean(RoleMapper.class);
        Role role = new Role();
        role.setNote("23");
        role.setRoleName("jack");
        roleMapper.insertRole(role);

    }
}