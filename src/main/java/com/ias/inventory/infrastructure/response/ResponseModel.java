package com.ias.inventory.infrastructure.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseModel <T>{
    private T data;
    private String message;
    private int status;

}
