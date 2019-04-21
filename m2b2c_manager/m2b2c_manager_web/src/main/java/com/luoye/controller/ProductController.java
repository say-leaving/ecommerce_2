package com.luoye.controller;

import com.luoye.model.Goods;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value ="/product/add")
    public ResponseJsonResult addProduct(@RequestBody Goods goods){
        ResponseJsonResult responseJsonResult = productService.addGoods(goods);
        return  responseJsonResult;
    }
}
