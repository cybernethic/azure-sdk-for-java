// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.ImportNewDatabaseDefinition;
import com.azure.resourcemanager.sql.models.NetworkIsolationSettings;
import com.azure.resourcemanager.sql.models.StorageKeyType;

/** Samples for Servers ImportDatabase. */
public final class ServersImportDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ImportNewDatabaseWithNetworkIsolation.json
     */
    /**
     * Sample code: Imports to a new database, using private link for the SQL server and storage account.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void importsToANewDatabaseUsingPrivateLinkForTheSQLServerAndStorageAccount(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .importDatabase(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                new ImportNewDatabaseDefinition()
                    .withDatabaseName("testdb")
                    .withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY)
                    .withStorageKey("fakeTokenPlaceholder")
                    .withStorageUri("https://test.blob.core.windows.net/test.bacpac")
                    .withAdministratorLogin("login")
                    .withAdministratorLoginPassword("fakeTokenPlaceholder")
                    .withAuthenticationType("Sql")
                    .withNetworkIsolation(
                        new NetworkIsolationSettings()
                            .withStorageAccountResourceId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Storage/storageAccounts/test-privatelink")
                            .withSqlServerResourceId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ImportNewDatabase.json
     */
    /**
     * Sample code: Imports to a new database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void importsToANewDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .importDatabase(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                new ImportNewDatabaseDefinition()
                    .withDatabaseName("testdb")
                    .withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY)
                    .withStorageKey("fakeTokenPlaceholder")
                    .withStorageUri("https://test.blob.core.windows.net/test.bacpac")
                    .withAdministratorLogin("login")
                    .withAdministratorLoginPassword("fakeTokenPlaceholder")
                    .withAuthenticationType("Sql"),
                Context.NONE);
    }
}