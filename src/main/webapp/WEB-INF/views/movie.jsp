<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Information</title>
</head>
<body>
    <h1>Movie Information</h1>
    <c:if test="${not empty movies}">
        <table border="1">
            <tr>
                <th>Movie Name</th>
                <th>Director</th>
                <th>Type</th>
                <!-- Add more columns as needed -->
            </tr>
            <c:forEach var="movie" items="${movies}">
                <tr>
                    <td>${movie.movie_name}</td>
                    <td>${movie.director}</td>
                    <td>${movie.type}</td>
                    <!-- Add more data as needed -->
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${empty movies}">
        <p>입력한 영화의 정보가 없습니다.</p>
    </c:if>
</body>
</html>
