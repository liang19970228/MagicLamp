<%--
  Created by IntelliJ IDEA.
  User: lwc
  Date: 2019/5/8
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <TITLE>添加客户</TITLE>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
    <LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
          rel=stylesheet>

    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
<FORM id=form1 name=form1
      action="/emp/update"
      method="post">
    <%--<input type="hidden" name="custId" value="${customer.custId }"/>--%>

    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
                              border=0></TD>
            <TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg
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
                        <TD class=manageHead>当前位置：员工管理 &gt; 修改员工信息</TD>
                    </TR>
                    <TR>
                        <TD height=2></TD>
                    </TR>
                </TABLE>
                <TABLE cellSpacing=0 cellPadding=5  border=0>
                    <TR>
                        <td>员工编号 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="empid" readonly="readonly" value="${emp.empid }">
                        </td>
                    </TR>
                    <TR>
                        <td>员工姓名 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="name" readonly="readonly" value="${emp.name }">
                        </td>
                    <TR>
                        <td>员工性别 ：</td>
                        <td>
                            <input type="radio" value="男" name="sex" <c:if test="${emp.sex=='男' }">checked</c:if>>男

                            <input type="radio" value="女" name="sex" <c:if test="${emp.sex=='女' }">checked</c:if>>女
                        </td>
                    </TR>
                    <TR>
                        <td>出生日期 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="birthday" readonly="readonly" value="${emp.birthday }">
                        </td>
                    <TR>
                        <td>籍贯 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="birthplace" readonly="readonly" value="${emp.birthplace }">
                        </td>
                    </TR>
                    <TR>
                        <td>民族 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="nation" readonly="readonly" value="${emp.nation}">
                        </td>
                    <TR>
                        <td>政治面貌 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="political" readonly="readonly" value="${emp.political }">
                        </td>
                    </TR>
                    <TR>
                        <td>基本薪资 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="basesalary" readonly="readonly" value="${emp.basesalary }">
                        </td>
                    </TR>
                    <TR>
                        <td>部门名称 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="dptname" readonly="readonly" value="${emp.dptname}">
                        </td>
                    </TR>
                    <TR>
                        <td>职务名称 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="dutyname" readonly="readonly" value="${emp.dutyname}">
                        </td>
                    </TR>
                    <TR>
                        <td>入职时间 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="entrytime" readonly="readonly" value="${emp.entrytime }">
                        </td>
                    </TR>
                    <TR>
                        <td>学历 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="education" readonly="readonly" value="${emp.education }">
                        </td>
                    </TR>
                    <TR>
                        <td>专业 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="major" readonly="readonly" value="${emp.major }">
                        </td>
                    </TR>
                    <TR>
                        <td>地址 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 400px" maxLength=50 name="address" readonly="readonly" value="${emp.address }">
                        </td>
                    </TR>
                    <TR>
                        <td>电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="telphone" readonly="readonly" value="${emp.telphone }">
                        </td>
                    <TR>
                        <td>邮箱 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="email" readonly="readonly" value="${emp.email }">
                        </td>
                    </TR>
                    <TR>
                        <td>员工状态 ：</td>
                        <td>
                            <%--<INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="status" value="${emp.status }">--%>
                            <c:if test="${emp.status == 1}">在职</c:if>
                            <c:if test="${emp.status == 2}">离职</c:if>
                        </td>
                    <TR>
                        <td>离职时间 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="leavetime" readonly="readonly" value="${emp.leavetime }">
                        </td>
                    </TR>
                    <TR>
                        <td>毕业学校 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2
                                   style="WIDTH: 180px" maxLength=50 name="graduationschool" readonly="readonly" value="${emp.graduationschool }">
                        </td>
                    </TR>
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
