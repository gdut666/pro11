package com.atguigu.test;

import com.atguigu.springboot.Application;
import com.atguigu.springboot.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class YmlTest {
    @Autowired
    private Student student;

    @Test
    public void testRead() {
        System.out.println(student);
    }

}
