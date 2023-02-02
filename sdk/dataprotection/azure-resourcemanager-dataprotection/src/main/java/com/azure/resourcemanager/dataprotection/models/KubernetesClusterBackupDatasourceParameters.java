// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Parameters for Kubernetes Cluster Backup Datasource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("KubernetesClusterBackupDatasourceParameters")
@Fluent
public final class KubernetesClusterBackupDatasourceParameters extends BackupDatasourceParameters {
    /*
     * Gets or sets the volume snapshot property. This property if enabled will take volume snapshots during restore.
     */
    @JsonProperty(value = "snapshotVolumes", required = true)
    private boolean snapshotVolumes;

    /*
     * Gets or sets the include cluster resources property. This property if enabled will include cluster scope
     * resources during restore.
     */
    @JsonProperty(value = "includeClusterScopeResources", required = true)
    private boolean includeClusterScopeResources;

    /*
     * Gets or sets the include namespaces property. This property sets the namespaces to be included during restore.
     */
    @JsonProperty(value = "includedNamespaces")
    private List<String> includedNamespaces;

    /*
     * Gets or sets the exclude namespaces property. This property sets the namespaces to be excluded during restore.
     */
    @JsonProperty(value = "excludedNamespaces")
    private List<String> excludedNamespaces;

    /*
     * Gets or sets the include resource types property. This property sets the resource types to be included during
     * restore.
     */
    @JsonProperty(value = "includedResourceTypes")
    private List<String> includedResourceTypes;

    /*
     * Gets or sets the exclude resource types property. This property sets the resource types to be excluded during
     * restore.
     */
    @JsonProperty(value = "excludedResourceTypes")
    private List<String> excludedResourceTypes;

    /*
     * Gets or sets the LabelSelectors property. This property sets the resource with such label selectors to be
     * included during restore.
     */
    @JsonProperty(value = "labelSelectors")
    private List<String> labelSelectors;

    /** Creates an instance of KubernetesClusterBackupDatasourceParameters class. */
    public KubernetesClusterBackupDatasourceParameters() {
    }

    /**
     * Get the snapshotVolumes property: Gets or sets the volume snapshot property. This property if enabled will take
     * volume snapshots during restore.
     *
     * @return the snapshotVolumes value.
     */
    public boolean snapshotVolumes() {
        return this.snapshotVolumes;
    }

    /**
     * Set the snapshotVolumes property: Gets or sets the volume snapshot property. This property if enabled will take
     * volume snapshots during restore.
     *
     * @param snapshotVolumes the snapshotVolumes value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withSnapshotVolumes(boolean snapshotVolumes) {
        this.snapshotVolumes = snapshotVolumes;
        return this;
    }

    /**
     * Get the includeClusterScopeResources property: Gets or sets the include cluster resources property. This property
     * if enabled will include cluster scope resources during restore.
     *
     * @return the includeClusterScopeResources value.
     */
    public boolean includeClusterScopeResources() {
        return this.includeClusterScopeResources;
    }

    /**
     * Set the includeClusterScopeResources property: Gets or sets the include cluster resources property. This property
     * if enabled will include cluster scope resources during restore.
     *
     * @param includeClusterScopeResources the includeClusterScopeResources value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withIncludeClusterScopeResources(
        boolean includeClusterScopeResources) {
        this.includeClusterScopeResources = includeClusterScopeResources;
        return this;
    }

    /**
     * Get the includedNamespaces property: Gets or sets the include namespaces property. This property sets the
     * namespaces to be included during restore.
     *
     * @return the includedNamespaces value.
     */
    public List<String> includedNamespaces() {
        return this.includedNamespaces;
    }

    /**
     * Set the includedNamespaces property: Gets or sets the include namespaces property. This property sets the
     * namespaces to be included during restore.
     *
     * @param includedNamespaces the includedNamespaces value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withIncludedNamespaces(List<String> includedNamespaces) {
        this.includedNamespaces = includedNamespaces;
        return this;
    }

    /**
     * Get the excludedNamespaces property: Gets or sets the exclude namespaces property. This property sets the
     * namespaces to be excluded during restore.
     *
     * @return the excludedNamespaces value.
     */
    public List<String> excludedNamespaces() {
        return this.excludedNamespaces;
    }

    /**
     * Set the excludedNamespaces property: Gets or sets the exclude namespaces property. This property sets the
     * namespaces to be excluded during restore.
     *
     * @param excludedNamespaces the excludedNamespaces value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withExcludedNamespaces(List<String> excludedNamespaces) {
        this.excludedNamespaces = excludedNamespaces;
        return this;
    }

    /**
     * Get the includedResourceTypes property: Gets or sets the include resource types property. This property sets the
     * resource types to be included during restore.
     *
     * @return the includedResourceTypes value.
     */
    public List<String> includedResourceTypes() {
        return this.includedResourceTypes;
    }

    /**
     * Set the includedResourceTypes property: Gets or sets the include resource types property. This property sets the
     * resource types to be included during restore.
     *
     * @param includedResourceTypes the includedResourceTypes value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withIncludedResourceTypes(List<String> includedResourceTypes) {
        this.includedResourceTypes = includedResourceTypes;
        return this;
    }

    /**
     * Get the excludedResourceTypes property: Gets or sets the exclude resource types property. This property sets the
     * resource types to be excluded during restore.
     *
     * @return the excludedResourceTypes value.
     */
    public List<String> excludedResourceTypes() {
        return this.excludedResourceTypes;
    }

    /**
     * Set the excludedResourceTypes property: Gets or sets the exclude resource types property. This property sets the
     * resource types to be excluded during restore.
     *
     * @param excludedResourceTypes the excludedResourceTypes value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withExcludedResourceTypes(List<String> excludedResourceTypes) {
        this.excludedResourceTypes = excludedResourceTypes;
        return this;
    }

    /**
     * Get the labelSelectors property: Gets or sets the LabelSelectors property. This property sets the resource with
     * such label selectors to be included during restore.
     *
     * @return the labelSelectors value.
     */
    public List<String> labelSelectors() {
        return this.labelSelectors;
    }

    /**
     * Set the labelSelectors property: Gets or sets the LabelSelectors property. This property sets the resource with
     * such label selectors to be included during restore.
     *
     * @param labelSelectors the labelSelectors value to set.
     * @return the KubernetesClusterBackupDatasourceParameters object itself.
     */
    public KubernetesClusterBackupDatasourceParameters withLabelSelectors(List<String> labelSelectors) {
        this.labelSelectors = labelSelectors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}