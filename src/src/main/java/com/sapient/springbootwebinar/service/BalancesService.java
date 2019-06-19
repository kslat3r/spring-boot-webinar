package com.sapient.springbootwebinar.service;

import com.sapient.springbootwebinar.model.Balance;

import java.util.List;

public interface BalancesService {
    public List<Balance> findAll(String jwtToken);
}
