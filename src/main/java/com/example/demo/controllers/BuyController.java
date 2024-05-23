package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuyController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/buyitem")
    public String updateinventory(@RequestParam("productID") int theId) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product = productService.findById(theId);
        int stock = product.getInv();
        if(stock < 1) {
            return "buydenial";
        }
        else {
            product.setInv(stock - 1);
            productService.save(product);
            return "buyconfirmation";
        }
    }
}
