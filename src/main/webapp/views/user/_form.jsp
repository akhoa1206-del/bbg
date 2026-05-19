<%@ page pageEncoding="utf-8" isELIgnored="false" %>
<h3>User Edition</h3>
<div style="color: green; font-weight: bold; margin-bottom: 10px;">${message}</div>
<form action="${pageContext.request.contextPath}/user.php" method="post">
    Username: <input name="username" value="${form.username}"><br><br>
    Password: <input name="password" value="${form.password}"><br><br>
    <input name="remember" type="checkbox" ${form.remember ? 'checked' : ''}> Remember me?
    <br><br>
    <button>Create</button>
</form>