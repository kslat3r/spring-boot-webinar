package com.sapient.springbootwebinar.repository;

import com.sapient.springbootwebinar.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalancesRepository extends JpaRepository<Balance, String> {}
