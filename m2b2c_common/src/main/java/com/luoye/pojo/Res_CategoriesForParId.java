package com.luoye.pojo;

import java.util.List;

public class Res_CategoriesForParId {
    private List<SubCategoriesBean> subCategoriesBeanList ;

    public List<SubCategoriesBean> getSubCategoriesBeanList() {
        return subCategoriesBeanList;
    }

    public void setSubCategoriesBeanList(List<SubCategoriesBean> subCategoriesBeanList) {
        this.subCategoriesBeanList = subCategoriesBeanList;
    }

    public static  class SubCategoriesBean{
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
