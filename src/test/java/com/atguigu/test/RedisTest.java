package com.atguigu.test;

import com.atguigu.springboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void testRedisTemplate() {
        ValueOperations<Object, Object> ops = redisTemplate.opsForValue();
        Object key = "hello";
//        Object value = "world";
//        //尝试向Redis中存入数据
//        ops.set(key, value);
        //尝试向Redis中读取数据
        Object v = ops.get(key);
        System.out.println(v);
    }
}
