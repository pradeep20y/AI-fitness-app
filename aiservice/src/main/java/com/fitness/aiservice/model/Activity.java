package com.fitness.aiservice.model;

import java.time.LocalDateTime;
import java.util.Map;
import org.bson.types.ObjectId;
import lombok.Data;

@Data
public class Activity {
    private String id;
    private String userId;
    private String type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

}
