package cn.linyt.againhospitalnevermore.controller;

import cn.linyt.againhospitalnevermore.response.Result;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/17 15:10
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public Result hello() {

        JSONObject result = new JSONObject();
        result.put("token", "hello world");
        return Result.SUCCESS(result);
    }
}
