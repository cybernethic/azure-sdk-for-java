// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.QueryTimeGrainType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TopQueries model. */
@Fluent
public final class TopQueriesInner {
    /*
     * Requested number of top queries.
     */
    @JsonProperty(value = "numberOfQueries", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfQueries;

    /*
     * Aggregation function used to calculate query metrics.
     */
    @JsonProperty(value = "aggregationFunction", access = JsonProperty.Access.WRITE_ONLY)
    private String aggregationFunction;

    /*
     * Metric used to rank queries.
     */
    @JsonProperty(value = "observationMetric", access = JsonProperty.Access.WRITE_ONLY)
    private String observationMetric;

    /*
     * Interval type (length).
     */
    @JsonProperty(value = "intervalType", access = JsonProperty.Access.WRITE_ONLY)
    private QueryTimeGrainType intervalType;

    /*
     * The start time for the metric (ISO-8601 format).
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /*
     * The end time for the metric (ISO-8601 format).
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private String endTime;

    /*
     * List of top resource consuming queries with appropriate metric data
     */
    @JsonProperty(value = "queries")
    private List<QueryStatisticsProperties> queries;

    /** Creates an instance of TopQueriesInner class. */
    public TopQueriesInner() {
    }

    /**
     * Get the numberOfQueries property: Requested number of top queries.
     *
     * @return the numberOfQueries value.
     */
    public Integer numberOfQueries() {
        return this.numberOfQueries;
    }

    /**
     * Get the aggregationFunction property: Aggregation function used to calculate query metrics.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * Get the observationMetric property: Metric used to rank queries.
     *
     * @return the observationMetric value.
     */
    public String observationMetric() {
        return this.observationMetric;
    }

    /**
     * Get the intervalType property: Interval type (length).
     *
     * @return the intervalType value.
     */
    public QueryTimeGrainType intervalType() {
        return this.intervalType;
    }

    /**
     * Get the startTime property: The start time for the metric (ISO-8601 format).
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time for the metric (ISO-8601 format).
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Get the queries property: List of top resource consuming queries with appropriate metric data.
     *
     * @return the queries value.
     */
    public List<QueryStatisticsProperties> queries() {
        return this.queries;
    }

    /**
     * Set the queries property: List of top resource consuming queries with appropriate metric data.
     *
     * @param queries the queries value to set.
     * @return the TopQueriesInner object itself.
     */
    public TopQueriesInner withQueries(List<QueryStatisticsProperties> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queries() != null) {
            queries().forEach(e -> e.validate());
        }
    }
}