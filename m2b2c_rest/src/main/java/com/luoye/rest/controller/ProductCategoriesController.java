package com.luoye.rest.controller;

import com.luoye.pojo.Res_Categories;
import com.luoye.pojo.Res_Product;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.rest.service.ProductCategoriesService;
import com.luoye.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class ProductCategoriesController {

    @Autowired
    ProductCategoriesService productCategoriesService;

    @Autowired
    ProductService productService;
    @RequestMapping("/productCategories/list")
    @ResponseBody
    public Res_Categories getCategories(){
        Res_Categories resCategories = productCategoriesService.getResCategories();
        return resCategories;
    }
    @RequestMapping("/product/list")
    @ResponseBody
    public ResponseJsonResult getProduct(){
        ResponseJsonResult responseJsonResult=productService.getProduct();
        return responseJsonResult;
    }
}
