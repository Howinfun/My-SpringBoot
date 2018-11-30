package com.hyf.myspringboot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/29
 * @company XMJBQ
 */

//@Component
public class AsyncTask {

    private static final Logger logger = LoggerFactory.getLogger(AsyncTask.class);

    @Async //异步执行,两个任务相隔1s
    @Scheduled(cron = "0/1 * * * * *")
    public void scheduledTask1() throws  Exception{
        Thread.sleep(3000);
        logger.info("scheduledTask1  每一秒执行一次:{}", LocalDateTime.now());
    }

    //@Async 因为不是异步执行的，两个任务相隔3s
    @Scheduled(fixedRate = 1000)
    public void scheduledTask2() throws  Exception{
        Thread.sleep(3000);
        logger.info("scheduledTask2  每一秒执行一次:{}", LocalDateTime.now());
    }

    @Async //异步执行 两个任务相隔3s，如果不是异步执行，两个任务相隔8s
    @Scheduled(fixedDelay = 3000)
    public void scheduledTask3() throws  Exception{
        Thread.sleep(5000);
        logger.info("scheduledTask3 上次执行完毕后隔3秒继续执行：{}", LocalDateTime.now());
    }
}
