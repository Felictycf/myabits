package com.example.ssmpdemo.mapper;

import com.example.ssmpdemo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    Book select(Integer id);
    void delect(Integer id);

}
