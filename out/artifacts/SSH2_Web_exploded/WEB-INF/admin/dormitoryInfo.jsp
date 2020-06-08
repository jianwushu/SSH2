<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/15
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宿舍信息管理</title>
    <link  rel="stylesheet" href="/css/admin.css">
    <link  rel="stylesheet" href="/css/reset.css">
    <link  rel="stylesheet" href="/css/modal.css">
</head>
<body>
    <s:include value="/unit/head.jsp">
        <s:param name="stuName" value="%{#session.studentEntity.stuName}"/>
    </s:include>
    <div class="main-frame w">
        <table class="do">
            <caption>宿舍信息管理</caption>
            <tr>
                <th>序号</th>
                <th>楼栋</th>
                <th>寝室</th>
<%--                <th>入住人数</th>--%>
                <th>操作</th>
            </tr>
            <s:iterator id="dormitory" value="%{#session.dormitoryList}" status="list">
                <tr>
                    <td><s:property value="#list.count"/></td>
                    <td hidden><s:property value="#dormitory.roomId"/></td>
                    <td><s:property value="#dormitory.dormitoryName"/></td>
                    <td><s:property value="#dormitory.roomNumber"/></td>
<%--                    <td></td>--%>
                    <td>
                        <button type="button" onclick="btnOn3(this)">删除</button><button type="button" onclick="btnOn4(this)">修改</button>
                    </td>
                </tr>
            </s:iterator>
            <tr>
                <s:form action="dormitory_add" method="POST" theme="simple">
                    <td></td>
                    <td><s:textfield name="dormitoryEntity.dormitoryName"  label="楼栋">
                    </s:textfield>
                    </td>
                    <td><s:textfield name="dormitoryEntity.roomNumber"  label="寝室">
                    </s:textfield>
                    </td>
<%--                    <td></td>--%>
                    <td>
                        <s:submit value="添加" class="s_input"></s:submit>
                        </button><button type="button" onclick="location.href='http://localhost:8080/admin/dormitory_findAll'">刷新</button>
                    </td>
                </s:form>
            </tr>
        </table>
    </div>
    <div id="down"></div>
    <div id="up">
        <s:form action="dormitory_delete" method="POST" theme="simple" >
            <table class="modal">
                <s:hidden name="dormitoryEntity.roomId" id="roomId"></s:hidden>
                <tr>
                    <td><s:submit value="确认" class="s_input"></s:submit></td>
                    <td><button type="button" onclick="btnOff()">取消</button></td>
                </tr>
            </table>
        </s:form>
    </div>
    <div id="up2">
        <s:form action="dormitory_update" method="POST" theme="simple">
            <table class="modal">
                <s:hidden name="dormitoryEntity.roomId" id="roomId2"></s:hidden>
                <tr><td>楼栋</td><td><s:textfield name="dormitoryEntity.dormitoryName" id="dormitoryName" label="楼栋"/></td>
                </tr>
                <tr><td>寝室</td><td><s:textfield name="dormitoryEntity.roomNumber" id="roomNumber" label="寝室号"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><s:submit  value="提交" class="s_input"></s:submit><button type="button" onclick="btnOff2()">退出</button></td>
                </tr>
            </table>
        </s:form>
    </div>
    <script src="/js/jquery-3.4.1.min.js"></script>
    <script src="/js/modal2.js"></script>

    <script src="/js/modal.js"></script>
    <s:include value="/unit/footer.jsp"></s:include>
</body>
</html>
