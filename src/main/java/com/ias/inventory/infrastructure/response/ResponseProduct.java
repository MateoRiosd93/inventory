package com.ias.inventory.infrastructure.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseProduct {
    private Long id;
    private String name;
    private String description;
    private int price;
}
