/**
 * Copyright (C), 2018-2019,
 * FileName: JavaConfig
 * Author:   Kevin
 * Date:     2019/6/10 17:05
 * Description: 使用java配置实现数据库事务
 */
package cn.nh.kevin.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 〈使用java配置实现数据库事务〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
@Configuration
@ComponentScan("cn.nh.kevin.*")
@EnableTransactionManagement
public class JavaConfig implements TransactionManagementConfigurer {

    private DataSource dataSource=null;
    /**
    *@Author Kevin
    *@Description: 配置数据源
    *@Date 17:12 2019/6/10
    *@param:
    *@return javax.sql.DataSource  数据源
    **/
    @Bean(name = "dataSource1")
    public DataSource initDataSource(){
        if(dataSource!=null)
            return dataSource;
        Properties properties = new Properties();
        properties.setProperty("driverClassName","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://localhost:3306/sql_50");
        properties.setProperty("username","kevin");
        properties.setProperty("password","19980910");
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
    @Bean(name = "jdbcTemplate1")
    public JdbcTemplate initjdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(initDataSource());
        return jdbcTemplate;
    }

    @Override
    @Bean(name = "transactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(initDataSource());
        return transactionManager;
    }

}