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
    	<li><a href="#">系统管理</a></li>
        <li>权限管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
	<form action="${pageContext.request.contextPath }/system/anthorty/list.action" class="form-horizontal">
		<div class="col-sm-2">权限名称:</div>
	    <div class="col-sm-3">
	    	<input type="text" name="anthortyNane"  class="form-control input-sm"/>
	    </div>
	    <input type="submit"   class="btn btn-danger"   value="查询"/>
	    <a class="btn btn-warning" href="${pageContext.request.contextPath }/system/anthorty/addprocess.action" paramId="anthortyId" paramProperty="anthortyId" value="添加">添加</a>
	 </form>
</div>

<!-- 提示信息区域 -->

<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">权限信息-${info}</p>
	</div>	
</div>


<div class="row" style="padding:15px; padding-top:0px; ">
    <display:table  class="table  table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/system/anthorty/list.action">
    		<display:column property="anthortyId" title="权限编号"></display:column>
    		<display:column property="anthortyPid" title="上级权限编号"></display:column>
    		<display:column property="anthortyNane" title="权限名称"></display:column>
    		<display:column property="anthortyDesc" title="权限描述"></display:column>
    		<%-- <display:column href="${pageContext.request.contextPath }/system/roleinfo/load.action" paramId="roleId" paramProperty="roleId" value="修改" title="修改"></display:column>
    		<display:column href="${pageContext.request.contextPath }/system/roleinfo/delete.action" paramId="roleId" paramProperty="roleId" value="删除" title="删除"></display:column>
    		 --%>
    		<display:column href="${pageContext.request.contextPath }/system/anthorty/show.action" paramId="anthortyId" paramProperty="anthortyId" value="详情" title="详情"></display:column>
    </display:table>
</div>

</body>
</html>
