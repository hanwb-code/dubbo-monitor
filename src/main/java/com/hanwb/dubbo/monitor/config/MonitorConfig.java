package com.hanwb.dubbo.monitor.config;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.hanwb.dubbo.monitor"}, includeFilters = {@ComponentScan.Filter(value = Service.class)})
@Import({WebConfig.class, DubboConfig.class, MyBatisConfig.class, Security.class})
@PropertySource("classpath:/application.properties")
public class MonitorConfig {
}
