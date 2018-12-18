package com.yi.feng.hello.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties{
    @Value("${com.feng.blog.name}")
    private String name;
    @Value("${com.feng.blog.title}")
    private String title;
    @Value("${com.feng.blog.desc}")
    private String desc;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}