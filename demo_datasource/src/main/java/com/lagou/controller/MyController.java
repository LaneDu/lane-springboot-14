package com.lagou.controller;

import com.lagou.config.RoutingWith;
import com.lagou.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ProductService productService;

    @RoutingWith("masterDataSource")
    @GetMapping("/findAllProductM")
    public String findAllProductM() {
       /* String key = "masterDataSource";
        RoutingDataSourceContext routingDataSourceContext = new RoutingDataSourceContext(key);*/
        productService.findAllProductM();

         return "lagou";
        }

    @RoutingWith("slaveDataSource")
    @GetMapping("/findAllProductS")
    public String findAllProductS() {
        /*String key = "slaveDataSource";
        RoutingDataSourceContext routingDataSourceContext = new RoutingDataSourceContext(key);*/
        productService.findAllProductS();
        return "lagou";
    }

}
