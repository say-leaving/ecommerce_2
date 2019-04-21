package com.luoye.service;

import com.luoye.model.Goods;
import com.luoye.pojo.PageDataTemplate;
import com.luoye.pojo.ResponseJsonResult;

import java.util.List;

public interface UserManagerService {
    PageDataTemplate findBrandListAllForVerify(int pageIndex,int pageSize);
    PageDataTemplate findDistributionListAll(int pageIndex,int pageSize);
    Integer brandRefuseResult(int id);
    Integer distributorRefuseResult(int id);
    Integer brandPassResult(int id);
    Integer distributorPassResult(int id);
    List  findListById(int id);
    int updateBrandListById(int id);

}
