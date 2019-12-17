package com.lgc.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgc
 * @create 2019-12-17 2:09 下午
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    String test(){
        return "hello security";
    }
}
