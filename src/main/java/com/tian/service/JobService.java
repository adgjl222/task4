package com.tian.service;

import com.tian.model.Job;

import java.util.List;

public interface JobService {



    int deleteByPrimaryKey(Integer id);

    List <Job> selectByDirection(String direction);

    List<Job> select();

    String selectById(Integer id);

    int  insert(Job job);




}
