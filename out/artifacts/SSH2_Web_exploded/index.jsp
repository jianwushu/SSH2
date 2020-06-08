<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/15
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link  rel="stylesheet" href="/css/admin.css">
    <link  rel="stylesheet" href="/css/reset.css">
    <link  rel="stylesheet" href="/css/modal.css">
    <link  rel="stylesheet" href="/css/clock.css">
</head>
<body>
    <s:include value="/unit/head.jsp">
        <s:param name="stuName" value="%{#session.studentEntity.stuName}"/>
    </s:include>
    <div class="main-frame w div_clock">
        <div class="clock">
            <h2>Time</h2>
            <div class="time">
                <div><span id="hour">00</span><span>Hour</span></div>
                <div><span id="minute">00</span><span>Minute</span></div>
                <div><span id="second">00</span><span>Second</span></div>
            </div>
        </div>
    </div>
    <script>
        function clock(){
            var hours = document.getElementById('hour');
            var minutes = document.getElementById('minute');
            var seconds = document.getElementById('second');
            var h = new Date().getHours();
            var m = new Date().getMinutes();
            var s = new Date().getSeconds();
            hours.innerHTML = h;
            minutes.innerHTML = m;
            seconds.innerHTML = s;
        } setInterval(clock,1000);
    </script>
    <s:include value="/unit/footer.jsp"></s:include>
</body>
</html>
