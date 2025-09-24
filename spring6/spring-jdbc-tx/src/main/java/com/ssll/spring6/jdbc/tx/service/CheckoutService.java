package com.ssll.spring6.jdbc.tx.service;

public interface CheckoutService {
    void checkout(Integer[] bookIds, Integer userId);
}