package com.luoye.service;

import com.luoye.pojo.PageDataTemplate;

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
