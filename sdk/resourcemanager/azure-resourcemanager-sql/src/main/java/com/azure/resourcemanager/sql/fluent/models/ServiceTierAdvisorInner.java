// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.SloUsageMetric;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Represents a Service Tier Advisor. */
@Immutable
public final class ServiceTierAdvisorInner extends ProxyResource {
    /*
     * The properties representing the resource.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceTierAdvisorProperties innerProperties;

    /**
     * Get the innerProperties property: The properties representing the resource.
     *
     * @return the innerProperties value.
     */
    private ServiceTierAdvisorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the observationPeriodStart property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodStart value.
     */
    public OffsetDateTime observationPeriodStart() {
        return this.innerProperties() == null ? null : this.innerProperties().observationPeriodStart();
    }

    /**
     * Get the observationPeriodEnd property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodEnd value.
     */
    public OffsetDateTime observationPeriodEnd() {
        return this.innerProperties() == null ? null : this.innerProperties().observationPeriodEnd();
    }

    /**
     * Get the activeTimeRatio property: The activeTimeRatio for service tier advisor.
     *
     * @return the activeTimeRatio value.
     */
    public Double activeTimeRatio() {
        return this.innerProperties() == null ? null : this.innerProperties().activeTimeRatio();
    }

    /**
     * Get the minDtu property: Gets or sets minDtu for service tier advisor.
     *
     * @return the minDtu value.
     */
    public Double minDtu() {
        return this.innerProperties() == null ? null : this.innerProperties().minDtu();
    }

    /**
     * Get the avgDtu property: Gets or sets avgDtu for service tier advisor.
     *
     * @return the avgDtu value.
     */
    public Double avgDtu() {
        return this.innerProperties() == null ? null : this.innerProperties().avgDtu();
    }

    /**
     * Get the maxDtu property: Gets or sets maxDtu for service tier advisor.
     *
     * @return the maxDtu value.
     */
    public Double maxDtu() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDtu();
    }

    /**
     * Get the maxSizeInGB property: Gets or sets maxSizeInGB for service tier advisor.
     *
     * @return the maxSizeInGB value.
     */
    public Double maxSizeInGB() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeInGB();
    }

    /**
     * Get the serviceLevelObjectiveUsageMetrics property: Gets or sets serviceLevelObjectiveUsageMetrics for the
     * service tier advisor.
     *
     * @return the serviceLevelObjectiveUsageMetrics value.
     */
    public List<SloUsageMetric> serviceLevelObjectiveUsageMetrics() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelObjectiveUsageMetrics();
    }

    /**
     * Get the currentServiceLevelObjective property: Gets or sets currentServiceLevelObjective for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjective value.
     */
    public String currentServiceLevelObjective() {
        return this.innerProperties() == null ? null : this.innerProperties().currentServiceLevelObjective();
    }

    /**
     * Get the currentServiceLevelObjectiveId property: Gets or sets currentServiceLevelObjectiveId for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjectiveId value.
     */
    public UUID currentServiceLevelObjectiveId() {
        return this.innerProperties() == null ? null : this.innerProperties().currentServiceLevelObjectiveId();
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjective property: Gets or sets
     * usageBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjective value.
     */
    public String usageBasedRecommendationServiceLevelObjective() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().usageBasedRecommendationServiceLevelObjective();
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * usageBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID usageBasedRecommendationServiceLevelObjectiveId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().usageBasedRecommendationServiceLevelObjectiveId();
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjective property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjective value.
     */
    public String databaseSizeBasedRecommendationServiceLevelObjective() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().databaseSizeBasedRecommendationServiceLevelObjective();
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID databaseSizeBasedRecommendationServiceLevelObjectiveId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().databaseSizeBasedRecommendationServiceLevelObjectiveId();
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjective property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjective value.
     */
    public String disasterPlanBasedRecommendationServiceLevelObjective() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().disasterPlanBasedRecommendationServiceLevelObjective();
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID disasterPlanBasedRecommendationServiceLevelObjectiveId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().disasterPlanBasedRecommendationServiceLevelObjectiveId();
    }

    /**
     * Get the overallRecommendationServiceLevelObjective property: Gets or sets
     * overallRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjective value.
     */
    public String overallRecommendationServiceLevelObjective() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().overallRecommendationServiceLevelObjective();
    }

    /**
     * Get the overallRecommendationServiceLevelObjectiveId property: Gets or sets
     * overallRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjectiveId value.
     */
    public UUID overallRecommendationServiceLevelObjectiveId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().overallRecommendationServiceLevelObjectiveId();
    }

    /**
     * Get the confidence property: Gets or sets confidence for service tier advisor.
     *
     * @return the confidence value.
     */
    public Double confidence() {
        return this.innerProperties() == null ? null : this.innerProperties().confidence();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}