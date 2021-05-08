package com.atguigu.springboot.handler;

import com.atguigu.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController为@Controller和@ResponseBody的结合
public class HelloController {

    @RequestMapping("/get/spring/boot/hello/message")
    public String getMessage() {
        return "hello springboot!";
    }
}
