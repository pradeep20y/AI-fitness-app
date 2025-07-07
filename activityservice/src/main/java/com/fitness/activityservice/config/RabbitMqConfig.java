package com.fitness.activityservice.config;

import org.springframework.context.annotation.Bean;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration

@Bean
public class RabbitMqConfig {
    public Queue activityQueue() {
        return new Queue("activity.queue", true);
    }
}
