/**
 * Copyright (C), 2018-2019,
 * FileName: XmlAspect
 * Author:   Kevin
 * Date:     2019/6/10 12:51
 * Description:
 */
package cn.nh.kevin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
public class XmlAspect {
    public void before() {
        System.out.println("before ....");
    }

    public void after(){
        System.out.println("after");
    }

    public void afterReturning() {
        System.out.println("after returning");
    }

    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("before around");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after around");
    }

}