<%--
  Created by IntelliJ IDEA.
  User: eve
  Date: 13.05.2021
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

    <title>Book List</title>

</head>

<body>


<table border="1">

    <thead>

    <th>isbn</th>

    <th>title</th>

    <th>author</th>

    </thead>

    <tbody>

    <c:forEach items="${books}" var="book">

        <tr>

            <td><c:out value="${book.isbn}"/></td>

            <td><c:out value="${book.title}"/></td>

            <td><c:out value="${book.author}"/></td>

        </tr>

    </c:forEach>

    </tbody>

</table>

</body>

</html>