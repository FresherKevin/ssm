/**
 * Copyright (C), 2018-2019,
 * FileName: AppTestSpringEL
 * Author:   Kevin
 * Date:     2019/6/3 18:01
 * Description:
 */
package cn.nh.kevin.config;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/3
 * @since 1.0.0
 */
public class AppTestSpringEL {
    public static void main(String[] args) {
        //表达式解析器
        ExpressionParser parser = new SpelExpressionParser();
        //设置表达式
        Expression exp = parser.parseExpression("'hello world'");
        String  str = (String) exp.getValue();
        System.out.println(str);

        exp = parser.parseExpression("'hello world'.bytes");
        byte []bytes = (byte[]) exp.getValue();
        System.out.println(bytes);

        //通过El访问属性
        exp = parser.parseExpression("'hello world'.bytes.length");
        exp = parser.parseExpression("new String('abc')");
        String abc = (String) exp.getValue();
        System.out.println(abc);

    }
}