package com.ias.inventory.application.services;

import com.ias.inventory.infrastructure.request.RequestProduct;
import com.ias.inventory.infrastructure.response.ResponseProduct;

import java.util.List;

public interface IProductService {
    ResponseProduct addProduct(RequestProduct requestProduct);
    List<ResponseProduct> getProducts();

    ResponseProduct getProduct(Long id);
}
