package com.ias.inventory.services.impl;

import com.ias.inventory.application.services.impl.ProductServiceImpl;
import com.ias.inventory.infrastructure.persistance.entities.ProductEntity;
import com.ias.inventory.infrastructure.persistance.repositories.ProductRepository;
import com.ias.inventory.infrastructure.request.RequestProduct;
import com.ias.inventory.infrastructure.response.ResponseProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {
    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductRepository productRepository;

    private ProductEntity productEntity;

    private RequestProduct requestProduct;

    private ResponseProduct responseProduct = new ResponseProduct();

    @Before
    public void beforeEach(){
        productEntity.builder()
                .name("balon")
                .description("adidas")
                .price(1000)
                .build();

        requestProduct = new RequestProduct("Balon", "Tests", 13000);
    }

    @Test
    public void addElement(){
        Mockito.when(productRepository.save(Mockito.any())).thenReturn(productEntity);

        ResponseProduct response = productService.addProduct(requestProduct);

        Assert.assertNotNull(response);
    }
}
