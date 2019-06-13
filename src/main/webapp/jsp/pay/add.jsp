<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<TITLE>查看工资列表</TITLE>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
	<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
		  rel=stylesheet>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
	<SCRIPT language=javascript>
        function to_page(page){
            if(page){
                $("#page").val(page);
            }
            document.customerForm.submit();

        }
	</SCRIPT>

	<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
<FORM id="customerForm" name="customerForm"
	  action="/pay/seePay"
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
			<TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
					src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
			<TD vAlign=top width="100%" bgColor=#ffffff>
				<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
					<TR>
						<TD class=manageHead>当前位置：工资管理 &gt; 工资详情列表</TD>
					</TR>
					<TR>
						<TD height=2></TD>
					</TR>
				</TABLE>
				<TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0
					   width="100%" align=center border=0>
					<TBODY>
					<TR>
						<TD height=25>
							<TABLE cellSpacing=0 cellPadding=2 border=0>
								<TBODY>
								<TR>
									<TD>请输入需要查询的时间：</TD>
									<TD><INPUT class=textbox id=sChannel2 type="date"
											   style="WIDTH: 200px" maxLength=50 name="checkDate" value="${requestScope.checkTime}"></TD>

									<TD><INPUT class=button id=sButton2 type=submit
											   value=" 查询本月工资详情 " name=sButton2></TD>
									<TD><a href="/pay/countPay?checkDate=${requestScope.checkTime}">结算本月工资</a></TD>
								</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>

					<TR>
						<TD>
							<TABLE id=grid
								   style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
								   cellSpacing=1 cellPadding=2 rules=all border=0>
								<TBODY>
								<TR
										style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
									<TD>员工编号</TD>
									<TD>员工姓名</TD>
									<TD>查询年月</TD>
									<TD>个人基本工资</TD>
									<TD>总奖励金额</TD>
									<TD>总惩罚金额</TD>
									<TD>应发总金额</TD>
								</TR>
								<c:forEach items="${requestScope.payPojos }" var="payPojo">
									<TR
											style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
										<TD>${payPojo.empid}</TD>
										<TD>${payPojo.name }</TD>
										<TD>${payPojo.checkdate }</TD>
										<TD>${payPojo.basesalary }</TD>
										<TD>${payPojo.rewards }</TD>
										<TD>${payPojo.punishes }</TD>
										<TD>${payPojo.basesalary+payPojo.rewards-payPojo.punishes }</TD>
									</TR>

								</c:forEach>

								</TBODY>
							</TABLE>
						</TD>
					</TR>

					<TR>
						<TD><SPAN id=pagelink>
											<DIV
													style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
												共[<B>${total}</B>]条记录,[<B>${totalPage}</B>]页
												,每页显示
												<select name="pageSize">

												<option value="1" <c:if test="${pageSize==1 }">selected</c:if>>1</option>
												<option value="30" <c:if test="${pageSize==30 }">selected</c:if>>30</option>
												</select>
												条
												[<A href="javascript:to_page(${page-1})">前一页</A>]
												<B>${page}</B>
												[<A href="javascript:to_page(${page+1})">后一页</A>]
												到
												<input type="text" size="3" id="page" name="page" />
												页

												<input type="button" value="Go" onclick="to_page()"/>
											</DIV>
									</SPAN></TD>
					</TR>
					</TBODY>
				</TABLE>
			</TD>
			<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
					src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
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
