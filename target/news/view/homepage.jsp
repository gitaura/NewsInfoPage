<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<%--
  Created by IntelliJ IDEA.
  User: Dom
  Date: 2018-08-24
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Widok</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="/styles/styleNews.css">

</head>
<body>


<div class="container">


    <h1> NEWS </h1>


    <div class="row">
                <c:forEach items="${articles_list}" var="art">
                    <a href="/articles?id=${art.id}">
                    <div class="col-md-4">
                            ${art.title},
                    </div>
                    </a>
                </c:forEach>

    </div>
    <div class="row">

    </div>
</div>

</body>
</html>
