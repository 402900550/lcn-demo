package com.test.lcn1.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.test.lcn1.entity.NewYearCoin;
import com.test.lcn1.service.NewYearCoinService;
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



    @GetMapping("list")
    public List<NewYearCoin> list(){
        List<NewYearCoin> list = newYearCoinService.list();
        return list;
    }

    @GetMapping("add")
    @LcnTransaction
    public String  listadd(){
        NewYearCoin coin=new NewYearCoin();

        coin.setCoinUnit("LCN2");
        coin.setWardAmount(new BigDecimal("0"));
        coin.setCostAmount(new BigDecimal("0"));
        coin.setCreateTime(new Date());
        coin.setUpdateTime(new Date());
        newYearCoinService.save(coin);

        return "ok";
    }


}
