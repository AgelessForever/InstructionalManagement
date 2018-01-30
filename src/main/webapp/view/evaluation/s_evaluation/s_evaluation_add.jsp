<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    			<li><a href="#">学生评价表管理</a></li>
        		<li>添加学生评价表</li>
    		</ul>
		</div>
		
		
		
		<form action="${pageContext.request.contextPath}/evaluation/s_evaluation/add.action" method="post" class="form-horizontal">

    	<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
    	
    	<div>
    		<c:if test="${allErrors!=null}">
    		<foreach items=${allErrors} var="error">
    			<p> ${error.defaultMessage}</p>
    		</foreach>
    		</c:if>
    	</div>
    	
    	
		<div class="row">
    		<div class="col-sm-5">
        		<div class="form-group">
            		<label class="col-sm-3 control-label">学生评价表编号</label>
               			<div class="col-sm-9">
                			<input type="text" name="studentEvaluationId" readonly="readonly" class="form-control input-sm" placeholder="请输入编号"/>
                		</div>
            	</div>       
        	</div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">课程名称</label>
                <div class="col-sm-9">
                	<select name="courseName" class="form-control input-sm">
                     	<option>请选择</option> 
                     	<%--这里要等其他东西接入 --%>
                       	<%--  <c:forEach items="${courselist}" var="course">
                            	<option value="${course.courseName}">${course.courseName }</option>
                              </c:forEach> --%>
                   	                   	
                   
                     </select>
                </div>
            </div>
        </div>

    </div>
    
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学生姓名(评价人)</label>
                <div class="col-sm-9">
               		<select name="studentName" class="form-control input-sm">
                     	<option>请选择</option>
                     	
                     	<%--等待接入 --%>
                       	<%--  <c:forEach items="${studentInfolist}" var="studentInfo">
                            	<option value="${studentInfo.studentName}">${studentInfo.studentName}</option>
                        </c:forEach> --%>
                    </select>
                </div>
            </div>
        </div>
        
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">员工姓名(被评人)</label>
                <div class="col-sm-9">
               		<select name="staffName" class="form-control input-sm">
                     	<option>请选择</option>
                        	<c:forEach items="${staffInfolist}" var="staffInfo">
                            	<option value="${staffInfo.staffName}">${staffInfo.staffName}</option>
                        	</c:forEach>            
                    </select>
                </div>
            </div>
        
        </div>

    </div>
    
    
    
    
    <div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">上课内容评价</label>
                <div class="col-sm-9">
               			<input type="text" name="studentEvaluationClassContent" class="form-control input-sm" placeholder="请评价上课内容"/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">上课活跃程度</label>
                <div class="col-sm-9">
               		 <input type="text" name="studentEvaluationClassActivity" class="form-control input-sm" placeholder="请评价课堂气氛"/>
                </div>
            </div>

        </div>

    </div>
    
    
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">员工工作态度</label>
                <div class="col-sm-9">
               	   <input type="text" name="studentEvaluationAnswerPatiently" class="form-control input-sm" placeholder="请评价员工工作态度"/>
                </div>
           	 </div>
    		</div>
    		
    		<div class="col-sm-5">
        		<div class="form-group">
            		<label class="col-sm-3 control-label">额外的评价</label>
                	<div class="col-sm-9">
               		 	<input type="text" name="studentEvaluationExtraEvaluate" class="form-control input-sm" placeholder="是否还有想说的..."/>
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
    				<a class="btn btn-warning" href="${pageContext.request.contextPath }/evaluation/s_evaluation/list.action">返回上一级</a>
    			</div>
    		<div class="col-sm-3"></div> 
    	
    		</div>
    	</form>	
	</body>
</html>
