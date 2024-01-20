package com.example.apigateway.controllers;

import com.example.apigateway.services.APIGateWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class APIGateWayController {
    @Autowired
    private APIGateWayService apiGateWayService;


    @GetMapping("/listUser")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = apiGateWayService.getAllUser();
        return userList;
    }

    @GetMapping("/listProduct")
    public List<Map<String, Object>> getAllProduct(){
        List<Map<String, Object>> productList = apiGateWayService.getAllProduct();
        return productList;
    }
}
