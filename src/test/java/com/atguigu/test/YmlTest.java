package com.atguigu.test;

import com.atguigu.springboot.Application;
import com.atguigu.springboot.entity.Emp;
import com.atguigu.springboot.entity.Student;
import com.atguigu.springboot.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class YmlTest {
    @Autowired
    private Student student;

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testRead() {
        System.out.println(student);
    }

    @Test
    public void testSelectAll() {
        List<Emp> emps = empMapper.selectAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
