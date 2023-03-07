// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Holds configuration customizations for kube-proxy. Any values not defined will use the kube-proxy defaulting
 * behavior. See https://v&lt;version&gt;.docs.kubernetes.io/docs/reference/command-line-tools-reference/kube-proxy/
 * where &lt;version&gt; is represented by a &lt;major version&gt;-&lt;minor version&gt; string. Kubernetes version 1.23
 * would be '1-23'.
 */
@Fluent
public final class ContainerServiceNetworkProfileKubeProxyConfig {
    /*
     * Whether to enable on kube-proxy on the cluster (if no 'kubeProxyConfig' exists, kube-proxy is enabled in AKS by
     * default without these customizations).
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Specify which proxy mode to use ('IPTABLES' or 'IPVS')
     */
    @JsonProperty(value = "mode")
    private Mode mode;

    /*
     * Holds configuration customizations for IPVS. May only be specified if 'mode' is set to 'IPVS'.
     */
    @JsonProperty(value = "ipvsConfig")
    private ContainerServiceNetworkProfileKubeProxyConfigIpvsConfig ipvsConfig;

    /** Creates an instance of ContainerServiceNetworkProfileKubeProxyConfig class. */
    public ContainerServiceNetworkProfileKubeProxyConfig() {
    }

    /**
     * Get the enabled property: Whether to enable on kube-proxy on the cluster (if no 'kubeProxyConfig' exists,
     * kube-proxy is enabled in AKS by default without these customizations).
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable on kube-proxy on the cluster (if no 'kubeProxyConfig' exists,
     * kube-proxy is enabled in AKS by default without these customizations).
     *
     * @param enabled the enabled value to set.
     * @return the ContainerServiceNetworkProfileKubeProxyConfig object itself.
     */
    public ContainerServiceNetworkProfileKubeProxyConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the mode property: Specify which proxy mode to use ('IPTABLES' or 'IPVS').
     *
     * @return the mode value.
     */
    public Mode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Specify which proxy mode to use ('IPTABLES' or 'IPVS').
     *
     * @param mode the mode value to set.
     * @return the ContainerServiceNetworkProfileKubeProxyConfig object itself.
     */
    public ContainerServiceNetworkProfileKubeProxyConfig withMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the ipvsConfig property: Holds configuration customizations for IPVS. May only be specified if 'mode' is set
     * to 'IPVS'.
     *
     * @return the ipvsConfig value.
     */
    public ContainerServiceNetworkProfileKubeProxyConfigIpvsConfig ipvsConfig() {
        return this.ipvsConfig;
    }

    /**
     * Set the ipvsConfig property: Holds configuration customizations for IPVS. May only be specified if 'mode' is set
     * to 'IPVS'.
     *
     * @param ipvsConfig the ipvsConfig value to set.
     * @return the ContainerServiceNetworkProfileKubeProxyConfig object itself.
     */
    public ContainerServiceNetworkProfileKubeProxyConfig withIpvsConfig(
        ContainerServiceNetworkProfileKubeProxyConfigIpvsConfig ipvsConfig) {
        this.ipvsConfig = ipvsConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipvsConfig() != null) {
            ipvsConfig().validate();
        }
    }
}