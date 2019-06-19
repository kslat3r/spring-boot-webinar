package com.sapient.springbootwebinar.service;

import com.sapient.springbootwebinar.model.Balance;
import com.sapient.springbootwebinar.repository.BalancesRepository;
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
