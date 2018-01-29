<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/view/public/common.jspf" %>
</head>
<style type="text/css">
#head{
	height: 100px;
}
#fcc{
	width:1000px;
	margin: 10px auto;
}
{
	border:1px solid black;
}
</style>
	<body>
		
		<div id="head"></div>
		
		<div id="fcc">
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">老师评价表编号:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${teacherEvaluationInfo.teacherEvaluationId }</p>
 				</div>
 				<div class="col-sm-3">
 					<label class="control-label">课程名称:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${teacherEvaluationInfo.courseId }</p>
 				</div>				
 			</div>
 			
 			
 			
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">评价人:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${teacherEvaluationInfo.staffId }</p>
 				</div>
 				<div class="col-sm-3">
 					<label class="control-label">被评价人:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${teacherEvaluationInfo.studentId }</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">上课态度评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${teacherEvaluationInfo.teacherEvaluationClassAttitude }</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">作业完成评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${teacherEvaluationInfo.teacherEvaluationWorkontime }</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">衣着打扮评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${teacherEvaluationInfo.teacherEvaluationBekins }</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">额外的评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${teacherEvaluationInfo.teacherEvaluationExtraEvaluate }</p>
 				</div>				
 			</div>
 			
		</div>
		
		
 		
    	<div class="row">
    		<div class="col-sm-5">
    			
    		</div>	
    		<div class="col-sm-5">
    			<a href="${pageContext.request.contextPath }/evaluation/t_evaluation/load.action?teacherEvaluationId=${teacherEvaluationInfo.teacherEvaluationId}" class="btn btn-success" >修改</a>
	        	<a href="${pageContext.request.contextPath }/evaluation/t_evaluation/delete.action?teacherEvaluationId=${teacherEvaluationInfo.teacherEvaluationId}" class="btn btn-success" >删除</a>
	        	<a href="${pageContext.request.contextPath }/evaluation/t_evaluation/list.action" class="btn btn-waring" >返回上一级</a>
    		</div>
    	</div>
    	
    </div>
		
		
		
	</body>
</html>
