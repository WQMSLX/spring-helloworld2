package com.atguigu.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//spring声明式事物
@MapperScan("com.atguigu.springboot.dao")
@SpringBootApplication
public class SpringHelloworld2Application {
    /*
     * @SpringBootApplication
     * 声明当前应用为SpringBoot应用.启动应用程序，需要提供main方法
     *
     * 2. SpringBootConfiguration(SpringBoot提供)
     * 等价于@Configuration（spring提供）
     * 用于一个配置类，以后我们写配置操作，通过配置类进行配置，而不是用xml
     * 3.@EnableAutoConfiguation
     * 启动自动配置。springboot框架底层提供大量的配置类与常用第三方框架或组建进行整合的配置都提供
     *
     * WebMVCAutoConfiguration提供类Springmvc控制器
     *
     * 如何判断配置类是否生效
     * 只要提供了
     * 4.@ComponentScan
     * 扫描宝珠姐默认扫描main所有包及其子包
     * SpringBoot框架遵循了 约定>配置>编码 尽量不去修改默认规则
     * 注意：自定义配置 优先于默认配置
     * */

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringHelloworld2Application.class, args);



    }

}
