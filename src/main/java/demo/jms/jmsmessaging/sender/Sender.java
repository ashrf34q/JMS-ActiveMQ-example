package demo.jms.jmsmessaging.sender;

import demo.jms.jmsmessaging.config.JmsConfig;
import demo.jms.jmsmessaging.model.MessagingExample;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Sender {

    private final JmsTemplate jmsTemplate;

    public Sender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("Sending a message");

        MessagingExample message = MessagingExample.builder()
                .uuid(UUID.randomUUID()).message("My first JMS message").build();

        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message);

    }
}
