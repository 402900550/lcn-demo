package com.test.lcn2.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.test.lcn2.entity.NewYearCoin;
import com.test.lcn2.feign.Lcn1Service;
import com.test.lcn2.service.NewYearCoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class LcnController {

    @Autowired
    private NewYearCoinService newYearCoinService;

    @Autowired
    private Lcn1Service lcn1Service;

    @GetMapping("list")
    public List<NewYearCoin>  list(){
//        List<NewYearCoin> list = newYearCoinService.list();

        return lcn1Service.list();
    }

    @GetMapping("add")
    @LcnTransaction
    public String  listadd() throws Exception {
        NewYearCoin coin=new NewYearCoin();

        coin.setCoinUnit("LCN2");
        coin.setWardAmount(new BigDecimal("0"));
        coin.setCostAmount(new BigDecimal("0"));
        coin.setCreateTime(new Date());
        coin.setUpdateTime(new Date());
        newYearCoinService.save(coin);


        lcn1Service.listadd();

        throw new Exception();


    }


}
