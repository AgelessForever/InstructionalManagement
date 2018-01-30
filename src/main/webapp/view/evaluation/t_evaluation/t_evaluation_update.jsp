<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        		<li>修改老师评价表</li>
    		</ul>
		</div>
		
		
		<form action="${pageContext.request.contextPath }/evaluation/t_evaluation/update.action" method="post" class="form-horizontal">

    	<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
		<div class="row">
		
			<%-- <div class="col-sm-12">
        	<div class="form-group">
            	<!-- 显示错误信息 -->
				<c:if test="${allErrors!=null }">
					 <c:forEach items="${allErrors}" var="error">
					 	<p align="center" style="color: red;">${error.defaultMessage }</p>
					 	<br/>
					 </c:forEach>
				</c:if>
            </div>
        
        	</div> --%>
		
		
    		<div class="col-sm-5">
        		<div class="form-group">
            		<label class="col-sm-3 control-label">老师评价表编号</label>
               			<div class="col-sm-9">
                			<input type="text" name="teacherEvaluationId"  value="${teacherEvaluationInfo.teacherEvaluationId }"  readonly="readonly"  class="form-control input-sm" placeholder="请输入编号"/>
                		</div>
            	</div>       
        	</div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">课程名称</label>
                <div class="col-sm-9">
                	<select name="courseName" class="form-control input-sm">
                     	<!-- <option>请选择</option> -->
                     	<c:forEach items="${courselist}" var="course">
                     		<option value ="${course.courseName }" ${course.courseName==teacherEvaluationInfo.courseName?'selected':'' }>${course.courseName }</option>
                     	</c:forEach>
                     </select>
                </div>
            </div>
        </div>

    </div>
    
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">员工姓名(评价人)</label>
                <div class="col-sm-9">
               		<select name="staffName" class="form-control input-sm">
                     	<!-- <option>请选择</option> -->
                        <c:forEach items="${stafflist}" var="staff">
                     		<option value ="${staff.staffName }" ${staff.staffName==teacherEvaluationInfo.staffName?'selected':'' }>${staff.staffName }</option>
                     	</c:forEach>
                    </select>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学生姓名(被评人)</label>
                <div class="col-sm-9">
               		<select name="studentName" class="form-control input-sm">
                     	<!-- <option>请选择</option> -->
                        <c:forEach items="${studentlist}" var="student">
                     		<option value ="${student.studentName }" ${student.studentName==teacherEvaluationInfo.studentName?'selected':'' }>${student.studentName }</option>
                     	</c:forEach>
                    </select>
                </div>
            </div>
        
        </div>

    </div>
    
    
    
    
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">上课态度评价</label>
                <div class="col-sm-9">
               			<input type="text" name="teacherEvaluationClassAttitude" value="${teacherEvaluationInfo.teacherEvaluationClassAttitude }" class="form-control input-sm" placeholder="该生上课态度..."/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">作业完成程度评价</label>
                <div class="col-sm-9">
               		 <input type="text" name="teacherEvaluationWorkontime" value="${teacherEvaluationInfo.teacherEvaluationWorkontime }" teacherEvaluationClassAttitude class="form-control input-sm" placeholder="他喜欢做作业吗.."/>
                </div>
            </div>

        </div>

    </div>
    
    
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">着装打扮评价</label>
                <div class="col-sm-9">
               	   <input type="text" name="teacherEvaluationBekins" value="${teacherEvaluationInfo.teacherEvaluationBekins }" class="form-control input-sm" placeholder="不会喜欢奇装异服吧..."/>
                </div>
           	 </div>
    		</div>
    		<div class="col-sm-5">
        		<div class="form-group">
            		<label class="col-sm-3 control-label">额外的评价</label>
                	<div class="col-sm-9">
               		 	<input type="text" name="teacherEvaluationExtraEvaluate" value="${teacherEvaluationInfo.teacherEvaluationExtraEvaluate }" class="form-control input-sm" placeholder="是否还有想说的..."/>
                	</div>
            	</div>

        	</div>

    	</div>

  	
    	
    	 <div class="row">
    	<div class="col-sm-5"></div>
    	<div class="col-sm-1">
    		<input id="cy" type="submit" class="btn btn-success" value="保存"/>
    	</div>
    	<div class="col-sm-3">
    		<a href="${pageContext.request.contextPath }/evaluation/t_evaluation/list.action">返回上一级</a>
    	</div>
    	<div class="col-sm-3"></div>
    	
    </div>
    	
    	
	</form>
		
	
	</body>
</html>
