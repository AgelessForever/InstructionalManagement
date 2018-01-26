package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.system.service.StaffInfoService;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.controller.StaffInfoController</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月26日上午9:15:58 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */
@Controller
@RequestMapping("/system/stffinfo/")
public class StaffInfoController {

    @Resource(name = "staffInfoServiceImpl")
    private StaffInfoService staffInfoService;

    // 进行数据校验  你们的功能
    @RequestMapping("add.action")
    public String addStaffInfo(StaffInfo staffInfo,Model model) {
       staffInfo.setStaffState("1");
       boolean result= staffInfoService.addStaff(staffInfo);
       if(result) {
           model.addAttribute("info","添加成功");
       }else {
           model.addAttribute("info","添加失败");
       }
       return this.list(null, model);
       
    }
    
    @RequestMapping("list.action")
    public String list(StaffInfo staffInfo,Model model) {
        List<StaffInfo> list =staffInfoService.getStaffInfoList(staffInfo);
        System.out.println(list);
        model.addAttribute("list", list);
        
        return "system/staffinfo/staffinfo_list";
    }

}
