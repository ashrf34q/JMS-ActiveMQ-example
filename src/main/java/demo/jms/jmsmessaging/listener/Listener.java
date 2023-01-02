package demo.jms.jmsmessaging.listener;

import demo.jms.jmsmessaging.config.JmsConfig;
import demo.jms.jmsmessaging.model.MessagingExample;
import jakarta.jms.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload MessagingExample firstMessage, @Headers MessageHeaders headers, Message message) {
        System.out.println("I got a message!!!!");
        System.out.println(firstMessage);
    }
}
