<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>


<%-- <script type="text/javascript">

	function changePage(pageNum){
		//1 将页码的值放入对应表单隐藏域中
			$("#currentPageInput").val(pageNum);
		//2 提交表单
			$("#pageForm").submit();
	};
	
	function changePageSize(pageSize){
		//1 将页码的值放入对应表单隐藏域中
		$("#pageSizeInput").val(pageSize);
	//2 提交表单
		$("#pageForm").submit();
	};
	
	function addProduct(){
		window.location.href = "${pageContext.request.contextPath}/admin/product/add.jsp";
	} 

function delProduct(pid){
	var isDel = confirm("您确认要删除吗？");
	if(isDel){
		//要删除
		location.href = "${pageContext.request.contextPath}/ProductAction_delProduct?pid="+pid;
	}
}
</script> --%>
</HEAD>
<body>
	<br>


	<%-- <form id="Form1" name="Form1"
		action="${pageContext.request.contextPath }/ProductAction_list"
		method="post"> --%>
	<table cellSpacing="1" cellPadding="0" width="100%" align="center"
		bgColor="#f5fafe" border="0">
		<tr>
			<td class="ta_01" align="center" bgColor="#afd1f3"><strong>用户列表</strong>
			</TD>
		</tr>
		
		<tr>
			<td class="ta_01" align="center" bgColor="#f5fafe">
				<table cellspacing="0" cellpadding="1" rules="all"
					bordercolor="gray" border="1" id="DataGrid1"
					style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
					<tr
						style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

						<td align="center" width="18%">用户ID</td>
						<td align="center" width="17%">用户名</td>
						<td align="center" width="17%">真实姓名</td>
						<td align="center" width="17%">邮箱</td>
						<td align="center" width="17%">电话</td>
						<td align="center" width="17%">是否激活</td>
						<!-- <td width="7%" align="center">编辑</td>
						<td width="7%" align="center">删除</td> -->
					</tr>
					<c:forEach items="${userList}" var="user" varStatus="vs">

						<tr onmouseover="this.style.backgroundColor = 'white'"
							onmouseout="this.style.backgroundColor = '#F5FAFE';">
							<td style="cursor: hand; height: 22px" align="center" width="18%">${user.uid}</td>
							<td style="cursor: hand; height: 22px" align="center" width="15%">${user.username}</td>
							<td style="cursor: hand; height: 22px" align="center" width="15%">${user.name }</td>
							<td style="cursor: hand; height: 22px" align="center" width="15%">${user.email}</td>
							<td style="cursor: hand; height: 22px" align="center" width="15%">${user.telephone}</td>
							<td style="cursor: hand; height: 22px" align="center" width="15%">${user.state==1?"是":"否" }</td>
							<%-- <td align="center" style="height: 22px"><a
								href="${ pageContext.request.contextPath}/ProductAction_updateProductUI?pid=${pro.pid}">
									<img src="${pageContext.request.contextPath}/images/i_edit.gif"
									border="0" style="cursor: hand">
							</a> </td>

							<td align="center" style="height: 22px"><a
								href="javascript:void(0);" onclick="delProduct('${pro.pid}')">
									<img src="${pageContext.request.contextPath}/images/i_del.gif"
									width="16" height="16" border="0" style="cursor: hand">
							</a> </td> --%>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	<!-- </form> -->
</body>
</HTML>

