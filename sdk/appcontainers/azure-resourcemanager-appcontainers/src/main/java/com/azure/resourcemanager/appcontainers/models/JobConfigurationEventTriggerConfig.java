// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trigger configuration of an event driven job. */
@Fluent
public final class JobConfigurationEventTriggerConfig {
    /*
     * Minimum number of successful replica completions before overall job completion.
     */
    @JsonProperty(value = "replicaCompletionCount")
    private Integer replicaCompletionCount;

    /*
     * Number of parallel replicas of a job that can run at a given time.
     */
    @JsonProperty(value = "parallelism")
    private Integer parallelism;

    /*
     * Scaling configurations for event driven jobs.
     */
    @JsonProperty(value = "scale")
    private JobScale scale;

    /** Creates an instance of JobConfigurationEventTriggerConfig class. */
    public JobConfigurationEventTriggerConfig() {
    }

    /**
     * Get the replicaCompletionCount property: Minimum number of successful replica completions before overall job
     * completion.
     *
     * @return the replicaCompletionCount value.
     */
    public Integer replicaCompletionCount() {
        return this.replicaCompletionCount;
    }

    /**
     * Set the replicaCompletionCount property: Minimum number of successful replica completions before overall job
     * completion.
     *
     * @param replicaCompletionCount the replicaCompletionCount value to set.
     * @return the JobConfigurationEventTriggerConfig object itself.
     */
    public JobConfigurationEventTriggerConfig withReplicaCompletionCount(Integer replicaCompletionCount) {
        this.replicaCompletionCount = replicaCompletionCount;
        return this;
    }

    /**
     * Get the parallelism property: Number of parallel replicas of a job that can run at a given time.
     *
     * @return the parallelism value.
     */
    public Integer parallelism() {
        return this.parallelism;
    }

    /**
     * Set the parallelism property: Number of parallel replicas of a job that can run at a given time.
     *
     * @param parallelism the parallelism value to set.
     * @return the JobConfigurationEventTriggerConfig object itself.
     */
    public JobConfigurationEventTriggerConfig withParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
     * Get the scale property: Scaling configurations for event driven jobs.
     *
     * @return the scale value.
     */
    public JobScale scale() {
        return this.scale;
    }

    /**
     * Set the scale property: Scaling configurations for event driven jobs.
     *
     * @param scale the scale value to set.
     * @return the JobConfigurationEventTriggerConfig object itself.
     */
    public JobConfigurationEventTriggerConfig withScale(JobScale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scale() != null) {
            scale().validate();
        }
    }
}
