<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Эльвирыч
  Date: 02.03.2023
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Данные работника</title>
</head>
<body>

<h1>Данные работника:</h1>

<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Имя: <form:input path="name"/>
    <br><br>
    Фамилия: <form:input path="surName"/>
    <br><br>
    Зар. плата: <form:input path="salary"/>
    <br><br>
    Отдел: <form:input path="department"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>
</body>
</html>
