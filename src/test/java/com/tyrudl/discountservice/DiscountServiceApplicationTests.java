package com.tyrudl.discountservice;
import com.tyrudl.discountservice.model.Order;

import com.tyrudl.discountservice.service.DiscountService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountServiceTest {
    private final DiscountService discountService = new DiscountService();

    @Test
    void testCalculateDiscount_ShouldReturnCorrectValue() {
        Order order = new Order();
        order.setAmount(10000.0);


        Double discount = discountService.calculateDiscount(order.getAmount());
        assertEquals(500.0, discount, "Скидка для 10000 должна быть 500.0");
    }

}
