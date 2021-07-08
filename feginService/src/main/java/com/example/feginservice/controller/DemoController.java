package com.example.feginservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试.
 *
 * @author 易富军
 */
@RestController
@RequestMapping("/test")
public class DemoController {
    
    @RequestMapping("/demo")
    public String feginDemo() {
        return "Hello SpringCloud";
    }
    
}
