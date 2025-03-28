package com.iocl.VendorManagement;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="ProductService",url="http://localhost:8080")
public interface ClientInterface {
    @GetMapping("/getVendor2")
    public String getProducts();
}
