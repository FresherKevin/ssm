/**
 * Copyright (C), 2018-2019,
 * FileName: Main
 * Author:   Kevin
 * Date:     2019/6/9 14:05
 * Description:
 */
package cn.nh.kevin.CglibProxy;

import cn.nh.kevin.Proxy.HelloInterception;
import cn.nh.kevin.Proxy.Interceptor;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        cglibProxy.setInterceptor(new HelloInterception());

        PrintGood proxy = (PrintGood) cglibProxy.getProxy(PrintGood.class);
        proxy.print();

    }
}