<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<TITLE>添加员工</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="/emp/addEmp"
		method="post">
		

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
								<TD class=manageHead>当前位置：员工管理 &gt; 添加员工</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>员工姓名：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="name" placeholder="请输入员工姓名">
								</td>
								<td>员工性别 ：</td>
								<td>
									<input type="radio" value="男" name="sex">男
									<input type="radio" value="女" name="sex">女
								</td>
							</TR>
							
							<TR>
								
								<td>出生日期 ：</td>
								<td>
								<INPUT class=textbox id="sChannel2" type="date"
														style="WIDTH: 180px" maxLength=50 name="birthday" placeholder="请输入出生如期 格式yyyy-MM-dd">
								</td>
								<td>籍贯 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="birthplace" placeholder="请输入籍贯">
								</td>
							</TR>

							<TR>
								<td>民族：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="nation" placeholder="请输入民族">
								</td>
								<td>政治面貌 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="political" placeholder="请输入政治面貌">
								</td>
							</TR>

							<TR>

								<td>基本薪资 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="basesalary" placeholder="请输入基本薪资">
								</td>
								<td>职务名称 ：</td>
								<td>
									<select id="sChannel2" name="dutyid">
										<option value="">请选择职务</option>
										<c:forEach var="duty" items="${requestScope.dutys}">
											<option value="${duty.dutyid}" >${duty.name}</option>
										</c:forEach>
									</select>
								</td>
							</TR>

							<TR>
								<td>部门名称：</td>
								<td>
									<select id="sChannel2" name="dptid">
										<option value="">请选择部门</option>
										<c:forEach var="dpt" items="${requestScope.dpts}">
											<option value="${dpt.dptid}" >${dpt.name}</option>
										</c:forEach>
									</select>
								</td>
								<td>入职时间 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2 type="date"
										   style="WIDTH: 180px" maxLength=50 name="entrytime">
								</td>
							</TR>

							<TR>
								<td>学历 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="education" placeholder="请输入学历">
								</td>
								<td> 毕业学校：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="graduationschool" placeholder="请输入毕业学校">
								</td>

							</TR>

							<TR>
								<td>专业 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="major" placeholder="请输入专业名称">
								</td>
								<td>地址：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="address" placeholder="请输入地址">
								</td>
							</TR>

							<TR>

								<td>邮箱 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="email" placeholder="请输入邮箱地址">
								</td>
								<td> 员工状态：</td>
								<td>
									<%--<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="status">--%>
									<select id="sChannel2" name="status">
										<option value="1" selected="selected">在职</option>
										<option value="2">离职</option>
									</select>
								</td>
							</TR>
							<TR>
								<td>电话 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="telphone" placeholder="请输入电话号码">
								</td>

								<%--<td>离职时间 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										   style="WIDTH: 180px" maxLength=50 name="leavetime">
								</td>--%>


							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
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
<script src="${pageContext.request.contextPath}laydate/laydate.js"></script>
<script>
    ;!function(){
        laydate({
            elem: '#demo'
        })
    }();
</script>
</HTML>
