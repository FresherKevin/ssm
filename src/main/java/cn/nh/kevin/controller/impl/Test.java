/**
 * Copyright (C), 2018-2019,
 * FileName: Test
 * Author:   Kevin
 * Date:     2019/6/9 16:25
 * Description:
 */
package cn.nh.kevin.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/9
 * @since 1.0.0
 */
@Controller
public class Test {
    @RequestMapping("/hello")
    public String Test(){
        System.out.println("hello");
        return "test";
    }
}