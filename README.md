## Spring  
Spring的学习之路
  
* Spring Ioc    
    * 依赖注入的三种方式   
        * 构造器注入
        * 使用setter注入
        * 接口注入
    * 装配bean的集中方式    
        * 使用xml配置
        * 使用注解
            * 系统内部的开发
        * 使用混合装配
            * 第三方包，系统外的接口和通用的配置  
    
    * bean的作用域
        * 单例 （singleton）在整个应用中，只会生成一个bean的实例
        * 原型 （prototype）当每次注入，或者通过SpringIoc容器获取bean时，Spring都会为其创建一个新的实例在web中应用：
        * 回话 （session）在会话过程中Spring只创建一个实例
        * 请求 （request）在一次请求中Spring会创建一个实例，但是不同的请求会创建不同的实例，例如在并发情况下多个表单的提交。
* Spring AOP  
    * 术语
      * 1：切面（aspect）  
      * 2：通知（adice）
      * 3：引入（introduction）
      * 4：切点（pointcut）
      * 5：连接点（joinpoint）
      * 6：织入（weaving）
    * 使用@AspectJ注解
      * @Before,@After,@around so on
    * 使用注解配合xml
      * 注解和XML配合使用的方法  

        	1.加入注解，导入XML文件。@ImportResource({"classpath:spring-dataSource.xml"})
        	2. 声明AnnotationConfigApplicationContext容器，而不是ClassPathXmlApplicationContext容器
        	3. 防止在xml声明重复的bean 
        	
      * &&和and
        * &在xml中有特殊意义，故使用and
        
      * 多个切面  使用@order()可以指定顺序

      