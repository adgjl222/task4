package com.tian.dao;

import com.tian.model.Job;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {


    int deleteByPrimaryKey(Integer id);

    String selectById(Integer id);

    List <Job> selectByDirection(String direction);

    List <Job> select();


    int  insert(Job job);

}