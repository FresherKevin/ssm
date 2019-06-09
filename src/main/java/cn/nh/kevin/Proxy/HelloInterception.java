/**
 * Copyright (C), 2018-2019,
 * FileName: HelloInterception
 * Author:   Kevin
 * Date:     2019/6/9 13:42
 * Description:
 */
package cn.nh.kevin.Proxy;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
public class HelloInterception implements Interceptor {

    @Override
    public void before(Object object) {
        System.out.println("before hello");
    }

    @Override
    public void after(Object object) {
        System.out.println("after hello");
    }

    @Override
    public void afterReturing(Object object) {
        System.out.println("正常返回");
    }

    @Override
    public void afterThrowing(Object object) {
        System.out.println("error");
    }
}