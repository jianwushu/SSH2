<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.opensymphony.xwork2.ognl.OgnlValueStack"%>
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/15
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <div class="logo w">学生宿舍信息管理系统</div>
        <nav class="header-wrapper w">
            <%
                ((OgnlValueStack) request.getAttribute("struts.valueStack")).set(
                        "stuName", request.getParameter("stuName"));
            %>
        <s:if test="stuName!=null">
        <div class="left-nav clearFix">
                 <ul class="service">
                        <li> <a href="http://localhost:8080/admin">主页</a></li>
                        <li> <a href="http://localhost:8080/admin/student_profile">基本资料</a></li>
                        <li> <a href="http://localhost:8080/admin/student_findAll">学生信息管理</a></li>
                        <li> <a href="http://localhost:8080/admin/dormitory_findAll">宿舍信息管理</a></li>
<%--                        <li> <a href="">文件管理</a></li>--%>
                 </ul>
        </div>
        </s:if>
        <div class="right-nav  clearFix">
          <ul>
              <s:if test="stuName!=null">
                <li><a href="logout">欢迎你，${param.stuName}</a></li>
              </s:if>
              <s:else>
                  <li><a href="admin">登录</a></li>
              </s:else>
          </ul>
        </div>
        </nav>

