package com.luoye.rest.service;

import com.luoye.pojo.Res_Categories;
import com.luoye.pojo.Res_CategoriesForParId;

public interface ProductCategoriesService {
    Res_Categories getResCategories();
    Res_CategoriesForParId getResSubCategories(Integer id);
}
