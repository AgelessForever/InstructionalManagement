package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.AnthortyInfo;
import com.guigu.instructional.system.service.AnthortyService;

@Controller
@RequestMapping("system/anthorty")
public class AnthortyController {
	
	@Resource (name = "anthortyServiceImpl")
	private AnthortyService anthortyService;
	
	//权限管理列表	暂时无用
	@RequestMapping("list.action")
	public String list(AnthortyInfo anthortyInfo,Model model) {
		List<AnthortyInfo> list = anthortyService.getAnthortyInfo(anthortyInfo);
		model.addAttribute("list", list);
		
		return "system/anthorty/anthorty_list";
	}
	
	//权限管理展示
	@RequestMapping("show.action")
	public String show(Integer anthortyId,Model model) {
		AnthortyInfo anthortyInfo=anthortyService.getAnthortyInfo(anthortyId);
		model.addAttribute("anthortyInfo", anthortyInfo);
		return "system/anthorty/anthorty_show";
	}
	
	//权限管理增加
	@RequestMapping("add.action")
	public String add(Model model,AnthortyInfo anthortyInfo) {
		boolean result = anthortyService.addAnthorty(anthortyInfo);
		
		if(result) {
			model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
		
	}
	
	//权限管理下拉列表预加载
//	@RequestMapping("load.action")
//	public String load(Integer )
	
	//权限管理更新	暂时无用
	@RequestMapping("update.action")
	public String update(Model model,AnthortyInfo anthortyInfo) {
		boolean result=anthortyService.updateAnthorty(anthortyInfo);
		
		if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
		
	}
	
	
	//权限变更列表	待修改
	@RequestMapping("anthortychangelist.action")
	public String anthortyChangeList(AnthortyInfo anthortyInfo,Model model) {
		List<AnthortyInfo> list = anthortyService.getAnthortyInfo(anthortyInfo);
		model.addAttribute("list", list);
		return "system/anthorty/anthorty_changelist";
	}
	
//	@RequestMapping("")
	
	//权限变更更新	待修改
	@RequestMapping("changeanthorty")
	public String updateAnthortyChange(AnthortyInfo anthortyInfo,Model model) {
		boolean result=anthortyService.updateAnthorty(anthortyInfo);
		
		if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
		
		return this.anthortyChangeList(null, model);
		
	}
	
	
}
