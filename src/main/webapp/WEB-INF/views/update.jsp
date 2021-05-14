<%--
  Created by IntelliJ IDEA.
  User: eve
  Date: 13.05.2021
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

    <title>Add book</title>

</head>

<body>

<form:form method="post" modelAttribute="book" action="${edit_url}">

    <form:hidden path="id"/>
    <div>
        <label for="title">Title</label>
        <form:input id="title" path="title"/>
        <form:errors  path="title"/>
    </div>

    <div>
        <label for="author">Autor</label>
        <form:textarea id="author" path="author"/>
        <form:errors  path="author"/>
    </div>
    <div>
        <label for="publisher">pUBLISHER</label>
        <form:textarea id="publisher" path="publisher"/>
        <form:errors  path="publisher"/>
    </div>

    <div>
        <label for="type">TYp</label>
        <form:textarea id="type" path="type"/>
        <form:errors  path="type"/>
    </div>

    <div>
        <label for="isbn">ISBN</label>
        <form:textarea id="isbn" path="isbn"/>
        <form:errors  path="isbn"/>
    </div>

    <div>
        <input type="submit" value="Save">
    </div>
</form:form>


</body>

</html>