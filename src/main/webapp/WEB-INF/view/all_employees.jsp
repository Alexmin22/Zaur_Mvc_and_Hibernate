<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Эльвирыч
  Date: 02.03.2023
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Список всех сотрудников</h1>
<br>

<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Отдел</th>
        <th>Зар. плата</th>
        <th>Операции</th>
    </tr>

    <c:forEach var="empl" items="${allEmpls}">

        <c:url var="updateBtn" value="/updateInfo">

            <c:param name="empl-ID" value="${empl.id}"/>
        </c:url>

        <c:url var="delBtn" value="/delEmpl">

            <c:param name="empl-ID" value="${empl.id}"/>
        </c:url>
        <tr>
        <td>${empl.name}</td>
        <td>${empl.surName}</td>
        <td>${empl.department}</td>
        <td>${empl.salary}</td>

        <td>
            <input type="button" value="Редактировать" onclick="window.location.href = '${updateBtn}'"/>

                <input type="button" value="Удалить" onclick="window.location.href = '${delBtn}'"/>
            </td>
        </tr>
    </c:forEach>

</table>
<br>

<input type="button" value="Добавить работника"
    onclick="window.location.href = 'addNewEmployee'"/>
</body>
</html>
