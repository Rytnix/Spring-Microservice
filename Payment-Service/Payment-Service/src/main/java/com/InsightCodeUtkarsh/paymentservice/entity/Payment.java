package com.InsightCodeUtkarsh.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PAYMENT_TB")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PaymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private int amount;
}
