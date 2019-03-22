package com.tian.service.impl;

import com.tian.dao.JobMapper;
import com.tian.model.Job;
import com.tian.service.JobService;
import com.tian.util.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//让测试在spring容器环境下执行
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class JobServiceImplTest {


    private  static final Logger log = LoggerFactory.getLogger(JobServiceImplTest.class);
    @Resource
    private JobService jobService;

    @Resource
    private JobMapper jobMapper;

    @Test
    public void testSelect(){
        List<Job> jobList = jobService.select();
        log.info(""+jobList);
    }

    @Test
    public void testSelectByDirection(){
        String direction = "前端开发方向";
        jobService.selectByDirection(direction);
    }

    @Test
    public void testInsert(){
        Job job = new Job();
        job.setPicture("/static/img/tx8.png");
        job.setDirection("前端开发方向");
        job.setIntroduce("水");
        job.setProfession("ios工程师");
        job.setThreshold(2);
        job.setDifficulty(2);
        job.setScarcityLevel("236");
        job.setGrowthCycle("1-3");
   /*     job.setAgeLimitone(1);
        job.setPaymentone("5k-10k/月");
        job.setAgeLimittwo(3);
        job.setPaymenttwo("10k-20k/月");
        job.setAgeLimitthree(4);
        job.setPaymentthree("20k-50k/月");*/
        job.setPeopleCounting(360);
        job.setCreatedAt(DateTime.getTime());
        log.info(""+job);
        jobService.insert(job);

        log.info("新插入数据主键ID为 "+ job.getId());
    }

    @Test
    public void tesrid(){
        String D = jobMapper.selectById(1);
        log.info(D);
    }

    @Test
    public void testDeleteByPrimaryKey(){
        Integer id = 1;
        jobService.deleteByPrimaryKey(id);
    }
}