package com.luoye.service.impl;

import com.luoye.mapper.GoodsMapper;
import com.luoye.model.Goods;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public ResponseJsonResult addGoods(Goods goods) {
        ResponseJsonResult responseJsonResult =new ResponseJsonResult();
        Goods goodsl =goods;
        int insert = goodsMapper.insert(goods);
        if (insert!=1){
            responseJsonResult.setStatus(400);
            responseJsonResult.setMsg("插入失败，请检查是否有权限");
        }
        return null;
    }
}
