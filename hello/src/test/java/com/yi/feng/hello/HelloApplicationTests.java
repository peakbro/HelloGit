package com.yi.feng.hello;

import com.yi.feng.hello.entity.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "feng");
        Assert.assertEquals(blogProperties.getTitle(), "Spring学习");
        Assert.assertEquals(blogProperties.getDesc(),"来自"+blogProperties.getName()+"的"+blogProperties.getTitle());
/*        Assert.assertEquals(blogProperties.getNumber(),"100");*/
    }
}

