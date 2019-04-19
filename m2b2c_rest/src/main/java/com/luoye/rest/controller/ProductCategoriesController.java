package com.luoye.rest.controller;

import com.luoye.pojo.Res_Categories;
import com.luoye.pojo.Res_CategoriesForParId;
import com.luoye.pojo.Res_Product;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.rest.service.ProductCategoriesService;
import com.luoye.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest")
@CrossOrigin(origins = "*")
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
    @RequestMapping("/productCategories/sublist/{groupId}")
    @ResponseBody
    public Res_CategoriesForParId getSubCategories(@PathVariable Integer groupId){
        Res_CategoriesForParId resSubCategories = productCategoriesService.getResSubCategories(groupId);
        return resSubCategories;
    }
    @RequestMapping("/product/list")
    @ResponseBody
    public ResponseJsonResult getProduct(){
        ResponseJsonResult responseJsonResult=productService.getProduct();
        return responseJsonResult;
    }
}
