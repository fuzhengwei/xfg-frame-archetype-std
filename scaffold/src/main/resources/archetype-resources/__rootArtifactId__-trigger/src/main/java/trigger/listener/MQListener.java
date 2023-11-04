#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.trigger.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * RocketMQ 接收消息
 * @author Fuzhengwei bugstack.cn @小傅哥
 */
@Component
@Slf4j
@RocketMQMessageListener(topic = "xfg-mq", consumerGroup = "xfg-group")
public class MQListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("接收到RocketMQ消息 {}", s);
    }

}
