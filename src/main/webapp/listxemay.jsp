<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>danh sách xe máy</title>
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
<a href="Index.jsp">  <img src="jng/logo-honda.png" alt="Logo" width="10%" height="10%" style=""> 
</a>

 <h1>DANH SÁCH XE MÁY</h1>
 	<nav>
			<a href="Index.jsp">Home</a>
			<a href="#">About</a>
			<a href="#">Contact</a>
		</nav>
 </header>
  <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
 <p style="color: red;">${errorString}</p>
 
 <table border="1" style="border-spacing: 10px;">
 <tr>
 <th>ID</th>
 <th>Name</th>
 <th>Type</th>
 <th>Price</th>
 <th>Edit</th>
 <th>Delete</th>
	<th>Mua</th>
 </tr>
 <c:forEach items="${listxemay}" var="xemay" >
 <tr>
 <td>${xemay.id}</td>
 <td>${xemay.name}</td>
 <td>${xemay.type}</td>
 <td>${xemay.price}</td>
 
 <td>
 <a href="EditXemayServlet?id=${xemay.id}">Edit</a>
 </td>
 <td>
 <a href="deleteSer?id=${xemay.id}">Delete</a>
 </td>
 <td>
 <a class="btn-primary btn-sm" href="ListxemayServlet?action=AddCart&id=${xemay.id}" > Mua</a>
 </td>
 </tr>
 </c:forEach>
 </table>
 
 <a href="newXemay.jsp" style="font-size: 2.2em; text-align: center;"  >Tạo Sản Phẩm</a>
</body>
<footer>
  <p>© 2023 - hondavietnam.com</p>
  <p>Contact us: weboutkhongchay@gmail.com</p>
  <p>Follow us: 
    <a href="#">Facebook</a> 
    <a href="#">Twitter</a>
  </p>
</footer>
</html>