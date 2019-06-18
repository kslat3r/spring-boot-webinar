package com.sapient.apiexample.balancespapiservice.repository;

import com.sapient.apiexample.balancespapiservice.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalancesRepository extends JpaRepository<Balance, String> {}
