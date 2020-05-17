<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/15
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link  rel="stylesheet" href="/css/admin.css">
    <link  rel="stylesheet" href="/css/reset.css">
    <link  rel="stylesheet" href="/css/modal.css">
</head>
<body>
    <s:include value="/unit/head.jsp">
        <s:param name="stuName" value="%{#session.studentEntity.stuName}"/>
    </s:include>
    <div class="main-frame w">
        <h1 align="center">这是一个学生宿舍信息管理系统</h1>
        <p>
            夜，结束了一天的喧嚣后安静下来，伴随着远处路灯那微弱的光。风，毫无预兆地席卷整片旷野，撩动人的思绪万千。
            星，遥遥地挂在天空之中，闪烁着它那微微星光，不如阳光般灿烂却如花儿般如痴如醉。
        </p>
    </div>
    <s:include value="/unit/footer.jsp"></s:include>
</body>
</html>
