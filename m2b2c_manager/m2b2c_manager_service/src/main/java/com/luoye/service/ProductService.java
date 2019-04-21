package com.luoye.service;

import com.luoye.model.Goods;
import com.luoye.pojo.ResponseJsonResult;

public interface ProductService  {
    ResponseJsonResult addGoods(Goods goods);
}
