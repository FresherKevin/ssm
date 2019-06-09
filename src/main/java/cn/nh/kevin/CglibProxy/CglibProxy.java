/**
 * Copyright (C), 2018-2019,
 * FileName: CglibProxy
 * Author:   Kevin
 * Date:     2019/6/9 13:56
 * Description:
 */
package cn.nh.kevin.CglibProxy;

import cn.nh.kevin.Proxy.Interceptor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
public class CglibProxy implements MethodInterceptor {

    private Interceptor interceptor=null;

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }
    /**
    *@Author Kevin
    *@Description: 返回一个代理对象
    *@Date 14:07 2019/6/9
    *@param: cls  真实对象所属的类
    *@return java.lang.Object
    **/
    public Object getProxy(Class cls){
        //设置增强类型
        Enhancer enhancer = new Enhancer();
        //设置enhancer的父类
        enhancer.setSuperclass(cls);
        //设置当前对象为代理逻辑对象，需要实现MethodInterceptor
        enhancer.setCallback(this);

        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object retObj;
        interceptor.before(o);
        retObj = methodProxy.invokeSuper(o, objects);
        interceptor.after(o);
        interceptor.afterReturing(o);
        return retObj;
    }
}