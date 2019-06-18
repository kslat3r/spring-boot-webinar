package com.sapient.apiexample.balancespapiservice.service;

import com.sapient.apiexample.balancespapiservice.model.Balance;
import com.sapient.apiexample.balancespapiservice.repository.BalancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BalancesServiceImpl implements BalancesService {

    @Autowired
    private BalancesRepository balancesRepository;

    @Transactional
    @Override
    public List<Balance> findAll(String jwtToken) {
        return balancesRepository.findAll();
    }
}
