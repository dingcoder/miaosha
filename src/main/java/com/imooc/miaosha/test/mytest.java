package com.imooc.miaosha.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class mytest {
    @Autowired
    mydateDemo mydateDemo;

    @Test
    public void demo() {
        mydateDemo.query();
    }
}
