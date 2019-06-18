package com.sapient.apiexample.balancespapiservice.service;

import com.sapient.apiexample.balancespapiservice.model.Balance;

import java.util.List;

public interface BalancesService {
    public List<Balance> findAll(String jwtToken);
}
