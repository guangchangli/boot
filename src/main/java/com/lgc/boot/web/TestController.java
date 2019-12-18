package com.lgc.boot.web;

import com.lgc.boot.config.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgc
 * @create 2019-12-17 2:09 下午
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    CommonResult<String> test(){
        CommonResult<String> stringCommonResult = new CommonResult<>();
        stringCommonResult.setStatus(200);
        stringCommonResult.setResultBody("hello servlet");
        return stringCommonResult;
    }
}
