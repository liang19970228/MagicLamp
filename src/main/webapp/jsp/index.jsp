<%--
  Created by IntelliJ IDEA.
  User: lwc
  Date: 2019/3/19
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<HEAD>
    <TITLE>人事管理系统</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<FRAMESET frameSpacing=0 rows=80,* frameBorder=0>
    <FRAME name=top src="${pageContext.request.contextPath }/jsp/top.jsp" frameBorder=0 noResize
           scrolling=no>
    <FRAMESET frameSpacing=0 frameBorder=0 cols=220,*>
        <FRAME name=menu src="${pageContext.request.contextPath }/jsp/menu.jsp" frameBorder=0 noResize>
        <FRAME name=main src="${pageContext.request.contextPath }/jsp/welcome.jsp" frameBorder=0>
    </FRAMESET>
    <NOFRAMES>
        <p>This page requires frames, but your browser does not support
            them.</p>
    </NOFRAMES>
</FRAMESET>
</HTML>