## Spring和数据库编程 
* 原因      
    * 使用传统的JDBC代码会造成代码泛滥，首先得打开数据库连接，然后组装结果，最后关闭数据库资源，会有很多的try catch语句。
* 解决办法      
    * 使用jdbcTemplate     
* * * *
* 配置数据库资源（由于是第三方资源，故使用xml文件配置更加优良）    
* jdbcTemplate的增删查改  
* * * *
* Mybatis-Spring项目（互联网技术主流框架） 
    *  配置数据源  
    *  配置SqlSessionFactory       
        项目中spring-datasource.xml中引用的sqlMapConfig.xml是相关配置  
    * 选择配置SqlSessionTemplate      
        在同时配置SqlSessionFactory和SqlSessionTemplate的情况下，优先采用SqlSessionTemplate 
    * 配置mapper     
        * 单个配置      MapperFactoryBean   
        * 扫描配置      MapperScannerConfigurer
     * mybatis可以基于接口
* * * *
* 事务管理
    * 配置事务管理器
        项目中的spring-transactionManager.xml文件
    * 使用java的方式配置 javaConfig.java
    * 编程式事务（很少使用）
    * 声明式事务
        * xml声明式事务配置
        * 核心在于   事务定义类（TransactionDefinition）
          * springioc会在启动的时候解析这些有关配置内容，并且放置到事务定义类TransactionDefinition中。
        * 底层技术 
            * 拦截器和AOP技术
        * 事务定义类TransactionDefinition
            * 这是一个类
            * 定义了七种传播行为
            * 五种隔离级别
            * get传播行为和隔离级别
            * 事务超时时间和是否只读事务
        * 声明式事务的约定流程  
        
            1.根据事务管理器（platformTransactionManager的子类）创建事务  
            2.将事务定义往事务上设置  
            3.选取传播行为  
            4.决定是否回滚

