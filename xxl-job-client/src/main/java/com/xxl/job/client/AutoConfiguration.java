package com.xxl.job.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author alan
 * @type AutoConfiguration.java
 * @desc
 * @date 2020/8/2 23:26
 */
@Configuration
@EnableFeignClients(value = "com.xxl.job.client.service")
@ComponentScan(basePackages = {"com.xxl.job.client.service", "com.xxl.job.client.config"})
public class AutoConfiguration {
}