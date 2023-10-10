<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="vi">

    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <script src="js/bootstrap.doudle.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>TRANG CHỦ</title>
        <link rel="stylesheet" href="navbar.css">
        <link rel="stylesheet" href="index.css">
    </head>

    <body>
        <header>
            <nav class="navbar">
                <div class="navbar__brand">
                    <h1>HEAD HONDA VIỆT NAM<img src="jng/2874711.webp" width="7%" height="7%"></h1>
                </div>
                <div class="navbar__menu">
                    <h4>${username}</h4>
                    <ul>
                        <li><a href="Login.jsp">Đăng nhập</a></li>
                        <li><a href="SignIn.jsp">Đăng ký</a></li>
                    </ul>
                </div>
            </nav>
        </header>

        <head>
        <body>
            <ul class="menu">
                <li style="display: inline-block;"><a href="gioithieu.jsp" class="btn">GIỚI THIỆU</a></li>
                <li style="display: inline-block; margin-left: 20px;"><a href="ListxemayServlet" class="btn">DANH MỤC XE
                        MÁY</a></li>
                <li style="display: inline-block; margin-left: 20px;"><a href="ListotoServlet" class="btn">DANH MỤC Ô
                        TÔ</a></li>
                <li style="display: inline-block; margin-left: 20px;"><a href="ListPTSer" class="btn">PHỤ TÙNG</a></li>
                                <li style="display: inline-block; margin-left: 20px;"><a href="Datlich.jsp" class="btn">ĐẶT LỊCH BẢO DƯỠNG</a></li>
                
                                <li style="display: inline-block; margin-left: 20px;"><a href="#" class="btn">GIỎ HÀNG</a></li>
                
            </ul>    
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </body>        
        </head>

        <div style="display: flex; justify-content: center; align-items: center;">
            <section class="features">
                <div class="feature">
                    <p></p>
                    <img src="jng/danhmucxemay.jpg" alt="Feature 1">
                    <img src="jng/oto.png" alt="Feature 1">
                </div>
            </section>
        </div>
        
        <footer>
            <div class="footer__content">
                <p style="text-align: center;">------------------------</p>
                <p style="text-align: center;">Cảm ơn quý khách đã ghé thăm trang web của
                    chúng tôi.</p>
                <hr>
                <h2>THÔNG TIN LIÊN HỆ</h2>
                <UL>
                    <li>
                        <h3><span style="color: red;">CÔNG TY HONDA VIỆT </span></h3>
                    </li>
                    <li>Nhân viên tư vấn: Văn Ngọc Công Sang | Hotline:<span style="color: red;">0373487413</span>(miễn
                        nghe)</li>
                    <li>Nhân viên tư vấn: Trần Hồng Hoàng | Hotline:<span style="color: red;">0373487231</span>(miễn nghe)
                    </li>
                    <li>email:<span style="color: red;">0950080111@hcmunre.edu.vn</span></li>
                </UL>
            </div>
        </footer>