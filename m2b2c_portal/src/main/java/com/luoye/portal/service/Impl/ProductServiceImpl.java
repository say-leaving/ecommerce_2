package com.luoye.portal.service.Impl;

import com.google.gson.Gson;
import com.luoye.pojo.Res_Product;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.portal.service.ProductService;
import com.luoye.portal.utils.GsonUtils;
import com.luoye.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${REST_URL}")
    String REST_URL;
    @Value("${REST_PRODUCT_LIST}")
    String REST_PRODUCT_LIST;

    @Override
    public List<Res_Product> getProduct() {
        try {
            String result =HttpClientUtil.httpGet(REST_URL+REST_PRODUCT_LIST);
            ResponseJsonResult responseJsonResult = GsonUtils.fromJson(ResponseJsonResult.class,result);
            List<Res_Product> res_products = (List<Res_Product>) responseJsonResult.getList();
            return res_products;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
