package com.guigu.instructional.evaluation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.evaluation.mapper.CourseInfoMapper;
import com.guigu.instructional.evaluation.service.StudentEvaluationInfoService;
import com.guigu.instructional.po.CourseInfo;
import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentEvaluationInfo;
import com.guigu.instructional.system.mapper.StaffInfoMapper;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/evaluation/s_evaluation")
public class StudentEvaluationInfoController {

	
	@Resource(name="studentEvaluationServiceImpl")
	private StudentEvaluationInfoService studentEvaluationService;
	
	//这里需要接入
	//@Resource(name="studentInfoServiceImpl")
	//private StudentInfoService studentInfoServiceImpl;
	
	//导入员工信息的映射表
	@Resource(name="staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	//这里需要接入
	//@Resource(name="courseInfoServiceImpl")
	//private CourseInfoService courseInfoService;
    
    
    @RequestMapping("list.action")
    public String list(StudentEvaluationInfo studentEvaluationInfo,Model model) {
        List<StudentEvaluationInfo> list =studentEvaluationService.getStudentEvaluationList(studentEvaluationInfo);
       System.out.println(list);
        model.addAttribute("list", list);            
        return "/evaluation/s_evaluation/s_evaluation_list";
    }
	
    @RequestMapping("loadadd.action")
    public String loadadd(StudentEvaluationInfo studentEvaluationInfo,Model model) {
    	
    	//获得所有的课程列表  待接入
        //List<CourseInfo> courselist = courseInfoService.getCourseInfoList(null);
    	//将查询到的存在课程列表传过去
    	//model.addAttribute("courselist",courselist);
    	
    	//获得的所有学生列表
    	//List<StudentInfo> studentInfolist = studentInfoServiceImpl.getStudentInfoList(null);
    	//将查询到的学生列表传过去
    	//model.addAttribute("studentInfolist",studentInfolist);
    	   	
    	//获得所有职工列表
    	List<StaffInfo> staffInfolist = staffInfoService.getStaffInfoList(null);
   	
    	//将查询到的存在的职工列表传过去
    	model.addAttribute("staffInfolist", staffInfolist);
       

        return "evaluation/s_evaluation/s_evaluation_add";
        
    }    
    //添加角色信息
    @RequestMapping("add.action")
    public String add(Model model,@Validated StudentEvaluationInfo studentEvaluationInfo,BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) {
    		List<ObjectError> allErrors=bindingResult.getAllErrors();
    		model.addAttribute("allErrors", allErrors);
    		
    		this.loadadd(null,model);
    		
    		return "evaluation/s_evaluation/s_evaluation_add";    		
    	}
        boolean reuslt = studentEvaluationService.addStudentEvaluationInfo(studentEvaluationInfo);
        if(reuslt) {
            model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
                
    }
    
    //根据相应id获取角色信息
    @RequestMapping("load.action")
    public String load(Integer studentEvaluationId,Model model) {
    	StudentEvaluationInfo studentEvaluationInfo =studentEvaluationService.getStudentEvaluation(studentEvaluationId);
        model.addAttribute("studentEvaluationInfo", studentEvaluationInfo);
        //获得所有的课程列表  待接入
        //List<CourseInfo> courselist = courseInfoService.getCourseInfoList(null);
    	//将查询到的存在课程列表传过去
    	//model.addAttribute("courselist",courselist);
    	
    	//获得的所有学生列表
    	//List<StudentInfo> studentInfolist = studentInfoServiceImpl.getStudentInfoList(null);
    	//将查询到的学生列表传过去
    	//model.addAttribute("studentInfolist",studentInfolist);
    	   	
    	//获得所有职工列表
    	List<StaffInfo> staffInfolist = staffInfoService.getStaffInfoList(null);
   	
    	//将查询到的存在的职工列表传过去
    	model.addAttribute("staffInfolist", staffInfolist);
    	
        return "evaluation/s_evaluation/s_evaluation_update";        
    }
    
    
    
    //修改学生评价表信息
    @RequestMapping("update.action")
    public String update(StudentEvaluationInfo studentEvaluationInfo,Model model) {
    	
        boolean result=studentEvaluationService.updateStudentEvaluation(studentEvaluationInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
    
    //删除学生评价表信息
    @RequestMapping("delete.action")
    public String delete(StudentEvaluationInfo studentEvaluationInfo,Model model) {
        studentEvaluationInfo.setStudentEvaluationState("0");
        
        boolean result=studentEvaluationService.updateStudentEvaluation(studentEvaluationInfo);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
    
    @RequestMapping("infor.action")
    public String infor(Integer studentEvaluationId,Model model) {
    	StudentEvaluationInfo studentEvaluationInfo =studentEvaluationService.getStudentEvaluation(studentEvaluationId);
        model.addAttribute("studentEvaluationInfo", studentEvaluationInfo);

        return "evaluation/s_evaluation/s_evaluation_infor"; 
    }
}
