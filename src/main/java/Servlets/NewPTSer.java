package Servlets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/**
* Servlet implementation class newProductServlet
*/
@SuppressWarnings("unused")
@MultipartConfig(
 fileSizeThreshold = 1024 * 1024 * 10,
 maxFileSize = 1024 * 1024 * 50,
 maxRequestSize = 1024 * 1024 * 100
)
@WebServlet("/NewPTSer")
public class NewPTSer extends HttpServlet {
private static final long serialVersionUID = 1L;
 /**
 * @see HttpServlet#HttpServlet()
 */
 public NewPTSer() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Connection conn = null; //connect SQL
 try {
 request.setCharacterEncoding("utf-8");
 response.setCharacterEncoding("utf-8");
 conn = MySQLconntUtils.getMySQLConnection();
 //xử lý tham số từ form
 String Id=request.getParameter("Id");
 String Name=request.getParameter("Name");
 String Type=request.getParameter("Type"); 
 String Price=request.getParameter("Price"); 
 
 Phutung pro=new Phutung(Id, Name,Type, Price); //tạo đối tượngproduct
 //thêm đối tượng vào CSDL
 DbUtils.insertphutung(conn, pro); 
 request.getRequestDispatcher("ListPTSer").forward(request, response);
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, 
ex);
 } catch (SQLException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, 
ex);
 }finally{
 if(conn != null){
 try {
 conn.close();
 } catch (SQLException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, 
null, ex);
 }
 } 
 }  
doGet(request, response);
}
}