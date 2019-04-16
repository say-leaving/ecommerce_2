package com.luoye.rest.service.impl;

import com.github.pagehelper.PageHelper;
import com.luoye.mapper.GoodsMapper;
import com.luoye.model.*;
import com.luoye.pojo.Res_Product;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public ResponseJsonResult getProduct() {
        PageHelper.startPage(1,10);
        List<Res_Product> products = new ArrayList<>();
        GoodsExample goodsExample =new GoodsExample();
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        Res_Product product = new Res_Product();
        for (int i=0;i<goods.size();i++){
            product.setId(goods.get(i).getId());
            product.setPrice(goods.get(i).getPrice());
            product.setName(goods.get(i).getTitle());
            product.setImgUrl(goods.get(i).getImages());
            products.add(product);
        }
        ResponseJsonResult responseJsonResult = new ResponseJsonResult();
        responseJsonResult.setList(products);
        return responseJsonResult;
    }
}
