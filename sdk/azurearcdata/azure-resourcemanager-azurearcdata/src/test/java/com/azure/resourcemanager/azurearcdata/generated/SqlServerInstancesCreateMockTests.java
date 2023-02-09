// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.azurearcdata.AzureArcDataManager;
import com.azure.resourcemanager.azurearcdata.models.ArcSqlServerLicenseType;
import com.azure.resourcemanager.azurearcdata.models.ConnectionStatus;
import com.azure.resourcemanager.azurearcdata.models.DefenderStatus;
import com.azure.resourcemanager.azurearcdata.models.EditionType;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstance;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstanceProperties;
import com.azure.resourcemanager.azurearcdata.models.SqlVersion;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlServerInstancesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"version\":\"SQL Server"
                + " 2016\",\"edition\":\"Developer\",\"containerResourceId\":\"fpubjibwwi\",\"createTime\":\"ohqkvpuvksgpls\",\"vCore\":\"nynfsynljphuo\",\"status\":\"Disconnected\",\"patchLevel\":\"dlqiyntorzih\",\"collation\":\"osjswsr\",\"currentVersion\":\"lyzrpzbchckqqzqi\",\"instanceName\":\"iysui\",\"tcpDynamicPorts\":\"ynkedyatrwyhqmib\",\"tcpStaticPorts\":\"hwit\",\"productId\":\"ypyynpcdpumnzg\",\"licenseType\":\"Paid\",\"azureDefenderStatusLastUpdated\":\"2021-05-04T13:21:35Z\",\"azureDefenderStatus\":\"Unknown\",\"provisioningState\":\"Succeeded\"},\"location\":\"jhxbld\",\"tags\":{\"vokotllxdyh\":\"wrlkdmtn\",\"oocrkvcikhnv\":\"syocogjltdtbnnha\",\"gxk\":\"amqgxqquezikyw\"},\"id\":\"lla\",\"name\":\"melwuipiccjz\",\"type\":\"z\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AzureArcDataManager manager =
            AzureArcDataManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SqlServerInstance response =
            manager
                .sqlServerInstances()
                .define("hwflu")
                .withRegion("eqnovvqfovl")
                .withExistingResourceGroup("qyib")
                .withTags(mapOf("ndsytgadg", "wsuwsyr", "ea", "r"))
                .withProperties(
                    new SqlServerInstanceProperties()
                        .withVersion(SqlVersion.SQL_SERVER_2019)
                        .withEdition(EditionType.STANDARD)
                        .withContainerResourceId("rkwofyyvoqa")
                        .withVCore("washr")
                        .withStatus(ConnectionStatus.DISCONNECTED)
                        .withPatchLevel("kcnqxwbpo")
                        .withCollation("lpiujwaa")
                        .withCurrentVersion("pqiiobyuqe")
                        .withInstanceName("qlpqwcciuq")
                        .withTcpDynamicPorts("dbutauvfbtkuwhh")
                        .withTcpStaticPorts("ykojoxafnndlpic")
                        .withProductId("o")
                        .withLicenseType(ArcSqlServerLicenseType.FREE)
                        .withAzureDefenderStatusLastUpdated(OffsetDateTime.parse("2021-10-22T11:40:28Z"))
                        .withAzureDefenderStatus(DefenderStatus.UNPROTECTED))
                .create();

        Assertions.assertEquals("jhxbld", response.location());
        Assertions.assertEquals("wrlkdmtn", response.tags().get("vokotllxdyh"));
        Assertions.assertEquals(SqlVersion.SQL_SERVER_2016, response.properties().version());
        Assertions.assertEquals(EditionType.DEVELOPER, response.properties().edition());
        Assertions.assertEquals("fpubjibwwi", response.properties().containerResourceId());
        Assertions.assertEquals("nynfsynljphuo", response.properties().vCore());
        Assertions.assertEquals(ConnectionStatus.DISCONNECTED, response.properties().status());
        Assertions.assertEquals("dlqiyntorzih", response.properties().patchLevel());
        Assertions.assertEquals("osjswsr", response.properties().collation());
        Assertions.assertEquals("lyzrpzbchckqqzqi", response.properties().currentVersion());
        Assertions.assertEquals("iysui", response.properties().instanceName());
        Assertions.assertEquals("ynkedyatrwyhqmib", response.properties().tcpDynamicPorts());
        Assertions.assertEquals("hwit", response.properties().tcpStaticPorts());
        Assertions.assertEquals("ypyynpcdpumnzg", response.properties().productId());
        Assertions.assertEquals(ArcSqlServerLicenseType.PAID, response.properties().licenseType());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-04T13:21:35Z"), response.properties().azureDefenderStatusLastUpdated());
        Assertions.assertEquals(DefenderStatus.UNKNOWN, response.properties().azureDefenderStatus());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}