package com.lgc.boot.web;

import com.google.common.collect.Lists;
import com.lgc.boot.entity.Person;
import com.lgc.boot.entity.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/build")
     List<UserVo> getUserList(){
        List<UserVo> userVoList = Lists.newArrayListWithCapacity(2);
        userVoList.add(UserVo.build().id("1").name("日拱一兵").age(18).build());
        userVoList.add(UserVo.build().id("2").name("tan").age(19).build());
        return userVoList;
    }

    @GetMapping("/person")
    List<Person> getPerson(){
        List<Person> objects = Lists.newArrayListWithCapacity(2);
        objects.add(Person.builder().name("离广场").height(181).length(181).build());
        objects.add(Person.builder().name("常光里").height(81).length(81).build());
        return objects;
    }
}