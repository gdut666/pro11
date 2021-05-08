package com.atguigu.springboot;

import com.atguigu.springboot.entity.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 将当前类标记为一个SpringBoot应用
 */
@SpringBootApplication
@MapperScan("com.atguigu.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
