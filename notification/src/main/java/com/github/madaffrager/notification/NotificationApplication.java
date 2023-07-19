package com.github.madaffrager.notification;

import com.github.madaffrager.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.github.madaffrager.notification",
                "com.github.madaffrager.amqp"
        }

)
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer rabbitMQMessageProducer,
//                                        NotificationConfig notificationConfig) {
//        return args -> {
//            rabbitMQMessageProducer.publish(
//                    new Person("Ali",17),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey()
//            );
//        };
//    }
//    record Person (String name, Integer age){
//
//    }
}