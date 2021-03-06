package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.po.RoleAnthortyInfo;
import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.system.service.AnthortyService;
import com.guigu.instructional.system.service.RoleAnthortyService;
import com.guigu.instructional.system.service.RoleInfoService;

@Controller
@RequestMapping("system/anthortychange")
public class RoleAnthortyController {
	
	@Resource(name="roleAnthortyServiceImpl")
	private RoleAnthortyService roleAnthortyService;
	
	@Resource(name="roleInfoServiceImpl")
	private RoleInfoService roleInfoService;
	
	@Resource(name="anthortyServiceImpl")
	private AnthortyService anthortyService;
	
	
	//列表
	@RequestMapping("anthortychangelist.action")
	public String anthortychangelist(RoleInfo roleInfo,Model model) {
		List<RoleInfo> list =roleInfoService.getRoleInfoList(roleInfo);
        model.addAttribute("list", list);
        return "system/anthortychange/anthorty_changelist";
	}
	
	//更改	预加载
	@RequestMapping("anthortychangeload.action")
	public String anthortychangeload(Integer roleId,Model model) {
		RoleInfo roleInfo = roleInfoService.getRoleInfo(roleId);
		model.addAttribute("roleInfo", roleInfo);
		
		
		List<AnthortyInfo> anthortyInfoList = anthortyService.getAnthortyInfoList(null);
		model.addAttribute("anthortyInfoList", anthortyInfoList);
		System.out.println(anthortyInfoList.size());
		
		
		//测试代码
//		List<RoleAnthortyInfo> roleAnthortyInfoList=roleAnthortyService.getRoleAnthortyByRoleId(roleInfo.getRoleId());
//		for(int i=0;i<roleAnthortyInfoList.size();i++) {
//		System.out.println(roleAnthortyInfoList.get(i).getRoleAnthortyId());}
		/*List<AnthortyInfo> anthortyInfoList = null;
		if(!roleAnthortyInfoList.isEmpty()) {
			for(int i=0;i<roleAnthortyInfoList.size();i++) {
//			List<AnthortyInfo> anthortyInfoList = anthortyService.getAnthortyByAnthortyId(roleAnthortyInfoList.get(i).getAnthortyId());
			anthortyInfoList.add(anthortyService.getAnthortyInfo(roleAnthortyInfoList.get(i).getAnthortyId()));
			}
			System.out.println(anthortyInfoList.size());
		}*/
		
		//测试代码
		
		return "system/anthortychange/anthorty_change";
	}
	
	
	//更新
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
