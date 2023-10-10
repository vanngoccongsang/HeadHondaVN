<%@page contentType="text/html" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Sign In</title>
		<style>
			body {
				font-family: Arial, sans-serif;
				background-color: #f2f2f2;
				margin: 0;
				padding: 0;
			}

			h1 {
				text-align: center;
				margin-top: 50px;
				font-size: 36px;
				color: #333;
			}

			form {
				margin: 50px auto;
				width: 60%;
				background-color: #fff;
				padding: 30px;
				border-radius: 10px;
				box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
			}

			table {
				width: 100%;
				border-collapse: collapse;
				margin-top: 20px;
			}

			td {
				padding: 10px;
				font-size: 18px;
				color: #666;
				text-align: right;
				vertical-align: top;
				border-bottom: 1px solid #ccc;
			}

			input[type="text"],
			input[type="password"] {
				width: 100%;
				padding: 10px;
				font-size: 18px;
				border-radius: 5px;
				border: 1px solid #ccc;
				margin-top: 5px;
			}

			button {
				padding: 10px 20px;
				font-size: 18px;
				background-color: #4CAF50;
				color: #fff;
				border: none;
				border-radius: 5px;
				margin-top: 10px;
				cursor: pointer;
			}

			button:hover {
				background-color: #3e8e41;
			}

			input[type="reset"] {
				margin-left: 10px;
				padding: 10px 20px;
				font-size: 18px;
				background-color: #f44336;
				color: #fff;
				border: none;
				border-radius: 5px;
				margin-top: 10px;
				cursor: pointer;
			}

			input[type="reset"]:hover {
				background-color: #b52c1d;
			}

			.container {
				margin-top: 50px;
				text-align: center;
				font-size: 18px;
				color: #666;
			}

			.container h4 {
				margin-bottom: 10px;
				font-size: 24px;
				color: #333;
			}

			.container h5 {
				font-size: 18px;
				color: #333;
				margin: 0;
			}
		</style>
	</head>

	<body>
		<h1>Sign In</h1>
		<form method="POST" action="SignInServlet">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="Username" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" name="Gender" /></td>
				</tr>
				<tr>
					<td>PassWord</td>
					<td><input type="password" name="Password" /></td>
				</tr>
				<tr>
					<td>NumberPhone</td>
					<td><input type="password" name="Numberphone" /></td>
				</tr>
				<tr>
					<td colspan="2"><button>Submit</button><input type="reset"></td>
					
				</tr>
				
			</table>
			<ul>
                        <li><a href="Index.jsp">Trang Chủ</a></li>
                        
                    </ul>
			<h4>Thông tin đăng ký của bạn</h4>
			<h5>${username}</h5>
		</form>

		<div>
		</div>
	</body>

	</html>