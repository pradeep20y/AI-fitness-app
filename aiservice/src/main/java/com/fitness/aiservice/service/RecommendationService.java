
package com.fitness.aiservice.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.fitness.aiservice.Repository.RecommendationRepository;
import com.fitness.aiservice.model.Recommendations;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;

    public List<Recommendations> getUserRecommendation(String userId) {

        return recommendationRepository.findByUserId(userId);
    }

    public Recommendations getActivityRecommendation(String activityId) {
        return recommendationRepository.findByActivityId(activityId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "No recommendation found for activityId: " + activityId));
    }

}
