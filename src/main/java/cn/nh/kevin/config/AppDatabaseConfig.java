/**
 * Copyright (C), 2018-2019,
 * FileName: AppDatabaseConfig
 * Author:   Kevin
 * Date:     2019/6/3 14:58
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.pojo.Teacher;
import cn.nh.kevin.service.RoleDBService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.sql.SQLException;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
@ComponentScan(basePackages = {"cn.nh.kevin"})
@ImportResource({"classpath:cn/nh/kevin/spring-dataSource.xml"})
//@MapperScan(basePackages = "cn.nh.kevin.Mapper")
public class AppDatabaseConfig {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppDatabaseConfig.class);
        RoleDBService rdb = context.getBean(RoleDBService.class);
        Teacher teacher = rdb.getRole("01");
        System.out.println(teacher.getName());
    }
}