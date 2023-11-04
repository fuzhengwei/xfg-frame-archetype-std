package cn.bugstack.trigger.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * XXL-Job
 */
@Slf4j
@Component
public class XXLJob {

    @XxlJob("demoJobHandler")
    public void doJob() {
        // 可以在任务中，调用一些业务方法逻辑的实现，如定时扫描超时未支付订单为关单处理，恢复库存
        log.info("执行任务 - XXL-Job - 01");
    }

}
