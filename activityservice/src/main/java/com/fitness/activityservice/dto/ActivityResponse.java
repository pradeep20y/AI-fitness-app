package com.fitness.activityservice.dto;

import java.time.LocalDateTime;
import java.util.Map;

import org.bson.types.ObjectId;

import com.fitness.activityservice.model.ActivityType;

import lombok.Data;

@Data
public class ActivityResponse {

    private String Id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;

    private Map<String, Object> additionalMetrics;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;
}
