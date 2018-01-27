package com.guigu.instructional.evaluation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		List<CourseInfo> list=courseInfoService.getCourseList(courseInfo);
		model.addAttribute("list", list);
		
		return "evaluation/course/course_list";
	}
	
	@RequestMapping("add.action")
	public String addCourseInfo(CourseInfo courseInfo,Model model) {
//		courseInfo.setCourseState("1");
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
			model.addAttribute("info", "修改成功");
		}else {
			model.addAttribute("info", "修改失败");
		}
		return this.list(null, model);
	}
	
	@RequestMapping("load.action")
	public String load(Integer courseId,Model model) {
		CourseInfo courseInfo = courseInfoService.getCourse(courseId);
		model.addAttribute("courseInfo", courseInfo);
		return "evaluation/course/course_update";
	}
	
	
	@RequestMapping("update.action")
	public String update(CourseInfo courseInfo,Model model) {
		boolean result=courseInfoService.updateCourse(courseInfo);
		if(result) {
			model.addAttribute("info", "修改成功");
		}else {
			model.addAttribute("info", "修改失败");
		}
		return this.list(null, model);
	}
	
	
//	@RequestMapping("show.action")
//	public String showCourseInfo(Integer courseId,Model model) {
//		
//	}

}
