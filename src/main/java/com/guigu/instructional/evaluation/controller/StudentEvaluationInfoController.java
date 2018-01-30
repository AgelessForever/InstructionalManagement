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
	
	//������Ҫ����
	//@Resource(name="studentInfoServiceImpl")
	//private StudentInfoService studentInfoServiceImpl;
	
	//����Ա����Ϣ��ӳ���
	@Resource(name="staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	//������Ҫ����
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
    	
    	//������еĿγ��б�  ������
        //List<CourseInfo> courselist = courseInfoService.getCourseInfoList(null);
    	//����ѯ���Ĵ��ڿγ��б���ȥ
    	//model.addAttribute("courselist",courselist);
    	
    	//��õ�����ѧ���б�
    	//List<StudentInfo> studentInfolist = studentInfoServiceImpl.getStudentInfoList(null);
    	//����ѯ����ѧ���б���ȥ
    	//model.addAttribute("studentInfolist",studentInfolist);
    	   	
    	//�������ְ���б�
    	List<StaffInfo> staffInfolist = staffInfoService.getStaffInfoList(null);
   	
    	//����ѯ���Ĵ��ڵ�ְ���б���ȥ
    	model.addAttribute("staffInfolist", staffInfolist);
       

        return "evaluation/s_evaluation/s_evaluation_add";
        
    }    
    //��ӽ�ɫ��Ϣ
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
            model.addAttribute("info", "��ӳɹ�");
        }else {
            model.addAttribute("info", "���ʧ��");
        }
        return this.list(null, model);
                
    }
    
    //������Ӧid��ȡ��ɫ��Ϣ
    @RequestMapping("load.action")
    public String load(Integer studentEvaluationId,Model model) {
    	StudentEvaluationInfo studentEvaluationInfo =studentEvaluationService.getStudentEvaluation(studentEvaluationId);
        model.addAttribute("studentEvaluationInfo", studentEvaluationInfo);
        //������еĿγ��б�  ������
        //List<CourseInfo> courselist = courseInfoService.getCourseInfoList(null);
    	//����ѯ���Ĵ��ڿγ��б���ȥ
    	//model.addAttribute("courselist",courselist);
    	
    	//��õ�����ѧ���б�
    	//List<StudentInfo> studentInfolist = studentInfoServiceImpl.getStudentInfoList(null);
    	//����ѯ����ѧ���б���ȥ
    	//model.addAttribute("studentInfolist",studentInfolist);
    	   	
    	//�������ְ���б�
    	List<StaffInfo> staffInfolist = staffInfoService.getStaffInfoList(null);
   	
    	//����ѯ���Ĵ��ڵ�ְ���б���ȥ
    	model.addAttribute("staffInfolist", staffInfolist);
    	
        return "evaluation/s_evaluation/s_evaluation_update";        
    }
    
    
    
    //�޸�ѧ�����۱���Ϣ
    @RequestMapping("update.action")
    public String update(StudentEvaluationInfo studentEvaluationInfo,Model model) {
    	
        boolean result=studentEvaluationService.updateStudentEvaluation(studentEvaluationInfo);
        if(result) {
            model.addAttribute("info", "�޸ĳɹ�");
        }else {
            model.addAttribute("info", "�޸�ʧ��");
        }
        return this.list(null, model);
    }
    
    //ɾ��ѧ�����۱���Ϣ
    @RequestMapping("delete.action")
    public String delete(StudentEvaluationInfo studentEvaluationInfo,Model model) {
        studentEvaluationInfo.setStudentEvaluationState("0");
        
        boolean result=studentEvaluationService.updateStudentEvaluation(studentEvaluationInfo);
        if(result) {
            model.addAttribute("info", "ɾ���ɹ�");
        }else {
            model.addAttribute("info", "ɾ��ʧ��");
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
