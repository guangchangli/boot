package com.lgc.boot.entity;

import lombok.Data;

/**
 * @author lgc
 * @create 2019-12-17 2:44 下午
 **/
@Data
public class UserVo {
    private String id;
    private String name;
    private int age;

    public static class Builder {
        private String id;
        private String name;
        private int age;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder builder(String id, String name, int age) {
            this.name = name;
            this.age = age;
            this.id = id;
            return this;
        }

        public UserVo build() {
            return new UserVo(this);
        }

    }

    public UserVo(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
    }

    public static Builder build(){
        return new Builder();
    }
}
