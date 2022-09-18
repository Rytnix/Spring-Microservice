package com.codeinsight.orderservice.common;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {

    private Long PaymentId;
    private String paymentStatus;
    private String transactionId;
    private Long orderId;
    private int amount;
}
