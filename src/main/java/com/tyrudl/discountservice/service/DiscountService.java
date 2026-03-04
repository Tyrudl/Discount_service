package com.tyrudl.discountservice.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public Double calculateDiscount(Double amount) {
        if (amount == null) return 0.0;
        if (amount >= 50000) return amount * 0.10; // 10%
        if (amount >= 10000) return amount * 0.05; // 5%
        return 0.0;
    }
}