
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/14
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录到后台</title>
    <link  rel="stylesheet" href="/css/admin.css">
    <link  rel="stylesheet" href="/css/reset.css">
</head>
    <body>
    <s:include value="/unit/head.jsp">
        <s:param name="stuName" value="%{#session.studentEntity.stuName}"/>
    </s:include>
    <div class="main-frame w">
        <div class="div_login">
                <s:form action="login" method="post">
                    <s:textfield label="用户名" name="studentEntity.stuName"></s:textfield>
                    <s:password label="密码" name="studentEntity.stuPassword"></s:password>
                    <s:submit></s:submit>
                </s:form>
        </div>
    </div>
    </body>
    <s:include value="/unit/footer.jsp"></s:include>
</html>
