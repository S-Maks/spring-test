package com.app.request;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RestRequest {
    private RestTemplate restTemplate = new RestTemplate();

    private final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(32);

    private String url = "http://localhost:8086";

    public void run() {
        while (true) {
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            executor.execute(this::postRequest);
            //postRequest();
        }
    }

    private void getRequest() {
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        System.out.println(response.getBody());
    }

    private void postRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("mobileAppLogin", "mp");
        headers.set("mobileAppPassword", "pwd");
        headers.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Object> response = restTemplate.postForEntity(url, entity, Object.class);
        System.out.println(response.getBody());
    }
}
