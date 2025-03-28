package com.iocl.VendorManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ProductController {

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private ClientInterface clientInterface;


    @GetMapping("/getProducts")
    public String getProduct(){
        return "This is a dummy product";
    }
}
