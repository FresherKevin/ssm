/**
 * Copyright (C), 2018-2019,
 * FileName: Tescher
 * Author:   Kevin
 * Date:     2019/6/3 15:15
 * Description:
 */
package cn.nh.kevin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
@Component
public class Teacher {
    @Value("1")
    private  String id;
    @Value("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}