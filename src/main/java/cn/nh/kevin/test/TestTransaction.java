/**
 * Copyright (C), 2018-2019,
 * FileName: TestTransaction
 * Author:   Kevin
 * Date:     2019/6/10 17:32
 * Description:
 */
package cn.nh.kevin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * 〈测试事务〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
public class TestTransaction {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-transaction.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        /* 事务定义类接口
        * TransactionDefinition===============
        * */
        TransactionDefinition def = new DefaultTransactionDefinition();
        PlatformTransactionManager transactionManager = context.getBean(PlatformTransactionManager.class);
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            jdbcTemplate.update("insert into role(role_name,note) values('xqweqeqweqweqweqweqweqweqeqweqweqeqeqeqweqet','78')");
            transactionManager.commit(status);
        } catch (DataAccessException e) {
            System.out.println("error");
            transactionManager.rollback(status);
        }
    }
}