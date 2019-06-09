/**
 * Copyright (C), 2018-2019,
 * FileName: ProxyBeanUtil
 * Author:   Kevin
 * Date:     2019/6/9 13:32
 * Description:
 */
package cn.nh.kevin.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
public class ProxyBeanUtil implements InvocationHandler {
    private Object object;
    private Interceptor interceptor=null;


    public static Object getbean(Object object,Interceptor interceptor){
        ProxyBeanUtil proxyBeanUtil = new ProxyBeanUtil();
        proxyBeanUtil.object=object;
        proxyBeanUtil.interceptor=interceptor;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),proxyBeanUtil);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retobj=null;
        boolean execptionFlag = false;
        interceptor.before(object);
        try {
            retobj = method.invoke(object,args);
        }catch (Exception ex){
            execptionFlag = true;
        }finally {
            interceptor.after(object);
        }
        if (execptionFlag=true){
            interceptor.afterReturing(object);
        }else{
            interceptor.afterThrowing(object);
        }

        return retobj;
    }
}