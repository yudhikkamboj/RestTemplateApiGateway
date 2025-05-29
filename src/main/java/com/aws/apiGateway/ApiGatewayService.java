package com.aws.apiGateway;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class ApiGatewayService {

    public ResponseEntity<String> fetchApiGatewayResponse(){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate
                .getForEntity(URI.create("https://pg7zt58azg.execute-api.ap-south-1.amazonaws.com/dev/api"), String.class);

        return response;
    }
}
