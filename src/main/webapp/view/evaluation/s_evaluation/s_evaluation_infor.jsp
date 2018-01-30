<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
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
 					<label class="control-label">学生评价表编号:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${studentEvaluationInfo.studentEvaluationId}</p>
 				</div>
 				<div class="col-sm-3">
 					<label class="control-label">课程名称:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${studentEvaluationInfo.courseName}</p>
 				</div>				
 			</div>
 			
 			
 			
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">评价人:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${studentEvaluationInfo.studentName}</p>
 				</div>
 				<div class="col-sm-3">
 					<label class="control-label">被评价人:</label>
 				</div>
 				<div class="col-sm-3">
 					<p>${studentEvaluationInfo.staffName}</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">上课内容评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${studentEvaluationInfo.studentEvaluationClassContent}</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">课堂活跃程度:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${studentEvaluationInfo.studentEvaluationClassActivity}</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">是否耐心解答问题:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${studentEvaluationInfo.studentEvaluationAnswerPatiently}</p>
 				</div>				
 			</div>
 			
 			<div class="row">
 				<div class="col-sm-3">
 					<label class="control-label">额外的评价:</label>
 				</div>
 				<div class="col-sm-9">
 					<p>${studentEvaluationInfo.studentEvaluationExtraEvaluate}</p>
 				</div>				
 			</div>
 			
		</div>
		
		
 		
    	<div class="row">
    		<div class="col-sm-5">
    			
    		</div>	
    		<div class="col-sm-5">
    			<a class="btn btn-warning" href="${pageContext.request.contextPath }/evaluation/s_evaluation/list.action">返回上一级</a>
    		</div>
    	</div>
    	
    </div>
		
		
		
	</body>
</html>
