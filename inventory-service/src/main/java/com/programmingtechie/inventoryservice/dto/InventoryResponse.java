package com.programmingtechie.inventoryservice.dto;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    private String skuCode;
    private Boolean isInStock;
}
