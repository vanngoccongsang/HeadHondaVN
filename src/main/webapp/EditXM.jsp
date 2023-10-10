<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Chỉnh Sửa</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        h1 {
            color: #333333;
            margin-bottom: 30px;
        }
        form {
            background-color: #ffffff;
            border: 1px solid #cccccc;
            padding: 20px;
            margin-bottom: 30px;
            box-shadow: 0px 0px 10px #cccccc;
        }
        input[type=text] {
            width: 100%;
            padding: 10px;
            margin: 6px 0;
            border: 1px solid #cccccc;
            border-radius: 4px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #3e8e41;
        }
        input[type=reset] {
            background-color: #cccccc;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type=reset]:hover {
            background-color: #b3b3b3;
        }
        .message {
            color: #ff0000;
        }
    </style>
</head>
<body>
    <h1>CHỈNH SỬA</h1>
    <form method="POST" action="EditXemayServlet" enctype="multipart/form-data">
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text" name="Id" value="${xemay.getId()}"/></td>
            </tr>
            <tr>
                <td>Tên Xe</td>
                <td><input type="text" name="Name" value="${xemay.getName()}"/></td> 
            </tr>
            <tr>
                <td>Loại Xe</td>
                <td><input type="text" name="Type" value="${xemay.getType()}"/></td>
            </tr>
            <tr>
                <td>Giá bán</td>
                <td><input type="text" name="Price" value="${xemay.getPrice()}"/></td>
            </tr>
            <tr>
                <td colspan="2"><button>Update</button><input type="reset"></td>
            </tr>
        </table>
    </form>
    <div class="message"> 
        <h5>${thongbao}</h5> 
    </div>
</body>
</html>
