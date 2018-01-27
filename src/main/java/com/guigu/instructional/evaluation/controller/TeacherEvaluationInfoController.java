package com.guigu.instructional.evaluation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.evaluation.service.TeacherEvaluationInfoService;
import com.guigu.instructional.po.TeacherEvaluationInfo;

@Controller
@RequestMapping("/evaluation/t_evaluation")
public class TeacherEvaluationInfoController {
	
	@Resource(name = "teacherEvaluationInfoServiceImpl")
	private TeacherEvaluationInfoService teacherEvaluationInfoService;
	
	@RequestMapping("list.action")
	public String list(TeacherEvaluationInfo teacherEvaluationInfo,Model model) {
		List<TeacherEvaluationInfo> list = teacherEvaluationInfoService.getTeacherEvaluationInfoList(teacherEvaluationInfo);
		model.addAttribute("list", list);
		return "evaluation/t_evaluation/t_evaluation_list";
	}
	
	@RequestMapping("add.action")
	public String add(TeacherEvaluationInfo teacherEvaluationInfo,Model model) {
		boolean result = teacherEvaluationInfoService.addTeacherEvaluation(teacherEvaluationInfo);
		if(result) {
			model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
	}
	
	@RequestMapping("delete.action")
	public String delete(TeacherEvaluationInfo teacherEvaluationInfo,Model model) {
		teacherEvaluationInfo.setTeacherEvaluationState("0");
		
		boolean result = teacherEvaluationInfoService.updateTeacherEvaluation(teacherEvaluationInfo);
		if(result) {
			model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
	}
	
	@RequestMapping("load.action")
	public String load(Integer teacherEvaluationId,Model model) {
		TeacherEvaluationInfo teacherEvaluationInfo = teacherEvaluationInfoService.getTeacherEvaluationInfo(teacherEvaluationId);
		model.addAttribute("teacherEvaluationInfo", teacherEvaluationInfo);
		return "evaluation/t_evaluation/t_evaluation_update";
	}
	
	@RequestMapping("update.action")
	public String update(TeacherEvaluationInfo teacherEvaluationInfo,Model model) {
		boolean result = teacherEvaluationInfoService.updateTeacherEvaluation(teacherEvaluationInfo);
		if(result) {
			model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
	}
	
	@RequestMapping("infor.action")
	public String infor(Integer teacherEvaluationId,Model model) {
		TeacherEvaluationInfo teacherEvaluationInfo = teacherEvaluationInfoService.getTeacherEvaluationInfo(teacherEvaluationId);
		model.addAttribute("teacherEvaluationInfo", teacherEvaluationInfo);
		return "evaluation/t_evaluation/t_evaluation_infor";
	}
	
	
}
