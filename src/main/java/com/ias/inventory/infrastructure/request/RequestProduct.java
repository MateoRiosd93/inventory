package com.ias.inventory.infrastructure.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestProduct {
    private String name;
    private String description;
    private Integer price;
}
