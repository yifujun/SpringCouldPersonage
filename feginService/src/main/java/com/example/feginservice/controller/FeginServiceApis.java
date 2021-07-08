package com.example.feginservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Fegin熔断.
 *
 * @author 易富军
 */                                                                             
@FeignClient(name = "FeginController")
public interface FeginServiceApis {                      

    @RequestMapping(value = "/test/demo", method = RequestMethod.GET)
    public String feginDemo(String name);
    
}
