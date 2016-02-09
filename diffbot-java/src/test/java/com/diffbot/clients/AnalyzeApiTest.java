package com.diffbot.clients;

import org.codehaus.jackson.JsonNode;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by wadi chemkhi on 14/01/14.
 * Email : wadi.chemkhi@gmail.com
 */
public class AnalyzeApiTest {

    private String testToken="mike";

    @Test
    public void testAnalyseJacksonResponse() throws IOException {
        DiffbotClient client = new DiffbotClient(testToken,"2");
        JsonNode a= (JsonNode) client.analyze(DiffbotClient.ResponseType.Jackson,"http://www.bestbuy.com/site/spectre-blu-ray-digital-copy/4616800.p?id=3529822&skuId=4616800");
        System.out.println(a.toString());
    }
}
