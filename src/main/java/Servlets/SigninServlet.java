package Servlets;
import static Servlets.DbUtils.insertUseraccount;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unused")
@WebServlet(name = "SigninServlet", urlPatterns = {"/SignInServlet"})
public class SigninServlet extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 Connection conn = null; //connect SQL
 try {
 conn = MySQLconntUtils.getMySQLConnection();
 //xử lý tham số từ form
 String username=request.getParameter("Username");
 String gender=request.getParameter("Gender");
 String password=request.getParameter("Password"); 
 String numberphone=request.getParameter("Numberphone");
 
 Useraccount usr=new Useraccount(username, gender, password, numberphone); //tạo đối tượng user
 //thêm đối tượng vào CSDL
 DbUtils.insertUseraccount(conn, usr);
 request.setAttribute("username", username);
 request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
 } catch (SQLException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
 }finally{
 if(conn != null){
 try {
 conn.close();
 } catch (SQLException ex) {
 Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);
 							}
 					}
 			}
 }
}
 
 
 
