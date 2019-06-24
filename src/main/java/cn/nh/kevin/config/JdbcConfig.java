/**
 * Copyright (C), 2018-2019,
 * FileName: JdbcConfig
 * Author:   Kevin
 * Date:     2019/6/10 14:36
 * Description:
 */
package cn.nh.kevin.config;

import cn.nh.kevin.pojo.Role;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
public class JdbcConfig {

    public int insertRole(JdbcTemplate jdbcTemplate){
        String roleName = "王五";
        String note = "45";
        String sql = "insert into role values(?,?,?)";
        return jdbcTemplate.update(sql,3,roleName,note);
    }
    public List<Role> fineRole(JdbcTemplate jdbcTemplate,String roleName){
        String sql="select id,role_name,note from role where role_name like concat('%',?,'%');";
        Object []params = {roleName};
        List<Role> list = jdbcTemplate.query(sql, params, new RowMapper<Role>() {
            @Override
            public Role mapRow(ResultSet rs, int i) throws SQLException {
                Role result = new Role();
                result.setId(rs.getLong("id"));
                result.setRoleName(rs.getString("role_name"));
                result.setNote(rs.getString("note"));
                return result;
            }
        });
        return list;
    }
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/nh/kevin/spring-dataSource.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        JdbcConfig jdbcConfig = new JdbcConfig();
     //  jdbcConfig.insertRole(jdbcTemplate);
        List<Role> rolelist = jdbcConfig.fineRole(jdbcTemplate,"张三");
        System.out.println(rolelist.size());
        for (Role o : rolelist) {
            System.out.println(o.getId());
        }

    }
}