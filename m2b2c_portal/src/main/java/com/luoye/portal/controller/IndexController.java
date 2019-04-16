package com.luoye.portal.controller;

import com.luoye.pojo.Res_Categories;
import com.luoye.pojo.Res_Product;
import com.luoye.portal.service.CategoriesService;
import com.luoye.portal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    CategoriesService categoriesService;
    @Autowired
    ProductService productService;

    @RequestMapping("/home.html")
    public String index(ModelMap modelMap){
        Res_Categories res_categories =categoriesService.getCategories();
        modelMap.addAttribute("categories",res_categories);
        List<Res_Product> res_product =productService.getProduct();
        modelMap.addAttribute("products",res_product);
        return "Product";
    }
}
