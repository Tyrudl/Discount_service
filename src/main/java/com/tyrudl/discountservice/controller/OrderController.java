package com.tyrudl.discountservice.controller;

import com.tyrudl.discountservice.model.Order;
import com.tyrudl.discountservice.repository.OrderRepository;
import com.tyrudl.discountservice.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final DiscountService discountService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        Double discount = discountService.calculateDiscount(order.getAmount());
        order.setDiscountAmount(discount);
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

