// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billingbenefits.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanValidateResponseInner;
import com.azure.resourcemanager.billingbenefits.models.ResourceProviders;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanPurchaseValidateRequest;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanValidateResponse;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SavingsPlanValidateResponse> validatePurchaseWithResponse(
        SavingsPlanPurchaseValidateRequest body, Context context) {
        Response<SavingsPlanValidateResponseInner> inner =
            this.serviceClient().validatePurchaseWithResponse(body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SavingsPlanValidateResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SavingsPlanValidateResponse validatePurchase(SavingsPlanPurchaseValidateRequest body) {
        SavingsPlanValidateResponseInner inner = this.serviceClient().validatePurchase(body);
        if (inner != null) {
            return new SavingsPlanValidateResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager() {
        return this.serviceManager;
    }
}