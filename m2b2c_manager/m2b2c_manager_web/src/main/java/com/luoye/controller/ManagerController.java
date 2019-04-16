package com.luoye.controller;

import com.luoye.model.User;
import com.luoye.pojo.PageDataTemplate;
import com.luoye.pojo.ResponseJsonResult;
import com.luoye.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    UserManagerService userManagerService;

    /**
     * 品牌请求查找
     * @param pageSize
     * @param pageIndex
     * @return
     */
    @RequestMapping(value = "/verify_brand",method = RequestMethod.GET)
    @ResponseBody
    public PageDataTemplate<User> verifyBrand(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageIndex){
        PageDataTemplate brandListAllForVerify = userManagerService.findBrandListAllForVerify(pageIndex, pageSize);
        return brandListAllForVerify;
    }

    /**
     * 品牌请求冻结
     * @param id
     * @return
     */
    @RequestMapping(value = "/brand_refuse")
    @ResponseBody
    public ResponseJsonResult brandRefuse(@RequestParam("id") int id){
        ResponseJsonResult responseJsonResult =new ResponseJsonResult();
        Integer flag=userManagerService.brandRefuseResult(id);
        if (flag==0){
            responseJsonResult.setMsg("设置成功");
        }else{
            responseJsonResult.setStatus(300);
            responseJsonResult.setMsg("请检查是否拥有权限");
        }
        return responseJsonResult;
    }

    /**
     * 品牌请求通过
     * @param id
     * @return
     */
    @RequestMapping(value = "/brand_pass")
    @ResponseBody
    public ResponseJsonResult brandPass(@RequestParam("id") int id){
        ResponseJsonResult responseJsonResult =new ResponseJsonResult();
        Integer flag=userManagerService.brandPassResult(id);
        if (flag==0){
            responseJsonResult.setMsg("设置成功");
        }else{
            responseJsonResult.setStatus(300);
            responseJsonResult.setMsg("请检查是否拥有权限");
        }
        return responseJsonResult;
    }
    /**
     * 分销商请求列表
     * @param pageSize
     * @param pageIndex
     * @return
     */
    @RequestMapping(value ="/verify_distribution" ,method = RequestMethod.GET)
    @ResponseBody
    public PageDataTemplate<User> distributorList(@RequestParam("pageSize") int pageSize,@RequestParam("pageIndex") int pageIndex){
        PageDataTemplate distributorList = userManagerService.findDistributionListAll(pageIndex, pageSize);
        return distributorList;
    }

    /**
     * 分销商冻结
     * @param id
     * @return
     */
   @RequestMapping(value = "/distributor_refuse",method = RequestMethod.GET)
   @ResponseBody
    public  ResponseJsonResult distributorRefuse(@RequestParam("id") int id){
        ResponseJsonResult responseJsonResult =new ResponseJsonResult();
       Integer integer = userManagerService.distributorRefuseResult(id);
       if (integer==1){
           responseJsonResult.setMsg("修改成功");
       }else if (integer==2){
           responseJsonResult.setStatus(301);
           responseJsonResult.setMsg("该账户已冻结，请勿重复操作");
       }else{
           responseJsonResult.setStatus(300);
           responseJsonResult.setMsg("权限不足，修改失败");
       }
       return  responseJsonResult;
   }
    /**
     * 分销商通过
     * @param id
     * @return
     */
    @RequestMapping (value = "/distributor_pass",method = RequestMethod.GET)
    @ResponseBody
    public ResponseJsonResult distributorPass(@RequestParam("id") Integer id){
        ResponseJsonResult responseJsonResult =new ResponseJsonResult();
        Integer integer = userManagerService.distributorPassResult(id);
        if (integer==1){
            responseJsonResult.setMsg("修改成功");
        }else if (integer==2){
            responseJsonResult.setStatus(301);
            responseJsonResult.setMsg("该账户已通过，请勿重复操作");
        }else{
            responseJsonResult.setStatus(300);
            responseJsonResult.setMsg("权限不足，修改失败");
        }
        return  responseJsonResult;
    }
}
