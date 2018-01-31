package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.system.service.RoleAnthortyService;
import com.guigu.instructional.system.service.RoleInfoService;

@Controller
@RequestMapping("system/anthotychange")
public class RoleAnthortyController {
	
	@Resource(name="roleAnthortyServiceImpl")
	private RoleAnthortyService roleAnthortyService;
	
	@Resource(name="roleInfoServiceImpl")
	private RoleInfoService roleInfoService;
	
	@RequestMapping("anthotychangelist.action")
	public String anthotychangelist(RoleInfo roleInfo,Model model) {
		List<RoleInfo> list =roleInfoService.getRoleInfoList(roleInfo);
        model.addAttribute("list", list);
        return "system/anthotychange/anthorty_changelist";
	}
	
	@RequestMapping("anthortychangeload.action")
	public String anthortychangeload(Integer roleId,Model model) {
		RoleInfo roleInfo = roleInfoService.getRoleInfo(roleId);
		return "system/anthotychange/anthorty_change";
	}
	
	
	@RequestMapping("anthotychangeupdate.action")
    public String anthotychangeupdate(RoleInfo roleInfo,Model model) {
        boolean result=roleInfoService.updateRole(roleInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.anthotychangelist(null, model);
    }
	
	
	
}
