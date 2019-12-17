package com.lgc.boot.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author lgc
 * @create 2019-12-17 3:33 下午
 **/
@Data
@Builder
public class Person {
    private String name;
    private double height;
    private double length;
}
