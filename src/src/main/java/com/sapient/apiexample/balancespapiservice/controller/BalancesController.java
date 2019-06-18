package com.sapient.apiexample.balancespapiservice.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.sapient.apiexample.balancespapiservice.model.Balance;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.sapient.apiexample.balancespapiservice.service.BalancesService;

import java.util.List;

@RequestMapping(produces = APPLICATION_JSON_VALUE)
@RestController
public class BalancesController {

    @Autowired
    private BalancesService balancesService;

    @GetMapping(value = "/balances")
    @ResponseStatus(HttpStatus.OK)
    public List<Balance> getBalances(
            @RequestHeader(name = "x-jwt-token") String jwtToken) {
        return balancesService.findAll(jwtToken);
    }

}
