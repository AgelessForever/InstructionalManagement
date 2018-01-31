<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
    	<li><a href="#">系统管理</a></li>
        <li>权限变更</li>
    </ul>
<form action="${pageContext.request.contextPath }/system/anthortychange/anthortychangeupdate.action" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">角色编号</label>
                <div class="col-sm-9">
                <input type="hidden" name="roleId" value="${roleInfo.roleId }">
                	<p  class="form-control-static">${roleInfo.roleId }</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">角色名称</label>
                <div class="col-sm-9">
                	<p  class="form-control-static">${roleInfo.roleName }</p>
                </div>
            </div>
        </div>

    </div>
  <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">菜单信息</h5> 
  <table class="table">
  	<tr>
    	<th>一级菜单</th>
       <!--  <th>二三...级菜单</th> -->
    </tr>
    <tr>
    	<td>
        	<label class="checkbox-inline">
        		<label>系统管理</label>
            	<input type="radio" name="roleAnthortyOne" ${roleInfo.roleAnthortyOne==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortyOne" ${roleInfo.roleAnthortyOne==0?'checked':'' }value="0">否
             </label>
        </td>
    </tr>    
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>营销管理</label>
            	<input type="radio" name="roleAnthortyTwo" ${roleInfo.roleAnthortyTwo==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortyTwo" ${roleInfo.roleAnthortyTwo==0?'checked':'' }value="0">否
             </label>
        </td>
    </tr>    
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>招生管理</label>
            	<input type="radio" name="roleAnthortyThree" ${roleInfo.roleAnthortyThree==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortyThree" ${roleInfo.roleAnthortyThree==0?'checked':'' } value="0">否
             </label>
        </td>
    </tr>    
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>班级管理</label>
            	<input type="radio" name="roleAnthortyFour" ${roleInfo.roleAnthortyFour==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortyFour" ${roleInfo.roleAnthortyFour==0?'checked':'' } value="0">否
             </label>
        </td>
    </tr>
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>学员管理</label>
            	<input type="radio" name="roleAnthortyFive" ${roleInfo.roleAnthortyFive==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortyFive" ${roleInfo.roleAnthortyFive==0?'checked':'' } value="0">否
             </label>
        </td>
    </tr>
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>财务管理</label>
            	<input type="radio" name="roleAnthortySix" ${roleInfo.roleAnthortySix==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortySix" ${roleInfo.roleAnthortySix==0?'checked':'' } value="0">否
             </label>
        </td>
    </tr>
    <tr>
    	<td>
        	<label class="checkbox-inline">
        	<label>评价管理</label>
            	<input type="radio" name="roleAnthortySeven" ${roleInfo.roleAnthortySeven==1?'checked':'' } value="1">是
            	<input type="radio" name="roleAnthortySeven" ${roleInfo.roleAnthortySeven==0?'checked':'' } value="0">否
             </label>
        </td>
    </tr>
    
    <!-- <tr>
    	<td>
        	<label class="checkbox-inline">
            	<input type="checkbox" name="anthortyOne"  value="">财务管理
             </label>
        </td>
    </tr>
    <tr>
    	<td>
        	<label class="checkbox-inline">
            	<input type="checkbox" name="anthortyOne" value="">财务管理
             </label>
        </td>
    </tr> -->
  
  </table>   
       	<div class="row">
    	<div class="col-sm-5 col-sm-offset-4">
          	<input type="submit" class="btn btn-success" value="权限变更"/>
          	<a href="${pageContext.request.contextPath }/system/anthortychange/anthortychangelist.action">返回上一级</a>
        </div>
    </div>
    
</form>        
</div>
</body>
</html>
