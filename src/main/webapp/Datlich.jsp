<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đặt lịch</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Đặt lịch hẹn</h1>
        <form id="booking-form">
            <div class="form-group">
                <label for="name">Họ và tên</label>
                <input type="text" id="name" name="name" placeholder="Nhập họ và tên của bạn" required>
            </div>
           
            <div class="form-group">
                <label for="phone">Số điện thoại</label>
                <input type="tel" id="phone" name="phone" placeholder="Nhập số điện thoại của bạn" required>
            </div>
            <div class="form-group">
                <label for="date">Ngày hẹn</label>
                <input type="date" id="date" name="date" required>
            </div>
            <div class="form-group">
                <label for="time">Thời gian hẹn</label>
                <input type="time" id="time" name="time" required>
            </div>
            
            <div class="form-group">
                <label for="note">Ghi chú</label>
                <textarea id="note" name="note" placeholder="Nhập ghi chú"></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Đặt lịch</button>
            </div>
        </form>
    </div>
    <script src="script.js"></script>
</body>
</html>
