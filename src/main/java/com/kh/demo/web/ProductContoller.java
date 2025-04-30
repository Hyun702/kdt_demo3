package com.kh.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")

public class ProductContoller {
  //목록
  @GetMapping
  public String findAll(){

    return "product/all";
  }


}
