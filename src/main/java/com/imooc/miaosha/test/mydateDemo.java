package com.imooc.miaosha.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface mydateDemo {
    @Select("select myid from mytest where myid = 1")
    void query();
}
