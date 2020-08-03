package com.xxl.job.client.service;

import com.xxl.job.client.config.FeignClientConfig;
import com.xxl.job.client.model.XxlJobInfo;
import com.xxl.job.client.service.impl.JobInfoServiceFallback;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author alan
 * @type JobInfoService.java
 * @desc
 * @date 2020/8/2 23:29
 */
@FeignClient(name = "xxl-job-admin", path = "/xxl-job-admin/jobinfo",
        configuration = FeignClientConfig.class,
        fallback = JobInfoServiceFallback.class
)
public interface JobInfoService {

    @RequestMapping(value = "/add",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    ReturnT<String> add(@RequestBody XxlJobInfo jobInfo);

    @RequestMapping(value = "/update",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    ReturnT<String> update(@RequestParam(value ="id") XxlJobInfo jobInfo);

    @RequestMapping(value = "/remove",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    ReturnT<String> remove(@RequestParam(value ="id") int id);

    @RequestMapping(value = "/stop",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    ReturnT<String> pause(@RequestParam(value ="id") int id);

    @RequestMapping(value = "/start",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    ReturnT<String> start(@RequestParam(value ="id") int id);
}