package com.ias.inventory.infrastructure.entrypoints.controllers;

import com.ias.inventory.application.services.IProductService;
import com.ias.inventory.infrastructure.request.RequestProduct;
import com.ias.inventory.infrastructure.response.ResponseProduct;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final IProductService productService;

    @PostMapping
    public ResponseEntity<ResponseProduct> addProduct(@RequestBody RequestProduct requestProduct){
        ResponseProduct responseProduct = productService.addProduct(requestProduct);
        return new ResponseEntity<>(responseProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ResponseProduct>> getProducts(){
        List<ResponseProduct> response = productService.getProducts();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseProduct> getProduct(@PathVariable Long id){
        ResponseProduct responseProduct = productService.getProduct(id);
        return new ResponseEntity<>(responseProduct, HttpStatus.OK);
    }


}
