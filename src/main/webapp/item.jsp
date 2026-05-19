<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<div style="border: 1px solid #c8a2c8; width: calc(33.333% - 10px); box-sizing: border-box; display: flex; flex-direction: column; margin-bottom: 15px;">

    <div style="background-color: #7b1fa2; color: white; text-align: center; padding: 10px; font-size: 14px; font-weight: bold;">
        ${param.name}
    </div>

    <div style="padding: 10px; text-align: center; flex-grow: 1; background-color: #fff;">
        <div style="border: 1px solid #f0e68c; padding: 20px 0;">
            <a href="${pageContext.request.contextPath}/detail.php">
                <img src="images/${param.image}" alt="Hình sản phẩm" style="max-width: 80px; display: block; margin: 0 auto;">
            </a>
        </div>
    </div>

    <div style="background-color: #fbfcfa; border-top: 1px solid #c8a2c8; padding: 8px 10px; font-size: 14px; font-weight: bold;">
        <strike style="color: black;">$100</strike>
        <span style="color: blue; margin-left: 5px;">$99</span>
    </div>

</div>