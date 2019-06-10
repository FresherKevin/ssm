/**
 * Copyright (C), 2018-2019,
 * FileName: AopConfig
 * Author:   Kevin
 * Date:     2019/6/9 16:41
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.aop.RoleAspect;
import cn.nh.kevin.service.RoleService;
import cn.nh.kevin.service.impl.RoleServiceImpl;
import org.springframework.context.annotation.*;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "cn.nh.kevin")
public class AopConfig {
    @Bean
    public RoleAspect getRoleAspect(){
        return new RoleAspect();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService = context.getBean(RoleService.class);
        roleService.printRoleInfo(null);
    }
}