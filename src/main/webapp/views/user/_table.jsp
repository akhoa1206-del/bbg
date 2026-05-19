<%@ page pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<h3>User List</h3>
<table border="1" style="width:100%; border-collapse: collapse; text-align: left;">
    <thead>
    <tr style="background-color: #f2f2f2;">
        <th>Username</th>
        <th>Password</th>
        <th>Remember?</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${items}" var="u">
        <tr>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>${u.remember ? 'Yes' : 'No'}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>