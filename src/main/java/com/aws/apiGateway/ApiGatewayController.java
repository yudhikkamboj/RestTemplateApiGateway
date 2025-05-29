package com.aws.apiGateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awsApiGateway")
@Slf4j
public class ApiGatewayController {

    private ApiGatewayService apiGatewayService;

    @Autowired
    public ApiGatewayController(ApiGatewayService apiGatewayService){
        this.apiGatewayService = apiGatewayService;
    }

    @GetMapping("/api")
    public ResponseEntity<String> getApiGatewayResponse(){

        log.info("The controller started!!!");

        return apiGatewayService.fetchApiGatewayResponse();
    }

}
