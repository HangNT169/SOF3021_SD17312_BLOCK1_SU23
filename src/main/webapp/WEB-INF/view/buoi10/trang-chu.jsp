<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>STT</th>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Product Code</th>
        <th>Catgory Name</th>
        <th>Category Code</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="product" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.code}</td>
            <td>${product.category.categoryName}</td>
            <td>${product.category.categoryCode}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
