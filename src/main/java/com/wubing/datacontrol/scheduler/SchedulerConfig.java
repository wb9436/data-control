package com.wubing.datacontrol.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: WB
 * @Date: 2018/8/16 14:41
 * @Description: Spring Task spring定时任务
 */
@Configuration
@EnableScheduling
public class SchedulerConfig {
    private int count = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + "this is scheduler task runing  " + (count++));
    }

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 6000)//上一次开始执行时间点后每隔6秒执行一次。
//　　@Scheduled(fixedDelay = 6000)//上一次执行完毕时间点之后6秒再执行。
//    @Scheduled(initialDelay=1000, fixedRate=6000)//第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次。
    @Scheduled(initialDelay = 1000, fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + "现在时间：" + dateFormat.format(new Date()));
    }

}
