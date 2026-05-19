<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<html>
<head>
  <title>Chi tiết sản phẩm</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      padding-top: 50px;
    }
    .product-container {
      width: 320px;
      text-align: center;
    }
    /* Khung 1: Tên sản phẩm (Viền xanh lá) */
    .box-title {
      border: 2px solid #8bc34a;
      padding: 10px;
      font-size: 20px;
      color: #333;
    }
    /* Khung 2: Hình sản phẩm (Viền cam ngoài) */
    .box-image {
      border: 2px solid #ff9800;
      border-top: none; /* Ẩn viền trên để nối với khung trên */
      padding: 15px 25px;
    }
    /* Khung cam nhỏ bên trong chứa hình */
    .inner-image {
      border: 2px solid #ff9800;
      padding: 30px 10px;
      min-height: 120px;
      display: flex;
      align-items: center;
      justify-content: center;
    }
    /* Khung 3: Giá và Mức giá (Viền đỏ) */
    .box-price {
      border: 2px solid #d32f2f;
      border-top: none;
      padding: 15px;
      text-align: left;
    }
    .box-price ul {
      margin: 0;
      padding-left: 25px; /* Thụt lề cho dấu chấm tròn */
      line-height: 1.8;
      font-size: 16px;
    }
    /* Khung 4: Ngày nhập (Viền xanh dương) */
    .box-date {
      border: 2px solid #03a9f4;
      border-top: none;
      padding: 10px;
      font-size: 16px;
    }
  </style>
</head>
<body>

<div class="product-container">

  <div class="box-title">
    ${item.name}
  </div>

  <div class="box-image">
    <div class="inner-image">
      <img src="${pageContext.request.contextPath}/images/${item.image}" alt="Hình sản phẩm" style="max-width: 150px;">
    </div>
  </div>

  <div class="box-price">
    <c:set var="giaMoi" value="${item.price * (1 - item.discount)}" />
    <ul>
      <li>Giá gốc: <strike>${item.price}$</strike></li>
      <li>Giá mới: ${giaMoi}$</li>
      <li>Mức giá:
        <c:choose>
          <c:when test="${giaMoi < 10}">Giá thấp</c:when>
          <c:when test="${giaMoi > 100}">Giá cao</c:when>
          <c:otherwise>Bình thường</c:otherwise>
        </c:choose>
      </li>
    </ul>
  </div>

  <div class="box-date">
    Ngày: <fmt:formatDate value="${item.date}" pattern="dd - MM - yyyy" />
  </div>

  <div style="margin-top: 20px;">
    <a href="${pageContext.request.contextPath}/layout.jsp" style="text-decoration: underline; color: blue;">← Quay lại danh sách</a>
  </div>

</div>

</body>
</html>