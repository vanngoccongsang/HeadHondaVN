package Servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn;
		try {
			conn= MySQLconntUtils.getMySQLConnection();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			Useraccount usr=new Useraccount(username,password);
			Useraccount u=DbUtils.findUser(conn,usr.getUserName(),usr.getPassword());
			
			if(u !=null) {
				Useraccount user=new Useraccount(u);
				request.setAttribute("username","Chào bạn: "+user.getUserName());
			
				request.getRequestDispatcher("/Index.jsp").forward(request, response);
				
			}
			else {
				response.setContentType("text/html;charset=UTF-8");
				try(PrintWriter out=response.getWriter()){
					out.println("<DOCTYPE html>");
					out.println("<html");
					out.println("<head>");
					out.println("<title>Thông báo</title>");
					out.println("</head>");
					out.println("<body>");
					out.println("<h1>thông tin đăng nhập không chính xác <a href=Login.jsp>Nhập lại</a></h1>");
					out.println("</body>");
					out.println("/html");
				}
			}
		} catch (ClassNotFoundException ex) {

			Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);

			} catch (SQLException ex) {

			Logger.getLogger(SigninServlet.class.getName()).log(Level.SEVERE, null, ex);

			}finally {

			}
	}
	

	
	
	
}
