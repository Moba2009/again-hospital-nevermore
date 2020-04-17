package cn.linyt.againhospitalnevermore.controller;

import cn.linyt.againhospitalnevermore.annotation.JwtIgnore;
import cn.linyt.againhospitalnevermore.response.Result;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/17 15:10
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/hello")
public class HelloController {

//    @JwtIgnore
    @PostMapping
    public Result hello( String username) {

        log.info("### hello: " + username + " ###");
        JSONObject result = new JSONObject();
        result.put("token", username);
        return Result.SUCCESS(result);
    }
}
