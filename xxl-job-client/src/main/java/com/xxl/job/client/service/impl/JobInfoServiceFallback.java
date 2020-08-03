package com.xxl.job.client.service.impl;

import com.xxl.job.client.model.XxlJobInfo;
import com.xxl.job.client.service.JobInfoService;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.stereotype.Component;

/**
 * @author alan
 * @type JobInfoServiceFallback.java
 * @desc
 * @date 2020/8/2 23:34
 */
@Component
public class JobInfoServiceFallback implements JobInfoService {
    @Override
    public ReturnT<String> add(XxlJobInfo jobInfo) {
        return new ReturnT<String>(ReturnT.FAIL_CODE, null);
    }

    @Override
    public ReturnT<String> update(XxlJobInfo jobInfo) {
        return new ReturnT<String>(ReturnT.FAIL_CODE, null);
    }

    @Override
    public ReturnT<String> remove(int id) {
        return new ReturnT<String>(ReturnT.FAIL_CODE, null);
    }

    @Override
    public ReturnT<String> pause(int id) {
        return new ReturnT<String>(ReturnT.FAIL_CODE, null);
    }

    @Override
    public ReturnT<String> start(int id) {
        return new ReturnT<String>(ReturnT.FAIL_CODE, null);
    }
}