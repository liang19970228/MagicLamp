<%--
  Created by IntelliJ IDEA.
  User: lwc
  Date: 2019/3/20
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<HEAD id=Head1>
    <TITLE>导航</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <STYLE type=text/css>
        BODY {
            PADDING-RIGHT: 0px;
            PADDING-LEFT: 0px;
            PADDING-BOTTOM: 0px;
            MARGIN: 0px;
            PADDING-TOP: 0px;
            BACKGROUND-COLOR: #2a8dc8
        }

        BODY {
            FONT-SIZE: 11px;
            COLOR: #003366;
            FONT-FAMILY: Verdana
        }

        TD {
            FONT-SIZE: 11px;
            COLOR: #003366;
            FONT-FAMILY: Verdana
        }

        DIV {
            FONT-SIZE: 11px;
            COLOR: #003366;
            FONT-FAMILY: Verdana
        }

        P {
            FONT-SIZE: 11px;
            COLOR: #003366;
            FONT-FAMILY: Verdana
        }

        .mainMenu {
            FONT-WEIGHT: bold;
            FONT-SIZE: 14px;
            cursor: pointer;
            COLOR: #000000
        }

        A.style2:link {
            PADDING-LEFT: 4px;
            COLOR: #0055bb;
            TEXT-DECORATION: none
        }

        A.style2:visited {
            PADDING-LEFT: 4px;
            COLOR: #0055bb;
            TEXT-DECORATION: none
        }

        A.style2:hover {
            PADDING-LEFT: 4px;
            COLOR: #ff0000;
            TEXT-DECORATION: none
        }

        A.active {
            PADDING-LEFT: 4px;
            COLOR: #ff0000;
            TEXT-DECORATION: none
        }

        .span {
            COLOR: #ff0000;
        }
    </STYLE>

    <SCRIPT language=javascript>
        function MenuDisplay(obj_id) {
            for (var i = 1; i <= 9; i++) {
                var obj = document.getElementById('table_' + i);
                if(obj){
                    document.getElementById('table_' + i).style.display = 'none';
                    document.getElementById('table_' + i + 'Span').innerText = '＋';
                }

            }
            var obj = document.getElementById(obj_id);
            if(obj){
                if (obj.style.display == 'none') {
                    obj.style.display = 'block';
                    document.getElementById(obj_id + 'Span').innerText = '－';
                } else {
                    obj.style.display = 'none';
                    document.getElementById(obj_id + 'Span').innerText = '＋';
                }
            }

        }
    </SCRIPT>

    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
<FORM id=form1 name=form1 action=YHMenu.aspx method=post>
    <TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_005.jpg" border=0></TD>
            <TD align=middle width=180 background=../images/new_006.jpg
                height=35><B>人事管理 －功能菜单</B></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_007.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>
        <TBODY>
        <TR>
            <TD width=15 background=${pageContext.request.contextPath }/images/new_008.jpg></TD>
            <TD vAlign=top width=180 bgColor=#ffffff>
                <TABLE cellSpacing=0 cellPadding=3 width=165 align=center border=0>
                    <TBODY>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_1');"><SPAN
                                class=span id=table_1Span>＋</SPAN> 管理员管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_1 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/admin/toAddAdmin"
                                                           target=main>－ 新增管理员</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/admin/findAll"
                                                           target=main>－ 管理员列表</A></TD>
                                </TR>

                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    <TR>
                        <TD background=${pageContext.request.contextPath }/images/new_027.jpg height=1></TD>
                    </TR>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_2');"><SPAN
                                class=span id=table_2Span>＋</SPAN> 员工管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_2 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/emp/toAddEmp"
                                                           target=main>－ 新增员工</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/emp/findAll"
                                                           target=main>－ 员工列表</A></TD>
                                </TR>

                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    <TR>
                        <TD background=${pageContext.request.contextPath }/images/new_027.jpg height=1></TD>
                    </TR>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_5');"><SPAN
                                class=span id=table_5Span>＋</SPAN> 部门管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_5 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/dpt/toAddDpt"
                                                           target=main>－ 新增部门</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/dpt/findAll"
                                                           target=main>－ 部门列表</A></TD>
                                </TR>

                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    <TR>
                        <TD background=${pageContext.request.contextPath }/images/new_027.jpg height=1></TD>
                    </TR>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_3');"><SPAN
                                class=span id=table_3Span>＋</SPAN> 职位管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_3 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/duty/toAddDuty"
                                                           target=main>－ 新增职位</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/duty/findAll"
                                                           target=main>－ 职位列表</A></TD>
                                </TR>
                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    <TR>
                        <TD background=${pageContext.request.contextPath }/images/new_027.jpg height=1></TD>
                    </TR>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_4');"><SPAN
                                class=span id=table_4Span>＋</SPAN> 考勤管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_4 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/check/toAddCheck"
                                                           target=main>－ 新增考勤</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/check/findAll"
                                                           target=main>－ 考勤列表</A></TD>
                                </TR>

                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    <TR>
                        <TD background=${pageContext.request.contextPath }/images/new_027.jpg height=1></TD>
                    </TR>
                    <TR>
                        <TD class=mainMenu onClick="MenuDisplay('table_6');"><SPAN
                                class=span id=table_6Span>＋</SPAN>工资管理</TD>
                    </TR>
                    <TR>
                        <TD>
                            <TABLE id=table_6 style="DISPLAY: none" cellSpacing=0
                                   cellPadding=2 width=155 align=center border=0>
                                <TBODY>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/pay/toSetPay"
                                                           target=main>－ 工资结算</A></TD>
                                </TR>
                                <TR>
                                    <TD class=menuSmall><A class=style2 href="/pay/findAll"
                                                           target=main>－ 工资列表</A></TD>
                                </TR>
                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
            <TD width=15 background=${pageContext.request.contextPath }/images/new_009.jpg></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_010.jpg" border=0></TD>
            <TD align=middle width=180 background=${pageContext.request.contextPath }/images/new_011.jpg
                height=15></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_012.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</BODY>
</HTML>