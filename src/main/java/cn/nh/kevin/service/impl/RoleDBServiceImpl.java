/**
 * Copyright (C), 2018-2019,
 * FileName: RoleDBServiceImpl
 * Author:   Kevin
 * Date:     2019/6/3 15:02
 * Description:
 */
package cn.nh.kevin.service.impl;

import cn.nh.kevin.pojo.Teacher;
import cn.nh.kevin.service.RoleDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
@Component
public class RoleDBServiceImpl implements RoleDBService {
    @Autowired
    DataSource dataSource = null;

    @Override
    public Teacher getRole(String tid) {
        Connection coon=null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        Teacher t=null;

        try {
            coon=dataSource.getConnection();
            preparedStatement=coon.prepareStatement("select tid,tname from teacher where tid = ?");
            preparedStatement.setString(1,tid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                t = new Teacher();
                t.setId(resultSet.getString(1));
                t.setName(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }
}