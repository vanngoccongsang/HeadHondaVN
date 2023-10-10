<%@page contentType="text/html" pageEncoding="UTF-8" %>

  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
    <style>
      body {
        background-color: #f2f2f2;
        font-family: 'Montserrat', sans-serif;
        font-size: 16px;
        line-height: 1.6;
      }

      .container {
        max-width: 500px;
        margin: 0 auto;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }

      h1 {
        font-size: 32px;
        color: #444;
        margin-bottom: 30px;
        text-align: center;
      }

      form {
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0px 0px 10px #bfbfbf;
        padding: 40px;
        width: 100%;
        max-width: 400px;
      }

      .form-group {
        margin-bottom: 20px;
        text-align: left;
      }

      label {
        display: block;
        font-size: 18px;
        color: #555;
        margin-bottom: 5px;
      }

      input[type="text"],
      input[type="password"] {
        display: block;
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 3px;
        background-color: #f5f5f5;
        font-size: 16px;
        color: #444;
        margin-top: 5px;
      }

      button[type="submit"] {
        background-color: #4CAF50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        font-size: 18px;
        cursor: pointer;
        margin-top: 20px;
        transition: background-color 0.3s ease;
      }

      button[type="submit"]:hover {
        background-color: #43A047;
      }

      .forgot-password {
        text-align: center;
        margin-top: 20px;
      }

      .forgot-password a {
        color: #777;
        text-decoration: none;
        transition: color 0.3s ease;
      }

      .forgot-password a:hover {
        color: #333;
      }
    </style>
  </head>

  <body>
    <div class="container">
      <h1>ĐĂNG NHẬP</h1>
      <form method="POST" action="LoginServlet">
        <div class="form-group">
          <label for="username">Tên đăng nhập</label>
          <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
          <label for="password">Mật khẩu</label>
          <input type="password" id="password" name="password" required>
        </div>
        <button type="submit">Đăng nhập</button>
        <div class="forgot-password">
          <a href="#">Quên mật khẩu?</a>
        </div>
      </form>
    </div>
  </body>

  </html>