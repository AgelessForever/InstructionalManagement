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
@RequestMapping("system/anthortychange")
public class RoleAnthortyController {
	
	@Resource(name="roleAnthortyServiceImpl")
	private RoleAnthortyService roleAnthortyService;
	
	@Resource(name="roleInfoServiceImpl")
	private RoleInfoService roleInfoService;
	
	@RequestMapping("anthortychangelist.action")
	public String anthortychangelist(RoleInfo roleInfo,Model model) {
		List<RoleInfo> list =roleInfoService.getRoleInfoList(roleInfo);
        model.addAttribute("list", list);
        return "system/anthortychange/anthorty_changelist";
	}
	
	@RequestMapping("anthortychangeload.action")
	public String anthortychangeload(Integer roleId,Model model) {
		RoleInfo roleInfo = roleInfoService.getRoleInfo(roleId);
		model.addAttribute("roleInfo", roleInfo);
		return "system/anthortychange/anthorty_change";
	}
	
	
	@RequestMapping("anthortychangeupdate.action")
    public String anthortychangeupdate(RoleInfo roleInfo,Model model) {
        boolean result=roleInfoService.updateRole(roleInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.anthortychangelist(null, model);
    }
	
	
}
