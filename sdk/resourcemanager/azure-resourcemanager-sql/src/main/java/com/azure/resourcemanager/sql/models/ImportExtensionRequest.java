// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.fluent.models.ImportExtensionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Import database parameters. */
@Fluent
public final class ImportExtensionRequest {
    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the extension.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Represents the properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ImportExtensionProperties innerProperties;

    /**
     * Get the name property: The name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extension.
     *
     * @param name the name value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the extension.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the extension.
     *
     * @param type the type value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: Represents the properties of the resource.
     *
     * @return the innerProperties value.
     */
    private ImportExtensionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the operationMode property: The type of import operation being performed. This is always Import.
     *
     * @return the operationMode value.
     */
    public ImportOperationMode operationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().operationMode();
    }

    /**
     * Set the operationMode property: The type of import operation being performed. This is always Import.
     *
     * @param operationMode the operationMode value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withOperationMode(ImportOperationMode operationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withOperationMode(operationMode);
        return this;
    }

    /**
     * Get the storageKeyType property: The type of the storage key to use.
     *
     * @return the storageKeyType value.
     */
    public StorageKeyType storageKeyType() {
        return this.innerProperties() == null ? null : this.innerProperties().storageKeyType();
    }

    /**
     * Set the storageKeyType property: The type of the storage key to use.
     *
     * @param storageKeyType the storageKeyType value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKeyType(StorageKeyType storageKeyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withStorageKeyType(storageKeyType);
        return this;
    }

    /**
     * Get the storageKey property: The storage key to use. If storage key type is SharedAccessKey, it must be preceded
     * with a "?.".
     *
     * @return the storageKey value.
     */
    public String storageKey() {
        return this.innerProperties() == null ? null : this.innerProperties().storageKey();
    }

    /**
     * Set the storageKey property: The storage key to use. If storage key type is SharedAccessKey, it must be preceded
     * with a "?.".
     *
     * @param storageKey the storageKey value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageKey(String storageKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withStorageKey(storageKey);
        return this;
    }

    /**
     * Get the storageUri property: The storage uri to use.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.innerProperties() == null ? null : this.innerProperties().storageUri();
    }

    /**
     * Set the storageUri property: The storage uri to use.
     *
     * @param storageUri the storageUri value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withStorageUri(String storageUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withStorageUri(storageUri);
        return this;
    }

    /**
     * Get the administratorLogin property: The name of the SQL administrator.
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorLogin();
    }

    /**
     * Set the administratorLogin property: The name of the SQL administrator.
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLogin(String administratorLogin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withAdministratorLogin(administratorLogin);
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the SQL administrator.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorLoginPassword();
    }

    /**
     * Set the administratorLoginPassword property: The password of the SQL administrator.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAdministratorLoginPassword(String administratorLoginPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withAdministratorLoginPassword(administratorLoginPassword);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ImportExtensionRequest object itself.
     */
    public ImportExtensionRequest withAuthenticationType(AuthenticationType authenticationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImportExtensionProperties();
        }
        this.innerProperties().withAuthenticationType(authenticationType);
        return this;
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