package com.ias.inventory.application.services.impl;

import com.ias.inventory.application.services.IProductService;
import com.ias.inventory.infrastructure.persistance.entities.ProductEntity;
import com.ias.inventory.infrastructure.persistance.repositories.ProductRepository;
import com.ias.inventory.infrastructure.request.RequestProduct;
import com.ias.inventory.infrastructure.response.ResponseProduct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public ResponseProduct addProduct(RequestProduct requestProduct) {
        ProductEntity productEntity = new ProductEntity().builder()
                .name(requestProduct.getName())
                .description(requestProduct.getDescription())
                .price(requestProduct.getPrice())
                .build();

        ProductEntity response = productRepository.save(productEntity);

        return toResponseProduct(response);
    }

    @Override
    public List<ResponseProduct> getProducts() {
        List<ProductEntity> entityList = productRepository.findAll();
        return entityList.stream().map(this::toResponseProduct).toList();
    }

    @Override
    public ResponseProduct getProduct(Long id) {
        ProductEntity productEntity = productRepository.findById(id).orElse(null);
        return toResponseProduct(productEntity);
    }


    private ResponseProduct toResponseProduct(ProductEntity productEntity){
        return ResponseProduct.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .price(productEntity.getPrice())
                .build();
    }
}
