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
import com.guigu.instructional.evaluation.service.TeacherEvaluationInfoService;
import com.guigu.instructional.po.CourseInfo;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.TeacherEvaluationInfo;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/evaluation/t_evaluation")
public class TeacherEvaluationInfoController {
	
	@Resource(name = "teacherEvaluationInfoServiceImpl")
	private TeacherEvaluationInfoService teacherEvaluationInfoService;
	
	@Resource(name = "courseInfoServiceImpl")
	private CourseInfoService courseInfoService;
	
	@Resource(name = "staffInfoServiceImpl")
    private StaffInfoService staffInfoService;
	
	/*@Resource(name = "studentInfoServiceImpl")
	private StudentInfoService studentInfoService;*/
	
	@RequestMapping("list.action")
	public String list(TeacherEvaluationInfo teacherEvaluationInfo,Model model) {
//		System.out.println(teacherEvaluationInfo);
		List<TeacherEvaluationInfo> list = teacherEvaluationInfoService.getTeacherEvaluationInfoList(teacherEvaluationInfo);
		model.addAttribute("list", list);
		
		
		return "evaluation/t_evaluation/t_evaluation_list";
	}
	
	@RequestMapping("add.action")
	public String add(Model model,@Validated TeacherEvaluationInfo teacherEvaluationInfo,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			addprocess(teacherEvaluationInfo.getTeacherEvaluationId(), model);
			
			return "evaluation/t_evaluation/t_evaluation_add";
		}
		
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
			model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
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
	public String update(Model model,@Validated TeacherEvaluationInfo teacherEvaluationInfo,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			updateprocess(teacherEvaluationInfo.getTeacherEvaluationId(), model);
			
			return "evaluation/t_evaluation/t_evaluation_update";
		}
		
		boolean result = teacherEvaluationInfoService.updateTeacherEvaluation(teacherEvaluationInfo);
		if(result) {
			model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
	}
	
	@RequestMapping("infor.action")
	public String infor(Integer teacherEvaluationId,Model model) {
		TeacherEvaluationInfo teacherEvaluationInfo = teacherEvaluationInfoService.getTeacherEvaluationInfo(teacherEvaluationId);
		model.addAttribute("teacherEvaluationInfo", teacherEvaluationInfo);
		return "evaluation/t_evaluation/t_evaluation_infor";
	}
	
	@RequestMapping("addprocess.action")
	public String addprocess(Integer teacherEvaluationId,Model model) {
		TeacherEvaluationInfo teacherEvaluationInfo = teacherEvaluationInfoService.getTeacherEvaluationInfo(teacherEvaluationId);
		model.addAttribute("teacherEvaluationInfo", teacherEvaluationInfo);
		//查询所有的课程
		List<CourseInfo> courselist =courseInfoService.getCourseInfoList(null);
		model.addAttribute("courselist", courselist);
		//查询所有的员工
		List<StaffInfo> stafflist = staffInfoService.getStaffInfoList(null);
		model.addAttribute("stafflist", stafflist);
		//查询所有的学员
		/*List<StudentInfo> studentlist = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentlist", studentlist);*/
		return "evaluation/t_evaluation/t_evaluation_add";
	}
	
	@RequestMapping("updateprocess.action")
	public String updateprocess(Integer teacherEvaluationId,Model model) {
		TeacherEvaluationInfo teacherEvaluationInfo = teacherEvaluationInfoService.getTeacherEvaluationInfo(teacherEvaluationId);
		model.addAttribute("teacherEvaluationInfo", teacherEvaluationInfo);
		//查询所有的课程
		List<CourseInfo> courselist =courseInfoService.getCourseInfoList(null);
		model.addAttribute("courselist", courselist);
		//查询所有的员工
		List<StaffInfo> stafflist = staffInfoService.getStaffInfoList(null);
		model.addAttribute("stafflist", stafflist);
		//查询所有的学员
		/*List<StudentInfo> studentlist = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentlist", studentlist);*/
		return "evaluation/t_evaluation/t_evaluation_update";
	}
	
	
}
