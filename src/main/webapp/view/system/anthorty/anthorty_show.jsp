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

<form action="" class="form-horizontal">
 	<div class="row">
    	<div class="col-xs-9 ">
          <input type="button"   class="btn btn-success"   value="添加权限信息" onClick="javascript:window.location='anthorty_add.html'"/>
         	 <input  type="submit" class="btn btn-info" value="修改权限信息"/>
        	<input  type="submit" class="btn btn-danger" value="删除权限信息"/>
          <a class="btn btn-success" href="${pageContext.request.contextPath }/system/anthorty/addprocess.action">添加权限信息</a>
          <%-- <a class="btn btn-info" href="${pageContext.request.contextPath }/system/anthorty/updateprocess.action">修改权限信息</a> --%>
          <%-- <a class="btn btn-danger" href="${pageContext.request.contextPath }/system/anthorty/delete.action">删除权限信息</a> --%>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-xs-5">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">权限编号</label>
                <div class="col-xs-9">
                	<p class="form-control-static">${anthortyInfo.anthortyId }</p>
                </div>
            </div>
        
        </div>
        <div class="col-xs-5">
            <div class="form-group">
            	<label class="col-xs-3 control-label">权限名称</label>
                <div class="col-xs-9">
                		<p class="form-control-static">${anthortyInfo.anthortyNane }</p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
    	<div class="col-xs-5">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">上级权限</label>
                <div class="col-xs-9">
                	<p class="form-control-static">${anthortyInfo.anthortyPid }</p>
                </div>
            </div>
        
        </div>
        <div class="col-xs-5">
            <div class="form-group">
            	<label class="col-xs-3 control-label">权限URL</label>
                <div class="col-xs-9">
                	<p class="form-control-static">${anthortyInfo.anthortyUrl }</p>
                </div>
            </div>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
    	<div class="col-xs-10">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">备注</label>
                <div class="col-xs-9">
                	<p class="form-control-static">查询用户信息</p>
                </div>
            </div>
        
        </div>

    </div>


</form>

</body>
</html>
