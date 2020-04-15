package com.test.lcn2.feign;

import com.test.lcn2.entity.NewYearCoin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("lcn1")
public interface Lcn1Service {

    @GetMapping("list")
    List<NewYearCoin> list();

    @GetMapping("add")
    String  listadd();
}
