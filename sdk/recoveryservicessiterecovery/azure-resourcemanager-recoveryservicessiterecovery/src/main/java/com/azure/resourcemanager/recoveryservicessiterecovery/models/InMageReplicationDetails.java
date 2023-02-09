// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** InMage provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
@Fluent
public final class InMageReplicationDetails extends ReplicationProviderSpecificSettings {
    /*
     * The active location of the VM. If the VM is being protected from Azure, this field will take values from {
     * Azure, OnPrem }. If the VM is being protected between two data-centers, this field will be OnPrem always.
     */
    @JsonProperty(value = "activeSiteType")
    private String activeSiteType;

    /*
     * The CPU count of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmCpuCount")
    private Integer sourceVmCpuCount;

    /*
     * The RAM size of the VM on the primary side.
     */
    @JsonProperty(value = "sourceVmRamSizeInMB")
    private Integer sourceVmRamSizeInMB;

    /*
     * The OS details.
     */
    @JsonProperty(value = "osDetails")
    private OSDiskDetails osDetails;

    /*
     * The protection stage.
     */
    @JsonProperty(value = "protectionStage")
    private String protectionStage;

    /*
     * The virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /*
     * The protection state for the vm.
     */
    @JsonProperty(value = "vmProtectionState")
    private String vmProtectionState;

    /*
     * The protection state description for the vm.
     */
    @JsonProperty(value = "vmProtectionStateDescription")
    private String vmProtectionStateDescription;

    /*
     * The resync details of the machine.
     */
    @JsonProperty(value = "resyncDetails")
    private InitialReplicationDetails resyncDetails;

    /*
     * The retention window start time.
     */
    @JsonProperty(value = "retentionWindowStart")
    private OffsetDateTime retentionWindowStart;

    /*
     * The retention window end time.
     */
    @JsonProperty(value = "retentionWindowEnd")
    private OffsetDateTime retentionWindowEnd;

    /*
     * The compressed data change rate in MB.
     */
    @JsonProperty(value = "compressedDataRateInMB")
    private Double compressedDataRateInMB;

    /*
     * The uncompressed data change rate in MB.
     */
    @JsonProperty(value = "uncompressedDataRateInMB")
    private Double uncompressedDataRateInMB;

    /*
     * The RPO in seconds.
     */
    @JsonProperty(value = "rpoInSeconds")
    private Long rpoInSeconds;

    /*
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks")
    private List<InMageProtectedDiskDetails> protectedDisks;

    /*
     * The source IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The last heartbeat received from the source server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private OffsetDateTime lastHeartbeat;

    /*
     * The process server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /*
     * The master target Id.
     */
    @JsonProperty(value = "masterTargetId")
    private String masterTargetId;

    /*
     * The collection of Consistency points.
     */
    @JsonProperty(value = "consistencyPoints")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, OffsetDateTime> consistencyPoints;

    /*
     * A value indicating whether any disk is resized for this VM.
     */
    @JsonProperty(value = "diskResized")
    private String diskResized;

    /*
     * A value indicating whether the source server requires a restart after update.
     */
    @JsonProperty(value = "rebootAfterUpdateStatus")
    private String rebootAfterUpdateStatus;

    /*
     * The multi vm group Id, if any.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /*
     * The multi vm group name, if any.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /*
     * A value indicating whether the multi vm sync is enabled or disabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

    /*
     * The agent details.
     */
    @JsonProperty(value = "agentDetails")
    private InMageAgentDetails agentDetails;

    /*
     * The vCenter infrastructure Id.
     */
    @JsonProperty(value = "vCenterInfrastructureId")
    private String vCenterInfrastructureId;

    /*
     * The infrastructure VM Id.
     */
    @JsonProperty(value = "infrastructureVmId")
    private String infrastructureVmId;

    /*
     * The PE Network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicDetails> vmNics;

    /*
     * A value indicating the discovery type of the machine.
     */
    @JsonProperty(value = "discoveryType")
    private String discoveryType;

    /*
     * A value indicating the underlying Azure storage account. If the VM is not running in Azure, this value shall be
     * set to null.
     */
    @JsonProperty(value = "azureStorageAccountId")
    private String azureStorageAccountId;

    /*
     * The datastores of the on-premise machine Value can be list of strings that contain datastore names.
     */
    @JsonProperty(value = "datastores")
    private List<String> datastores;

    /*
     * The validation errors of the on-premise machine Value can be list of validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /*
     * The last RPO calculated time.
     */
    @JsonProperty(value = "lastRpoCalculatedTime")
    private OffsetDateTime lastRpoCalculatedTime;

    /*
     * The last update time received from on-prem components.
     */
    @JsonProperty(value = "lastUpdateReceivedTime")
    private OffsetDateTime lastUpdateReceivedTime;

    /*
     * The replica id of the protected item.
     */
    @JsonProperty(value = "replicaId")
    private String replicaId;

    /*
     * The OS Version of the protected item.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /*
     * A value indicating whether additional IR stats are available or not.
     */
    @JsonProperty(value = "isAdditionalStatsAvailable")
    private Boolean isAdditionalStatsAvailable;

    /*
     * The total transferred data in bytes.
     */
    @JsonProperty(value = "totalDataTransferred")
    private Long totalDataTransferred;

    /*
     * The progress health.
     */
    @JsonProperty(value = "totalProgressHealth")
    private String totalProgressHealth;

    /** Creates an instance of InMageReplicationDetails class. */
    public InMageReplicationDetails() {
    }

    /**
     * Get the activeSiteType property: The active location of the VM. If the VM is being protected from Azure, this
     * field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field
     * will be OnPrem always.
     *
     * @return the activeSiteType value.
     */
    public String activeSiteType() {
        return this.activeSiteType;
    }

    /**
     * Set the activeSiteType property: The active location of the VM. If the VM is being protected from Azure, this
     * field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field
     * will be OnPrem always.
     *
     * @param activeSiteType the activeSiteType value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withActiveSiteType(String activeSiteType) {
        this.activeSiteType = activeSiteType;
        return this;
    }

    /**
     * Get the sourceVmCpuCount property: The CPU count of the VM on the primary side.
     *
     * @return the sourceVmCpuCount value.
     */
    public Integer sourceVmCpuCount() {
        return this.sourceVmCpuCount;
    }

    /**
     * Set the sourceVmCpuCount property: The CPU count of the VM on the primary side.
     *
     * @param sourceVmCpuCount the sourceVmCpuCount value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withSourceVmCpuCount(Integer sourceVmCpuCount) {
        this.sourceVmCpuCount = sourceVmCpuCount;
        return this;
    }

    /**
     * Get the sourceVmRamSizeInMB property: The RAM size of the VM on the primary side.
     *
     * @return the sourceVmRamSizeInMB value.
     */
    public Integer sourceVmRamSizeInMB() {
        return this.sourceVmRamSizeInMB;
    }

    /**
     * Set the sourceVmRamSizeInMB property: The RAM size of the VM on the primary side.
     *
     * @param sourceVmRamSizeInMB the sourceVmRamSizeInMB value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withSourceVmRamSizeInMB(Integer sourceVmRamSizeInMB) {
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        return this;
    }

    /**
     * Get the osDetails property: The OS details.
     *
     * @return the osDetails value.
     */
    public OSDiskDetails osDetails() {
        return this.osDetails;
    }

    /**
     * Set the osDetails property: The OS details.
     *
     * @param osDetails the osDetails value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withOsDetails(OSDiskDetails osDetails) {
        this.osDetails = osDetails;
        return this;
    }

    /**
     * Get the protectionStage property: The protection stage.
     *
     * @return the protectionStage value.
     */
    public String protectionStage() {
        return this.protectionStage;
    }

    /**
     * Set the protectionStage property: The protection stage.
     *
     * @param protectionStage the protectionStage value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProtectionStage(String protectionStage) {
        this.protectionStage = protectionStage;
        return this;
    }

    /**
     * Get the vmId property: The virtual machine Id.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the vmId property: The virtual machine Id.
     *
     * @param vmId the vmId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the vmProtectionState property: The protection state for the vm.
     *
     * @return the vmProtectionState value.
     */
    public String vmProtectionState() {
        return this.vmProtectionState;
    }

    /**
     * Set the vmProtectionState property: The protection state for the vm.
     *
     * @param vmProtectionState the vmProtectionState value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmProtectionState(String vmProtectionState) {
        this.vmProtectionState = vmProtectionState;
        return this;
    }

    /**
     * Get the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @return the vmProtectionStateDescription value.
     */
    public String vmProtectionStateDescription() {
        return this.vmProtectionStateDescription;
    }

    /**
     * Set the vmProtectionStateDescription property: The protection state description for the vm.
     *
     * @param vmProtectionStateDescription the vmProtectionStateDescription value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmProtectionStateDescription(String vmProtectionStateDescription) {
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        return this;
    }

    /**
     * Get the resyncDetails property: The resync details of the machine.
     *
     * @return the resyncDetails value.
     */
    public InitialReplicationDetails resyncDetails() {
        return this.resyncDetails;
    }

    /**
     * Set the resyncDetails property: The resync details of the machine.
     *
     * @param resyncDetails the resyncDetails value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withResyncDetails(InitialReplicationDetails resyncDetails) {
        this.resyncDetails = resyncDetails;
        return this;
    }

    /**
     * Get the retentionWindowStart property: The retention window start time.
     *
     * @return the retentionWindowStart value.
     */
    public OffsetDateTime retentionWindowStart() {
        return this.retentionWindowStart;
    }

    /**
     * Set the retentionWindowStart property: The retention window start time.
     *
     * @param retentionWindowStart the retentionWindowStart value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRetentionWindowStart(OffsetDateTime retentionWindowStart) {
        this.retentionWindowStart = retentionWindowStart;
        return this;
    }

    /**
     * Get the retentionWindowEnd property: The retention window end time.
     *
     * @return the retentionWindowEnd value.
     */
    public OffsetDateTime retentionWindowEnd() {
        return this.retentionWindowEnd;
    }

    /**
     * Set the retentionWindowEnd property: The retention window end time.
     *
     * @param retentionWindowEnd the retentionWindowEnd value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRetentionWindowEnd(OffsetDateTime retentionWindowEnd) {
        this.retentionWindowEnd = retentionWindowEnd;
        return this;
    }

    /**
     * Get the compressedDataRateInMB property: The compressed data change rate in MB.
     *
     * @return the compressedDataRateInMB value.
     */
    public Double compressedDataRateInMB() {
        return this.compressedDataRateInMB;
    }

    /**
     * Set the compressedDataRateInMB property: The compressed data change rate in MB.
     *
     * @param compressedDataRateInMB the compressedDataRateInMB value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withCompressedDataRateInMB(Double compressedDataRateInMB) {
        this.compressedDataRateInMB = compressedDataRateInMB;
        return this;
    }

    /**
     * Get the uncompressedDataRateInMB property: The uncompressed data change rate in MB.
     *
     * @return the uncompressedDataRateInMB value.
     */
    public Double uncompressedDataRateInMB() {
        return this.uncompressedDataRateInMB;
    }

    /**
     * Set the uncompressedDataRateInMB property: The uncompressed data change rate in MB.
     *
     * @param uncompressedDataRateInMB the uncompressedDataRateInMB value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withUncompressedDataRateInMB(Double uncompressedDataRateInMB) {
        this.uncompressedDataRateInMB = uncompressedDataRateInMB;
        return this;
    }

    /**
     * Get the rpoInSeconds property: The RPO in seconds.
     *
     * @return the rpoInSeconds value.
     */
    public Long rpoInSeconds() {
        return this.rpoInSeconds;
    }

    /**
     * Set the rpoInSeconds property: The RPO in seconds.
     *
     * @param rpoInSeconds the rpoInSeconds value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRpoInSeconds(Long rpoInSeconds) {
        this.rpoInSeconds = rpoInSeconds;
        return this;
    }

    /**
     * Get the protectedDisks property: The list of protected disks.
     *
     * @return the protectedDisks value.
     */
    public List<InMageProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Set the protectedDisks property: The list of protected disks.
     *
     * @param protectedDisks the protectedDisks value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProtectedDisks(List<InMageProtectedDiskDetails> protectedDisks) {
        this.protectedDisks = protectedDisks;
        return this;
    }

    /**
     * Get the ipAddress property: The source IP address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The source IP address.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the lastHeartbeat property: The last heartbeat received from the source server.
     *
     * @return the lastHeartbeat value.
     */
    public OffsetDateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the lastHeartbeat property: The last heartbeat received from the source server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastHeartbeat(OffsetDateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the processServerId property: The process server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the processServerId property: The process server Id.
     *
     * @param processServerId the processServerId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the masterTargetId property: The master target Id.
     *
     * @return the masterTargetId value.
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the masterTargetId property: The master target Id.
     *
     * @param masterTargetId the masterTargetId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the consistencyPoints property: The collection of Consistency points.
     *
     * @return the consistencyPoints value.
     */
    public Map<String, OffsetDateTime> consistencyPoints() {
        return this.consistencyPoints;
    }

    /**
     * Set the consistencyPoints property: The collection of Consistency points.
     *
     * @param consistencyPoints the consistencyPoints value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withConsistencyPoints(Map<String, OffsetDateTime> consistencyPoints) {
        this.consistencyPoints = consistencyPoints;
        return this;
    }

    /**
     * Get the diskResized property: A value indicating whether any disk is resized for this VM.
     *
     * @return the diskResized value.
     */
    public String diskResized() {
        return this.diskResized;
    }

    /**
     * Set the diskResized property: A value indicating whether any disk is resized for this VM.
     *
     * @param diskResized the diskResized value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDiskResized(String diskResized) {
        this.diskResized = diskResized;
        return this;
    }

    /**
     * Get the rebootAfterUpdateStatus property: A value indicating whether the source server requires a restart after
     * update.
     *
     * @return the rebootAfterUpdateStatus value.
     */
    public String rebootAfterUpdateStatus() {
        return this.rebootAfterUpdateStatus;
    }

    /**
     * Set the rebootAfterUpdateStatus property: A value indicating whether the source server requires a restart after
     * update.
     *
     * @param rebootAfterUpdateStatus the rebootAfterUpdateStatus value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withRebootAfterUpdateStatus(String rebootAfterUpdateStatus) {
        this.rebootAfterUpdateStatus = rebootAfterUpdateStatus;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi vm group Id, if any.
     *
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi vm group Id, if any.
     *
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi vm group name, if any.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi vm group name, if any.
     *
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the multiVmSyncStatus property: A value indicating whether the multi vm sync is enabled or disabled.
     *
     * @return the multiVmSyncStatus value.
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus property: A value indicating whether the multi vm sync is enabled or disabled.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the agentDetails property: The agent details.
     *
     * @return the agentDetails value.
     */
    public InMageAgentDetails agentDetails() {
        return this.agentDetails;
    }

    /**
     * Set the agentDetails property: The agent details.
     *
     * @param agentDetails the agentDetails value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withAgentDetails(InMageAgentDetails agentDetails) {
        this.agentDetails = agentDetails;
        return this;
    }

    /**
     * Get the vCenterInfrastructureId property: The vCenter infrastructure Id.
     *
     * @return the vCenterInfrastructureId value.
     */
    public String vCenterInfrastructureId() {
        return this.vCenterInfrastructureId;
    }

    /**
     * Set the vCenterInfrastructureId property: The vCenter infrastructure Id.
     *
     * @param vCenterInfrastructureId the vCenterInfrastructureId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVCenterInfrastructureId(String vCenterInfrastructureId) {
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        return this;
    }

    /**
     * Get the infrastructureVmId property: The infrastructure VM Id.
     *
     * @return the infrastructureVmId value.
     */
    public String infrastructureVmId() {
        return this.infrastructureVmId;
    }

    /**
     * Set the infrastructureVmId property: The infrastructure VM Id.
     *
     * @param infrastructureVmId the infrastructureVmId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withInfrastructureVmId(String infrastructureVmId) {
        this.infrastructureVmId = infrastructureVmId;
        return this;
    }

    /**
     * Get the vmNics property: The PE Network details.
     *
     * @return the vmNics value.
     */
    public List<VMNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The PE Network details.
     *
     * @param vmNics the vmNics value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withVmNics(List<VMNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the discoveryType property: A value indicating the discovery type of the machine.
     *
     * @return the discoveryType value.
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Set the discoveryType property: A value indicating the discovery type of the machine.
     *
     * @param discoveryType the discoveryType value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDiscoveryType(String discoveryType) {
        this.discoveryType = discoveryType;
        return this;
    }

    /**
     * Get the azureStorageAccountId property: A value indicating the underlying Azure storage account. If the VM is not
     * running in Azure, this value shall be set to null.
     *
     * @return the azureStorageAccountId value.
     */
    public String azureStorageAccountId() {
        return this.azureStorageAccountId;
    }

    /**
     * Set the azureStorageAccountId property: A value indicating the underlying Azure storage account. If the VM is not
     * running in Azure, this value shall be set to null.
     *
     * @param azureStorageAccountId the azureStorageAccountId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withAzureStorageAccountId(String azureStorageAccountId) {
        this.azureStorageAccountId = azureStorageAccountId;
        return this;
    }

    /**
     * Get the datastores property: The datastores of the on-premise machine Value can be list of strings that contain
     * datastore names.
     *
     * @return the datastores value.
     */
    public List<String> datastores() {
        return this.datastores;
    }

    /**
     * Set the datastores property: The datastores of the on-premise machine Value can be list of strings that contain
     * datastore names.
     *
     * @param datastores the datastores value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withDatastores(List<String> datastores) {
        this.datastores = datastores;
        return this;
    }

    /**
     * Get the validationErrors property: The validation errors of the on-premise machine Value can be list of
     * validation errors.
     *
     * @return the validationErrors value.
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: The validation errors of the on-premise machine Value can be list of
     * validation errors.
     *
     * @param validationErrors the validationErrors value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the lastRpoCalculatedTime property: The last RPO calculated time.
     *
     * @return the lastRpoCalculatedTime value.
     */
    public OffsetDateTime lastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * Set the lastRpoCalculatedTime property: The last RPO calculated time.
     *
     * @param lastRpoCalculatedTime the lastRpoCalculatedTime value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastRpoCalculatedTime(OffsetDateTime lastRpoCalculatedTime) {
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        return this;
    }

    /**
     * Get the lastUpdateReceivedTime property: The last update time received from on-prem components.
     *
     * @return the lastUpdateReceivedTime value.
     */
    public OffsetDateTime lastUpdateReceivedTime() {
        return this.lastUpdateReceivedTime;
    }

    /**
     * Set the lastUpdateReceivedTime property: The last update time received from on-prem components.
     *
     * @param lastUpdateReceivedTime the lastUpdateReceivedTime value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withLastUpdateReceivedTime(OffsetDateTime lastUpdateReceivedTime) {
        this.lastUpdateReceivedTime = lastUpdateReceivedTime;
        return this;
    }

    /**
     * Get the replicaId property: The replica id of the protected item.
     *
     * @return the replicaId value.
     */
    public String replicaId() {
        return this.replicaId;
    }

    /**
     * Set the replicaId property: The replica id of the protected item.
     *
     * @param replicaId the replicaId value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

    /**
     * Get the osVersion property: The OS Version of the protected item.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The OS Version of the protected item.
     *
     * @param osVersion the osVersion value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the isAdditionalStatsAvailable property: A value indicating whether additional IR stats are available or not.
     *
     * @return the isAdditionalStatsAvailable value.
     */
    public Boolean isAdditionalStatsAvailable() {
        return this.isAdditionalStatsAvailable;
    }

    /**
     * Set the isAdditionalStatsAvailable property: A value indicating whether additional IR stats are available or not.
     *
     * @param isAdditionalStatsAvailable the isAdditionalStatsAvailable value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withIsAdditionalStatsAvailable(Boolean isAdditionalStatsAvailable) {
        this.isAdditionalStatsAvailable = isAdditionalStatsAvailable;
        return this;
    }

    /**
     * Get the totalDataTransferred property: The total transferred data in bytes.
     *
     * @return the totalDataTransferred value.
     */
    public Long totalDataTransferred() {
        return this.totalDataTransferred;
    }

    /**
     * Set the totalDataTransferred property: The total transferred data in bytes.
     *
     * @param totalDataTransferred the totalDataTransferred value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withTotalDataTransferred(Long totalDataTransferred) {
        this.totalDataTransferred = totalDataTransferred;
        return this;
    }

    /**
     * Get the totalProgressHealth property: The progress health.
     *
     * @return the totalProgressHealth value.
     */
    public String totalProgressHealth() {
        return this.totalProgressHealth;
    }

    /**
     * Set the totalProgressHealth property: The progress health.
     *
     * @param totalProgressHealth the totalProgressHealth value to set.
     * @return the InMageReplicationDetails object itself.
     */
    public InMageReplicationDetails withTotalProgressHealth(String totalProgressHealth) {
        this.totalProgressHealth = totalProgressHealth;
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
        if (osDetails() != null) {
            osDetails().validate();
        }
        if (resyncDetails() != null) {
            resyncDetails().validate();
        }
        if (protectedDisks() != null) {
            protectedDisks().forEach(e -> e.validate());
        }
        if (agentDetails() != null) {
            agentDetails().validate();
        }
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}