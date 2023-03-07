// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JsonSerializerProviders;
import com.azure.core.util.serializer.ObjectSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the FarmBeatsClient type. */
@ServiceClientBuilder(
        serviceClients = {
            ApplicationDataBaseClient.class,
            AttachmentsBaseClient.class,
            BoundariesBaseClient.class,
            CropsBaseClient.class,
            CropVarietiesBaseClient.class,
            FarmersBaseClient.class,
            FarmOperationsBaseClient.class,
            FarmsBaseClient.class,
            FieldsBaseClient.class,
            HarvestDataBaseClient.class,
            ImageProcessingBaseClient.class,
            OAuthProvidersBaseClient.class,
            OAuthTokensBaseClient.class,
            PlantingDataBaseClient.class,
            ScenesBaseClient.class,
            SeasonalFieldsBaseClient.class,
            SeasonsBaseClient.class,
            TillageDataBaseClient.class,
            WeatherBaseClient.class
        })
public final class FarmBeatsClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://farmbeats.azure.net/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the FarmBeatsClientBuilder. */
    public FarmBeatsClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The endpoint of your FarmBeats resource (protocol and hostname, for
     * example: https://{resourceName}.farmbeats.azure.net).
     */
    private String endpoint;

    /**
     * Sets The endpoint of your FarmBeats resource (protocol and hostname, for example:
     * https://{resourceName}.farmbeats.azure.net).
     *
     * @param endpoint the endpoint value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private ObjectSerializer serializer;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializer the serializer value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder serializer(ObjectSerializer serializer) {
        this.serializer = serializer;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the FarmBeatsClientBuilder.
     */
    public FarmBeatsClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of ApplicationDataBaseClient low level client.
     *
     * @return an instance of ApplicationDataBaseClient.
     */
    public ApplicationDataBaseClient buildApplicationDataBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        ApplicationDataBaseClient client = new ApplicationDataBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of AttachmentsBaseClient low level client.
     *
     * @return an instance of AttachmentsBaseClient.
     */
    public AttachmentsBaseClient buildAttachmentsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        AttachmentsBaseClient client = new AttachmentsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of BoundariesBaseClient low level client.
     *
     * @return an instance of BoundariesBaseClient.
     */
    public BoundariesBaseClient buildBoundariesBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        BoundariesBaseClient client = new BoundariesBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of CropsBaseClient low level client.
     *
     * @return an instance of CropsBaseClient.
     */
    public CropsBaseClient buildCropsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        CropsBaseClient client = new CropsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of CropVarietiesBaseClient low level client.
     *
     * @return an instance of CropVarietiesBaseClient.
     */
    public CropVarietiesBaseClient buildCropVarietiesBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        CropVarietiesBaseClient client = new CropVarietiesBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of FarmersBaseClient low level client.
     *
     * @return an instance of FarmersBaseClient.
     */
    public FarmersBaseClient buildFarmersBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        FarmersBaseClient client = new FarmersBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of FarmOperationsBaseClient low level client.
     *
     * @return an instance of FarmOperationsBaseClient.
     */
    public FarmOperationsBaseClient buildFarmOperationsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        FarmOperationsBaseClient client = new FarmOperationsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of FarmsBaseClient low level client.
     *
     * @return an instance of FarmsBaseClient.
     */
    public FarmsBaseClient buildFarmsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        FarmsBaseClient client = new FarmsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of FieldsBaseClient low level client.
     *
     * @return an instance of FieldsBaseClient.
     */
    public FieldsBaseClient buildFieldsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        FieldsBaseClient client = new FieldsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of HarvestDataBaseClient low level client.
     *
     * @return an instance of HarvestDataBaseClient.
     */
    public HarvestDataBaseClient buildHarvestDataBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        HarvestDataBaseClient client = new HarvestDataBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of ImageProcessingBaseClient low level client.
     *
     * @return an instance of ImageProcessingBaseClient.
     */
    public ImageProcessingBaseClient buildImageProcessingBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        ImageProcessingBaseClient client = new ImageProcessingBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of OAuthProvidersBaseClient low level client.
     *
     * @return an instance of OAuthProvidersBaseClient.
     */
    public OAuthProvidersBaseClient buildOAuthProvidersBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        OAuthProvidersBaseClient client = new OAuthProvidersBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of OAuthTokensBaseClient low level client.
     *
     * @return an instance of OAuthTokensBaseClient.
     */
    public OAuthTokensBaseClient buildOAuthTokensBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        OAuthTokensBaseClient client = new OAuthTokensBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of PlantingDataBaseClient low level client.
     *
     * @return an instance of PlantingDataBaseClient.
     */
    public PlantingDataBaseClient buildPlantingDataBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        PlantingDataBaseClient client = new PlantingDataBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of ScenesBaseClient low level client.
     *
     * @return an instance of ScenesBaseClient.
     */
    public ScenesBaseClient buildScenesBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        ScenesBaseClient client = new ScenesBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of SeasonalFieldsBaseClient low level client.
     *
     * @return an instance of SeasonalFieldsBaseClient.
     */
    public SeasonalFieldsBaseClient buildSeasonalFieldsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        SeasonalFieldsBaseClient client = new SeasonalFieldsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of SeasonsBaseClient low level client.
     *
     * @return an instance of SeasonsBaseClient.
     */
    public SeasonsBaseClient buildSeasonsBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        SeasonsBaseClient client = new SeasonsBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of TillageDataBaseClient low level client.
     *
     * @return an instance of TillageDataBaseClient.
     */
    public TillageDataBaseClient buildTillageDataBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        TillageDataBaseClient client = new TillageDataBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of WeatherBaseClient low level client.
     *
     * @return an instance of WeatherBaseClient.
     */
    public WeatherBaseClient buildWeatherBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "2021-03-31-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        WeatherBaseClient client = new WeatherBaseClient(endpoint, apiVersion, pipeline, serializer);
        return client;
    }
}