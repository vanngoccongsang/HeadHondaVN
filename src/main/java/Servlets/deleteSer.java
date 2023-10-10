package Servlets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
* Servlet implementation class editProductServlet
*/
@SuppressWarnings("unused")
@MultipartConfig(
 fileSizeThreshold = 1024 * 1024 * 10,
 maxFileSize = 1024 * 1024 * 50,
 maxRequestSize = 1024 * 1024 * 100
)
@WebServlet("/deleteSer")
public class deleteSer extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 /**
 * @see HttpServlet#HttpServlet()
 */
 public deleteSer() {
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
request.setCharacterEncoding("utf-8");
 response.setCharacterEncoding("utf-8");
response.getWriter().append("Served at: ").append(request.getContextPath());
 String errorString = null;
 String id=request.getParameter("id");
Xemay product= new Xemay();
try {
Connection conn = MySQLconntUtils.getMySQLConnection();
product = DbUtils.findXemay(conn, id);
} catch (SQLException e) {
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
request.setAttribute("errorString",errorString);
request.setAttribute("product", product);
request.getRequestDispatcher("/deleXemay.jsp").forward(request, 
response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException {
// TODO Auto-generated method stub
Connection conn = null; //connect SQL
try {
request.setCharacterEncoding("utf-8");
 response.setCharacterEncoding("utf-8");
 conn = MySQLconntUtils.getMySQLConnection();
 String id=request.getParameter("id");
 String name=request.getParameter("name");
 String type=request.getParameter("type"); 
 String price=request.getParameter("price"); 
 
 Xemay pro=new Xemay(id, name, type, price); //táº¡o Ä‘á»‘i tÆ°á»£ng product
 //thÃªm Ä‘á»‘i tÆ°á»£ng vÃ o CSDL
 DbUtils.deleteXemay(conn, pro.getId()); 
 request.getRequestDispatcher("/ListxemayServlet").forward(request, 
response);
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
			//doGet(request, response);
			}		
}