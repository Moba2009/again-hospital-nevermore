package cn.linyt.againhospitalnevermore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/17 5:40
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public String test() {

        return "hello world";
    }
}
