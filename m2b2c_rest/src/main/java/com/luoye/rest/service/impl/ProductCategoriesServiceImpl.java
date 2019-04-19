package com.luoye.rest.service.impl;

import com.luoye.mapper.GoodsCategoryMapper;
import com.luoye.model.GoodsCategory;
import com.luoye.model.GoodsCategoryExample;
import com.luoye.pojo.Res_Categories;
import com.luoye.pojo.Res_CategoriesForParId;
import com.luoye.rest.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService {

    @Autowired
    GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public Res_Categories getResCategories() {
        Res_Categories res_categories =new Res_Categories();
        GoodsCategoryExample goodsCategoryExample =new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(goodsCategoryExample);

        List<Res_Categories.CategoriesBean> categories =new ArrayList<>();

        for (int i=0;i<goodsCategories.size();i++){
            Res_Categories.CategoriesBean categoriesBean =new Res_Categories.CategoriesBean();
            GoodsCategory goodsCategory =goodsCategories.get(i);
            categoriesBean.setCat_id(goodsCategory.getId()+"");
            categoriesBean.setName(goodsCategory.getName());

            List<Res_Categories.CategoriesBean.SubCetegoriesBean> subCetegoriesBeanList = getSubCategories(goodsCategory.getId());

            categoriesBean.setSub_cetegories(subCetegoriesBeanList);
            categories.add(categoriesBean);
        }

        res_categories.setCategories(categories);
        return res_categories;
    }

    @Override
    public Res_CategoriesForParId getResSubCategories(Integer id) {
        //创建返回类型
        Res_CategoriesForParId res_categoriesForParId =new Res_CategoriesForParId();
        //查询
        GoodsCategoryExample goodsCategoryExample =new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        //查询条件
        criteria.andParentIdEqualTo(id);
        //查询结果
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(goodsCategoryExample);
        List<Res_CategoriesForParId.SubCategoriesBean> result =new ArrayList<>();
        //处理数据
        for (int i=0;i<goodsCategories.size();i++){
            //获取单个分类
            GoodsCategory goodsCategory =goodsCategories.get(i);
            //创建单个子分类返回对象
            Res_CategoriesForParId.SubCategoriesBean subCategoriesBean =new Res_CategoriesForParId.SubCategoriesBean();
            //设置值
            subCategoriesBean.setId(goodsCategory.getId().toString());
            subCategoriesBean.setName(goodsCategory.getName());
            //添加到返回list中
            result.add(subCategoriesBean);
        }
        //设置返回结果
        res_categoriesForParId.setSubCategoriesBeanList(result);
        return res_categoriesForParId;
    }

    private List<Res_Categories.CategoriesBean.SubCetegoriesBean> getSubCategories(Integer id) {
        List<Res_Categories.CategoriesBean.SubCetegoriesBean> list =new ArrayList<>();
        GoodsCategoryExample goodsCategoryExample =new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(goodsCategoryExample);
        for (int i =0; i<goodsCategories.size();i++){
            Res_Categories.CategoriesBean.SubCetegoriesBean subCetegoriesBean =new Res_Categories.CategoriesBean.SubCetegoriesBean();
            GoodsCategory goodsCategory =goodsCategories.get(i);
            subCetegoriesBean.setCat_id(goodsCategory.getId()+"");
            subCetegoriesBean.setName(goodsCategory.getName());

            list.add(subCetegoriesBean);
        }
        return list;
    }
}
