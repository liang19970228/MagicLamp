<%--
  Created by IntelliJ IDEA.
  User: lwc
  Date: 2019/3/20
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <STYLE type=text/css>
        BODY {
            FONT-SIZE: 20px; COLOR: #ffffff; FONT-FAMILY: 宋体; text-align: center;
        }
        TD {
            FONT-SIZE: 20px; COLOR: #ffffff; FONT-FAMILY: 宋体
        }
        #divcss5
        {
            margin:0 auto;border:1px solid #000;width:300px;height:100px
        }
    </STYLE>
    <%--<script type="text/javascript">
        function login() {
            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "/admin/loginAdmin" ,//url
                data: JSON.stringify({
                    username : $("input[name='username']").val(),
                    password: $("input[name='password']").val(),
                }),
                contentType: "application/json;charset=UTF-8",
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.resultCode == 200) {
                        alert("SUCCESS");
                    };
                },
                error : function(errMessage) {
                    alert(errMessage);
                }
            });
        }
    </script>--%>

    <META content="MSHTML 6.00.6000.16809" name=GENERATOR></HEAD>
<BODY style="background-color:#2B2B2B">
<div>
    <div style="margin: 0 auto;margin-top: 200px; margin-bottom: 20px">
                <span style="font-size: 50px">基于WEB的人事管理系统</span>

    </div>
    <img src="${pageContext.request.contextPath }/images/logo.jpg" style="width: 150px; height:150px; ">

    <div style="position: absolute;top: 430px; left: 630px">

        <form action="/admin/loginAdmin" method="post">
            <table width="250" bgcolor="#2B2B2B" border="0">
                <tr align=center style="height: 30px">
                    <td>用户名</td><td><input type="text" name="username" id="username" placeholder="请输入用户名"></td>
                </tr>
                <tr align=center style="height: 30px"><td>密 码</td><td><input type="password" name="password" id="password" placeholder="请输入密码"></td></tr>
                <tr align=center style="height: 30px"><td><button>登 陆</button></td>  &nbsp;&nbsp;&nbsp;  <td> <input type="reset" value="重 置"/></td></tr>
                <tr>
                    <td colspan="2" style="color: red;text-align: center;font-size: 15px">${requestScope.message}</td>
                </tr>
            </table>
        </form>
    </div>
</div>
<%--<FORM id=form1 name=form1 action="/admin/loginAdmin" method="post">

    <DIV id=UpdatePanel1>
        <DIV id=div1
             style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
        <DIV id=div2
             style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>


        <DIV>&nbsp;&nbsp; </DIV>
        <DIV>
            <TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>
                <TBODY>
                <TR>
                    <TD style="HEIGHT: 105px"><IMG src="../images/login_1.gif"
                                                   border=0></TD></TR>
                <TR>
                    <TD background=${pageContext.request.contextPath }/images/login_2.jpg height=300>
                        <TABLE height=300 cellPadding=0 width=900 border=0>
                            <TBODY>
                            <TR>
                                <TD colSpan=2 height=35></TD></TR>
                            <TR>
                                <TD width=360></TD>
                                <TD>
                                    <TABLE cellSpacing=0 cellPadding=2 border=0>
                                        <TBODY>
                                        <TR>
                                            <TD style="HEIGHT: 28px" width=80>登 录 名：</TD>
                                            <TD style="HEIGHT: 28px" width=150><INPUT id=username
                                                                                      style="WIDTH: 130px" name=username></TD>
                                            <TD style="HEIGHT: 28px" width=370><SPAN
                                                    id=RequiredFieldValidator3
                                                    style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</SPAN></TD></TR>
                                        <TR>
                                            <TD style="HEIGHT: 28px">登录密码：</TD>
                                            <TD style="HEIGHT: 28px"><INPUT id=password style="WIDTH: 130px"
                                                                            type=password name=password></TD>
                                            <TD style="HEIGHT: 28px"><SPAN id=RequiredFieldValidator4
                                                                           style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</SPAN>
                                            </TD>
                                        </TR>
                                        &lt;%&ndash;<TR>
                                            <TD style="HEIGHT: 28px">验证码：</TD>
                                            <TD style="HEIGHT: 28px"><INPUT id=txtcode
                                                                            style="WIDTH: 130px" name=txtcode></TD>
                                            <TD style="HEIGHT: 28px">&nbsp;</TD></TR>
                                        <TR>&ndash;%&gt;
                                        <TD style="HEIGHT: 18px"></TD>
                                        <TD style="HEIGHT: 18px"></TD>
                                        <TD style="HEIGHT: 18px"></TD></TR>
                                        <TR>
                                            <TD></TD>
                                            <TD><button>登陆系统</button>


                                                &lt;%&ndash;<INPUT id=btn
                                                       style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
                                                       onclick='login()'
                                                       type=image src="images/login_button.gif" name=btn>&ndash;%&gt;
                                            </TD>
                                        </TR>
                                        <tr>
                                            <td colspan="2" style="color: red;text-align: center;font-size: 15px">${requestScope.message}</td>
                                        </tr>
                                        </TBODY>
                                    </TABLE>
                                </TD>
                            </TR>
                            </TBODY>
                        </TABLE>
                    </TD>
                </TR>
                <TR>
                    <TD><IMG src="${pageContext.request.contextPath }/images/login_3.jpg"
                             border=0></TD>
                </TR>
                </TBODY>
            </TABLE>
        </DIV>
    </DIV>
</FORM>--%>
</BODY>
</HTML>