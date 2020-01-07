package com.lgc.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgc.dubbointerface.service.DubboDemoService;
import org.springframework.stereotype.Component;

/**
 * @{service} 是 {dubbo} 的 还要加上 @{component}
 * @author lgc
 * @create 2020-01-07 10:47 上午
 **/
@Service
@Component
public class ExposeService implements DubboDemoService {

    @Override
    public String demoService(String param) {
        System.out.println("dubbo provider implements dubbo common service"+param);
        return "provider";
    }
}
