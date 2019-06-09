/**
 * Copyright (C), 2018-2019,
 * FileName: GameMain
 * Author:   Kevin
 * Date:     2019/6/9 13:44
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
public class GameMain {
    public static void main(String[] args) {
        Print proxyhello = ProxyBeanFactory.getbean(new PrintHello(),new HelloInterception());
        proxyhello.Print();
    }
}