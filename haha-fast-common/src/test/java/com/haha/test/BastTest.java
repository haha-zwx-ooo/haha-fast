package com.haha.test;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 你皮
 * @createTime 2023年05月15日 10:36:00
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BastTest {
    @Value("${spring.profiles.active}")
    private String env;

    private long start;

    @Before
    public void doBefore() {
        log.info("当前环境: {}", env);
        log.info("测试开始--------------{}", DateUtil.now());
        start = System.currentTimeMillis();
    }

    @After
    public void doAfter() {
        log.info("测试结束--------------{}", DateUtil.now());
        long end = System.currentTimeMillis();
        log.info("执行耗时: {}ms", end - start);
    }
}
