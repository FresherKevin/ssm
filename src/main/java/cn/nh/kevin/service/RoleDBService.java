/**
 * Copyright (C), 2018-2019,
 * FileName: RoleDBService
 * Author:   Kevin
 * Date:     2019/6/3 15:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.nh.kevin.service;


import cn.nh.kevin.pojo.Teacher;

import java.sql.SQLException;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
public interface RoleDBService {
    public Teacher getRole(String id);
}