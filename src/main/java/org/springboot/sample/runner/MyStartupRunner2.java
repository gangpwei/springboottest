package org.springboot.sample.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月9日
 */
@Component
@Order(value=1)
public class MyStartupRunner2 implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(MyStartupRunner2.class);

    @Override
    public void run(String... args) throws Exception {
        log.info(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 2222222222 <<<<<<<<<<<<<");
    }

}