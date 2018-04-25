/**
 * <p>Title: ApiTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: www.zto.com</p>
 */
package com.lbr.helloworld.test;

import com.lbr.helloworld.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class
        , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testController() {
        URI uri = null;
        try {
            uri = new URI("/home");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ResponseEntity<String> forEntity = restTemplate.getForEntity(uri, String.class);
        System.out.println(forEntity.getBody());
        Assert.assertEquals(forEntity.getBody(), "SUCCESS");
    }


}
