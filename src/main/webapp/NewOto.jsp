<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>THÊM MỚI SẢN PHẨM</title>
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
 <h1>THÊM MỚI SẢN PHẨM</h1>
 <form method="POST" action="NewOtoSer" enctype="multipart/form-data">
 <table>
 <tr>
 <td>ID Sản Phẩm</td>
 <td><input type="text" name="Id"/></td>
 </tr>
 <tr>
 <td>Tên Sản Phẩm</td>
 <td><input type="text" name="Name"/></td> 
 </tr>
 <tr>
 <td>Loại Sản Phẩm</td>
 <td><input type="text" name="Type"/></td>
 </tr>
 <tr>
 <td>Giá </td>
 <td><input type="text" name="Price"/></td>
 </tr>

 <tr>
 <td colspan="2"><button>Submit</button><input type="reset"></td>
 </tr>
 </table>
 </form>
 <div> 
 <h5>${thongbao}</h5> 
 
 </div>
 </body>
</html>
