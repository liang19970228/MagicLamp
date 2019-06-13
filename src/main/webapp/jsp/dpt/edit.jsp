<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<TITLE>添加联系人</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="/dpt/update"
		method="post">
		<%--<input type="hidden" name="empDpt" value="${emp.getDptByDptid().getDptid() }"/>--%>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						 height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：部门管理 &gt; 修修改部门信息</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<tr>
								<td>部门编号 ：</td>
								<td colspan="3"><input type="text" name="dptid" readonly="readonly" style="WIDTH: 180px" value="${dpt.dptid}" /></td>
							</tr>
							<TR>
								<td>部门名称 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="name" value="${dpt.name}" >
								</td>
							</TR>
							<TR>
								<td>父部门名称 ：</td>
								<td>
									<select id="sChannel2" name="parentid">
										<option value="">  </option>
										<c:forEach var="dpt1" items="${requestScope.dpts}">
											<option value="${dpt1.dptid}" <c:if test="${dpt.getDptByParentid().getDptid() == dpt1.dptid }"> selected="selected" </c:if> >${dpt1.name}</option>
										</c:forEach>
									</select>
									<%--<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="parentid" value="${dpt.dptByParentid}" >--%>
								</td>
							</TR>
							<TR>
								<td>部门描述 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="desc" value="${dpt.dptdesc}" >
								</td>
							</TR>
							<TR>
								<td colspan="2">
									<button>提交</button>
								</td>
							</TR>
							<%--<TR>
								<td>联系人性别：</td>
								<td>
								<input type="radio" value="1" name="lkmGender" <c:if test="${linkman.lkmGender=='1' }">checked</c:if>>男
								
								<input type="radio" value="2" name="lkmGender" <c:if test="${linkman.lkmGender=='2' }">checked</c:if>>女
								</td>
							</TR>--%>

						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
