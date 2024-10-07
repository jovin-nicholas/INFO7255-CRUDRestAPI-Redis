package com.info7255.springdataredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jovinnicholas
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    private PlanCostShare planCostShares;
    private List<PlanService> linkedPlanServices;
    private String _org;
    private String objectId;
    private String objectType;
    private String planType;
    private String creationDate;
}