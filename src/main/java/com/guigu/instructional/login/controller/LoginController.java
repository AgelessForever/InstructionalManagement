package com.guigu.instructional.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.system.service.RoleInfoService;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/view")
public class LoginController {

	@Resource(name="staffInfoServiceImpl")
	public StaffInfoService staffInfoService;
	
	@Resource(name="roleInfoServiceImpl")
	public RoleInfoService roleInfoService;
	
	
	
	@RequestMapping("login.action")
	public String login(StaffInfo staffInfo,Model model) {
		StaffInfo staffInfo2 = staffInfoService.getStaffInfoByNumber(staffInfo);
						
		if(staffInfo2!=null) {
			int roleid = staffInfo2.getRoleId();
			RoleInfo roleInfo = roleInfoService.getRoleInfo(roleid);
			if(staffInfo.getStaffPassword().equals(staffInfo2.getStaffPassword())) {
				model.addAttribute("role", roleInfo);
				return "index";
			}
		}
		model.addAttribute("info","用户名或密码错误");
		return "login";
	}
	
}
