package com.tian.service.impl;

import com.tian.dao.JobMapper;
import com.tian.model.Job;
import com.tian.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class JobServiceImpl implements JobService {
    private  static final Logger log = LoggerFactory.getLogger(JobServiceImpl.class);
    @Resource
    private JobMapper jobMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        log.info("id is "+id );
      /*  String direction = jobMapper.selectById(id);
        log.info("*********** direction is "+direction);*/
        int delete  = jobMapper.deleteByPrimaryKey(id);
        log.info("********* delete = "+delete);
        if (delete != 0 ){
           /* List<Job> jobList = jobMapper.selectByDirection(direction);*/
            log.info("删除成功");
        }else {
            log.info(" 删除失败 ");
        }

        return delete;

    }

    @Override
    public List<Job> selectByDirection(String direction) {
        log.info("direction is "+ direction);
        List<Job> jobList = jobMapper.selectByDirection(direction);
        log.info(""+jobList);
        return this.jobMapper.selectByDirection(direction);
    }

    @Override
    public List <Job> select() {
        return this.jobMapper.select();
    }

    @Override
    public String selectById(Integer id) {
        return this.jobMapper.selectById(id);
    }

    @Override
    public int insert(Job job) {
        return this.jobMapper.insert(job);
    }
}
