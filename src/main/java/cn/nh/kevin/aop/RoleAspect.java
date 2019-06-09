/**
 * Copyright (C), 2018-2019,
 * FileName: RoleAspect
 * Author:   Kevin
 * Date:     2019/6/9 14:43
 * Description:
 */
package cn.nh.kevin.aop;

import org.aspectj.lang.annotation.*;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
@Aspect
public class RoleAspect {

    @Before("execution(* cn.nh.kevin.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void before() {
        System.out.println("before ....");
    }
  /*  @After("execution(* cn.nh.kevin.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void after(Object object) {
        System.out.println("after hello");
    }*/

    @AfterReturning("execution(* cn.nh.kevin.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void afterReturning(Object object) {
        System.out.println("正常返回");
    }

    @AfterThrowing("execution(* cn.nh.kevin.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void afterThrowing(Object object) {
        System.out.println("error");
    }
}