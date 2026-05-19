<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Online Shopping Mall</title>
    <style>
        body { font-family: Arial, sans-serif; width: 900px; margin: 0 auto; padding-top: 20px; }
        .header { display: flex; justify-content: space-between; align-items: baseline; margin-bottom: 10px; }
        .header h1 { color: #889955; margin: 0; font-size: 36px; }
        .logo { border: 2px solid #ddd; padding: 10px 25px; color: #333; }
        .container { display: flex; margin-top: 15px; gap: 15px; }
        .left-col { width: 70%; display: flex; flex-wrap: wrap; gap: 15px; }
        .right-col { width: 30%; }
        .footer { background-color: #f1f1f1; text-align: center; padding: 15px; margin-top: 15px; font-size: 14px; border-top: 1px solid #ddd; }
    </style>
</head>
<body>
<div class="header">
    <h1>Online Shopping Mall</h1>
    <div class="logo">Logo</div>
</div>

<jsp:include page="menu.jsp" />

<div class="container">
    <div class="left-col">
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 1"/><jsp:param name="image" value="hinh1.png"/></jsp:include>
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 2"/><jsp:param name="image" value="hinh2.png"/></jsp:include>
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 3"/><jsp:param name="image" value="hinh3.png"/></jsp:include>
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 4"/><jsp:param name="image" value="hinh4.png"/></jsp:include>
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 5"/><jsp:param name="image" value="hinh5.png"/></jsp:include>
        <jsp:include page="item.jsp"><jsp:param name="name" value="Tên sản phẩm 6"/><jsp:param name="image" value="hinh6.png"/></jsp:include>
    </div>
    <div class="right-col">
        <jsp:include page="login.jsp" />
        <jsp:include page="category.jsp" />
    </div>
</div>

<div class="footer">FPT Polytechnic @2020. All rights reserved.</div>
</body>
</html>