/**
 * Copyright (C), 2018-2019,
 * FileName: Role
 * Author:   Kevin
 * Date:     2019/6/2 18:05
 * Description:
 */
package cn.nh.kevin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/2
 * @since 1.0.0
 */
@Component
public class Role {
    @Value("2")
    private Long id;
    @Value("kevin")
    private String roleName;
    @Value("ps")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}