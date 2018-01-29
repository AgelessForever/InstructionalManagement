package com.guigu.instructional.evaluation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.evaluation.service.CourseInfoService;
import com.guigu.instructional.po.CourseInfo;

@Controller
@RequestMapping("/evaluation/course/")
public class CourseInfoController {
	
	@Resource (name = "courseInfoServiceImpl")
	private CourseInfoService courseInfoService;
	
	@RequestMapping("list.action")
	public String list(CourseInfo courseInfo,Model model) {
		List<CourseInfo> list=courseInfoService.getCourseInfoList(courseInfo);
		model.addAttribute("list", list);
		
		return "evaluation/course/course_list";
	}
	
	@RequestMapping("add.action")
	public String addCourseInfo(Model model,@Validated CourseInfo courseInfo,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			return "evaluation/course/course_add";
		}
		
		boolean result = courseInfoService.addCourse(courseInfo);
		if(result) {
			model.addAttribute("info", "添加成功");
		}else {
			model.addAttribute("info", "添加失败");
		}
		return this.list(null,model);
	}
	
	@RequestMapping("delete.action")
	public String delete(CourseInfo courseInfo,Model model) {
		courseInfo.setCourseState("0");
		
		boolean result = courseInfoService.updateCourse(courseInfo);
		if(result) {
			model.addAttribute("info", "删除成功");
		}else {
			model.addAttribute("info", "删除失败");
		}
		return this.list(null, model);
	}
	
	@RequestMapping("load.action")
	public String load(Integer courseId,Model model) {
		CourseInfo courseInfo = courseInfoService.getCourseInfo(courseId);
		model.addAttribute("courseInfo", courseInfo);
		return "evaluation/course/course_update";
	}
	
	
	@RequestMapping("update.action")
	public String update(Model model,@Validated CourseInfo courseInfo,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			return "evaluation/course/course_update";
		}
		
		boolean result=courseInfoService.updateCourse(courseInfo);
		if(result) {
			model.addAttribute("info", "修改成功");
		}else {
			model.addAttribute("info", "修改失败");
		}
		return this.list(null, model);
	}
	
	
}
