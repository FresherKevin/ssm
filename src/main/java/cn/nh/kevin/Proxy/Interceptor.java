/**
 * Copyright (C), 2018-2019,
 * FileName: Interceptor
 * Author:   Kevin
 * Date:     2019/6/9 13:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.nh.kevin.Proxy;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
public interface Interceptor {
    public void before(Object object);
    public void after(Object object);
    public void afterReturing(Object object);
    public void afterThrowing(Object object);
}