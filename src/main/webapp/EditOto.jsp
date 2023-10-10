<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Edit Car</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f7f7f7;
      padding: 20px;
    }
    h1 {
      color: #1c87c9;
    }
    form {
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    }
    input[type="text"] {
      width: 100%;
      padding: 10px;
      border: none;
      border-radius: 5px;
      margin-bottom: 10px;
      box-sizing: border-box;
    }
    button {
      background-color: #1c87c9;
      color: #fff;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    button:hover {
      background-color: #155d87;
    }
    .error {
      color: red;
    }
  </style>
</head>
<body>
  <h1>CHỈNH SỬA</h1>
  <form method="POST" action="EditOtoServlet" enctype="multipart/form-data">
    <table>
      <tr>
        <td>ID Sản Phẩm</td>
        <td><input type="text" name="Id" value="${oto.getId()}"/></td>
      </tr>
      <tr>
        <td>Tên Sản Phẩm</td>
        <td><input type="text" name="Name" value="${oto.getName()}"/></td> 
      </tr>
      <tr>
        <td>Loại Sản Phẩm</td>
        <td><input type="text" name="Type" value="${oto.getType()}"/></td>
      </tr>
      <tr>
        <td>Giá Sản Phẩm</td>
        <td><input type="text" name="Price" value="${oto.getPrice()}"/></td>
      </tr>
      <tr>
        <td colspan="2">
          <button>Cập Nhật</button>
          <input type="reset">
        </td>
      </tr>
    </table>
  </form>
  <div>
    <p class="error">${thongbao}</p> 
  </div>
</body>
</html>
