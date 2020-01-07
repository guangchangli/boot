package com.lgc.dubboconsumer.web;

import com.lgc.dubbointerface.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgc
 * @create 2020-01-07 7:50 下午
 **/
@RestController
@RequestMapping("/dubbo")
public class DubboDemo {

    @Autowired
    DubboDemoService dubboDemoService;

    @GetMapping("/demo")
    String testDubboInvokeService() {
        String s = dubboDemoService.demoService("就这？");
        return s;
    }

}
