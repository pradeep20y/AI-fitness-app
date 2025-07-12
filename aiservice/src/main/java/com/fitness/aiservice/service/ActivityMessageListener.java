package com.fitness.aiservice.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.fitness.aiservice.Repository.RecommendationRepository;
import com.fitness.aiservice.model.Activity;
import com.fitness.aiservice.model.Recommendations;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActivityMessageListener {

    private final ActivityAiService activityAiService;
    private final RecommendationRepository recommendationRepository;

    @RabbitListener(queues = "activity.queue")
    public void processActivity(Activity activity) {
        log.info("Received activity for processing : {}", activity.getId());
        // log.info("Receive AI response :",
        // activityAiService.generateRecommendation(activity));

        Recommendations recommendations = activityAiService.generateRecommendation(activity);
        recommendationRepository.save(recommendations);
        log.info("damn it");

    }
}
