/**
 * Copyright (C), 2018-2019,
 * FileName: MvcController
 * Author:   Kevin
 * Date:     2019/6/24 13:10
 * Description:
 */
package cn.nh.kevin.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/24
 * @since 1.0.0
 */
@Controller("MyController")
@RequestMapping("/my")
public class MvcController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return  mv;
    }
}