package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entity.Emp;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmpMapper {
    List<Emp> selectAll();
}
