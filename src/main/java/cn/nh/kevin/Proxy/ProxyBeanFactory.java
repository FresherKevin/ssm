/**
 * Copyright (C), 2018-2019,
 * FileName: ProxyBeanFactory
 * Author:   Kevin
 * Date:     2019/6/9 13:30
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
public class ProxyBeanFactory {
    public static <T> T getbean(T obj,Interceptor interceptor){
        return (T)ProxyBeanUtil.getbean(obj,interceptor);

    }

}