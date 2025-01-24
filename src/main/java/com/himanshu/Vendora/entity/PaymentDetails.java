package com.himanshu.Vendora.entity;

import com.himanshu.Vendora.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String RazorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentIdWZSP;
    private PaymentStatus status;

}
