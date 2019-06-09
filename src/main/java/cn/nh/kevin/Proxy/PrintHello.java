/**
 * Copyright (C), 2018-2019,
 * FileName: PrintHello
 * Author:   Kevin
 * Date:     2019/6/9 13:42
 * Description:
 */
package cn.nh.kevin.Proxy;

import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
@Component
public class PrintHello implements Print{
    @Override
    public void Print(){
        System.out.println("hello");
    }
}