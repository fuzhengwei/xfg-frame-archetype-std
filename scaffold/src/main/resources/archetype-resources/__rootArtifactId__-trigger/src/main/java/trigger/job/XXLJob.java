#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.trigger.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * XXL-Job
 */
@Slf4j
@Component
public class XXLJob {

    @Setter(onMethod_ = @Autowired)
    private RocketMQTemplate rocketmqTemplate;

    @XxlJob("demoJobHandler")
    public void doJob() {
        // 可以在任务中，调用一些业务方法逻辑的实现，如定时扫描超时未支付订单为关单处理，恢复库存
        log.info("执行任务 - XXL-Job - 01 发送一条MQ消息");
        // 发送MQ消息
        rocketmqTemplate.convertAndSend("xfg-mq", "我是测试消息");
    }

}
