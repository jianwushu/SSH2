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
    <title>基本资料</title>
    <link  rel="stylesheet" href="/css/admin.css">
    <link  rel="stylesheet" href="/css/reset.css">
    <link  rel="stylesheet" href="/css/modal.css">

</head>
<body>
    <s:include value="/unit/head.jsp">
        <s:param name="stuName" value="%{#session.studentEntity.stuName}"/>
    </s:include>
    <div class="main-frame w">

        <table>
            <caption>
                基本资料
            </caption>
            <tr>
                <td>姓名</td>
                <td><s:property value="#session.studentEntity.stuName"/></td>
            </tr>
            <tr>
                <td>学号</td>
                <td><s:property value="#session.studentEntity.stuNumber"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><s:property value="#session.studentEntity.stuPassword"/></td>
            </tr>
            <tr>
                <td>楼栋</td>
                <td><s:property value="#session.dormitoryEntity.dormitoryName"/></td>
            </tr>
            <tr>
                <td>寝室号</td>
                <td><s:property value="#session.dormitoryEntity.roomNumber"/></td>
            </tr>
            <tr>
                <td>操作</td>
                <td>
                    <button type="button" id="btn">修改</button>
                </td>
            </tr>
        </table>
    </div>
    <div id="down"></div>
    <div id="up">
        <s:form action="student_updateSelf" method="POST" theme="simple">
            <table class="modal">
                <s:hidden name="studentEntity.stuId" value="%{#session.studentEntity.stuId}"></s:hidden>
                <s:hidden name="dormitoryEntity.roomId" value="%{#session.dormitoryEntity.roomId}"></s:hidden>
                <tr>
                    <td>姓名</td>
                    <td><s:textfield name="studentEntity.stuName" value="%{#session.studentEntity.stuName}" disabled="true" label="姓名"/></td>
                </tr>
                <tr>
                    <td>学号</td>
                    <td><s:textfield name="studentEntity.stuNumber" value="%{#session.studentEntity.stuNumber}" disabled="true" label="学号"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><s:textfield name="studentEntity.stuPassword" value="%{#session.studentEntity.stuPassword}" label="密码"/></td>
                </tr>
                <tr>
                    <td>楼栋</td>
                    <td><s:textfield name="dormitoryEntity.dormitoryName" value="%{#session.dormitoryEntity.dormitoryName}" disabled="true" label="楼栋"/></td>
                </tr>
                <tr>
                    <td>寝室</td>
                    <td><s:textfield name="dormitoryEntity.roomNumber" value="%{#session.dormitoryEntity.roomNumber}" disabled="true" label="寝室号"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;<button type="button" id="close">退出</button></td>
                </tr>
            </table>
        </s:form>
    </div>
    <script src="/js/modal.js"></script>
    <s:include value="/unit/footer.jsp"></s:include>
</body>
</html>
