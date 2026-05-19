<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<form action="${pageContext.request.contextPath}/user.php" method="GET" style="border: 1px solid #ccc; padding: 15px; margin-bottom: 15px; background-color: #fff;">

    <input type="text" name="username" placeholder="Username?" style="width: 100%; margin-bottom: 10px; padding: 6px; box-sizing: border-box;">

    <input type="password" name="password" placeholder="Password?" style="width: 100%; margin-bottom: 10px; padding: 6px; box-sizing: border-box;">

    <div style="display: flex; align-items: center; justify-content: space-between; font-size: 13px;">
        <label>
            <input type="checkbox" name="remember" style="margin:0; vertical-align: middle;"> Remember me?
        </label>
        <button type="submit" style="padding: 4px 15px; background: #e0e0e0; border: 1px solid #999; border-radius: 3px; cursor: pointer;">
            Login
        </button>
    </div>

</form>