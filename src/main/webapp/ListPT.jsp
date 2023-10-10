<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Danh sách Ô tô</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: Arial, sans-serif;
			font-size: 16px;
			line-height: 1.6;
			background-color: #f6f6f6;
			color: #333;
		}

		header {
			background-color: #0071c5;
			padding: 20px;
			color: #fff;
			display: flex;
			align-items: center;
			justify-content: space-between;
		}

		.logo {
			width: 50px;
			height: 50px;
			margin-right: 10px;
		}

		nav {
			display: flex;
		}

		nav a {
			color: #fff;
			text-decoration: none;
			margin-left: 20px;
		}

		main {
			padding: 20px;
		}

		h1 {
			margin-top: 0;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			margin-top: 20px;
			margin-bottom: 20px;
		}

		th, td {
			border: 1px solid #ccc;
			padding: 10px;
			text-align: center;
		}

		th {
			background-color: #eee;
		}

		td a {
			color: #0071c5;
			text-decoration: none;
		}

		footer {
			background-color: #ccc;
			padding: 20px;
			color: #333;
			text-align: center;
		}

		footer a {
			color: #0071c5;
			text-decoration: none;
		}

	</style>
</head>

<body>
	<header>
		<img src="jng/logo-honda.png" alt="Logo" class="logo">
		<h1>Danh sách phụ tùng</h1>
		<nav>
			<a href="Index.jsp">Home</a>
			<a href="#">About</a>
			<a href="#">Contact</a>
		</nav>
	</header>
 <form class="d-flex" role="search" method="GET">

<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="keyword"/>

                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>

		<p style="color: red;">${errorString}</p>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Type</th>
					<th>Price</th>
					<th>Edit</th>
					<th>Delete</th>
					<th>Thêm Vào Giỏ Hàng</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ListPT}" var="phutung">
					<tr>
						<td>${phutung.id}</td>
						<td>${phutung.name}</td>
						<td>${phutung.type}</td>
						<td>${phutung.price}</td>
						
 <td>
 <a href="EditPTSer?id=${phutung.id}">Edit</a>
 </td>
 <td>
 <a href="delePTSer?id=${phutung.id}">Delete</a>
 </td>
 <td>
 <a href="#?id=${phutung.id}">Mua</a>
 </td>
 </tr>
 </c:forEach>
 </table>
 <a href="NewPT.jsp" style="font-size: 1.5em; text-align: center;" >Create Product</a>
</body>
<footer>
  <p>© 2023 - HoangSang.com</p>
  <p>Contact us: weboutkhongchay@gmail.com</p>
  <p>Follow us: 
    <a href="#">Facebook</a> 
    <a href="#">Twitter</a>
  </p>
</footer>
</html>