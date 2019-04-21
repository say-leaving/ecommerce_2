package com.luoye.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luoye.mapper.UserMapper;
import com.luoye.model.Goods;
import com.luoye.model.User;
import com.luoye.model.UserExample;
import com.luoye.pojo.PageDataTemplate;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerServiceImpl implements UserManagerService{

    @Autowired
     private UserMapper userMapper ;


    /**
     * 查找所有品牌商的数据
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    public PageDataTemplate findBrandListAllForVerify(int pageIndex, int pageSize) {

        PageHelper.startPage(pageIndex,pageSize);
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAuthorityEqualTo(1); // 1是品牌商
        List<User> users = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo =new PageInfo<>(users);
        PageDataTemplate<User> pageDataTemplate =new PageDataTemplate();
        pageDataTemplate.setRows(users);
        pageDataTemplate.setTotal(pageInfo.getTotal());
        return pageDataTemplate;
    }

    /**
     * 查找所有分销商数据
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    public PageDataTemplate findDistributionListAll(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        UserExample userExample  =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(2);//2是分销商
        List<User> users = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo =new PageInfo<>(users);
        PageDataTemplate pageDataTemplate =new PageDataTemplate();
        pageDataTemplate.setTotal(pageInfo.getTotal());
        pageDataTemplate.setRows(users);
        return pageDataTemplate;
    }

    /**
     * 品牌商冻结
     * @param id
     * @return
     */
    @Override
    public Integer brandRefuseResult(int id) {
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        User user =new User();
        user.setStatus(1);
        int l =userMapper.updateByExampleSelective(user,userExample);
        if (l==1){
            return 0;
        }else{
            return 1;
        }
    }

    /**
     * 0通过 ，1拒绝
     * @param id
     * @return
     */
    @Override
    public Integer distributorRefuseResult(int id) {
        List<User> listById = findListById(id);
        if (listById.get(0).getStatus()==1){
            return 2;
        }
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        User user =new User();
        user.setStatus(1);
        Integer ll =userMapper.updateByExampleSelective(user,userExample);
        return ll;
    }

    /**
     * 品牌商通过审核
     * 0通过 ，1拒绝
     * @param id
     * @return
     */
    @Override
    public Integer brandPassResult(int id) {
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        User user =new User();
        user.setStatus(0);
        int l =userMapper.updateByExampleSelective(user,userExample);
        if (l==1){
            return 0; //修改成功
        }else{
            return 1; //修改失败
        }
    }

    /**
     * 分销商通过
     * @param id
     * @return
     */
    @Override
    public Integer distributorPassResult(int id) {
        List<User> listById = findListById(id);
        if (listById.get(0).getStatus()==0){
            return 2;
        }
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        User user =new User();
        user.setStatus(0);
        Integer ll = userMapper.updateByExampleSelective(user, userExample);
        return ll;
    }

    @Override
    public List findListById(int id) {
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> users = userMapper.selectByExample(userExample);

        return users;
    }
    @Override
    public int updateBrandListById(int id) {
        return 0;
    }


}
