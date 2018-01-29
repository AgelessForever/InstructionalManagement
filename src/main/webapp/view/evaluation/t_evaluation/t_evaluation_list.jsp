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
	<body>
		
		<div style="padding:0px; margin:0px;">
 			<ul class="breadcrumb" style="  margin:0px; " >
    			<li><a href="#">老师评价表管理</a></li>
        		<li>老师评价表信息</li>
    		</ul>
		</div>

		<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
			<form class="form-inline" action="${pageContext.request.contextPath}/evaluation/t_evaluation/list.action">
	
	     		<div class="form-group">
	         	<label class="" for="activename">老师评价表编号：</label>
	        	<input type="text" name="teacherEvaluationId" class="form-control" id="activename" placeholder="请输入老师评价表编号">
	      		</div>
	
	    		<input type="submit"   class="btn btn-danger"     value="查询"/>
	    		<%-- <input type="button"   class="btn btn-success"   value="添加" onClick="javascript:window.location='${pageContext.request.contextPath }/view/evaluation/t_evaluation/t_evaluation_add.jsp'"/> --%>
	    		<a class="btn btn-waring" href="${pageContext.request.contextPath }/evaluation/t_evaluation/addprocess.action" paramId="teacherEvaluationId" paramProperty="teacherEvaluationId" value="添加">添加</a>
	    	</form>
		</div>
		
		<!-- 提示信息区域 -->

		<div align="center">
			<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
				<button type="button" class="close" data-dismiss="alert">
					<span aria-hidden="true">&times;</span>
					
				</button>
				<p align="center" style="color: red;">教师评价表-${info}</p>
			</div>	
		</div>
		
		
		<div class="row" style="padding:15px; padding-top:0px; ">
		<display:table  class="table  table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/system/roleinfo/list.action">
    		<display:column property="teacherEvaluationId" title="编号"></display:column>
    		<display:column property="staffName" title="员工名称"></display:column>
    		<display:column property="studentName" title="学生名称"></display:column>
    		<display:column property="courseName" title="课程名称"></display:column>
    		<display:column href="${pageContext.request.contextPath}/evaluation/t_evaluation/infor.action" paramId="teacherEvaluationId" paramProperty="teacherEvaluationId" value="详细信息" title="详细信息"></display:column>
    		<display:column href="${pageContext.request.contextPath }/evaluation/t_evaluation/updateprocess.action" paramId="teacherEvaluationId" paramProperty="teacherEvaluationId" value="修改" title="修改"></display:column>
    		<display:column href="${pageContext.request.contextPath }/evaluation/t_evaluation/delete.action" paramId="teacherEvaluationId" paramProperty="teacherEvaluationId" value="删除" title="删除"></display:column>
    	
    		
  		  </display:table>
		</div>

		
		
		
	</body>
</html>