package Servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


public class DbUtils {
		
	public static void insertUseraccount(Connection conn, Useraccount user) throws SQLException {
		String sql = "Insert into user_account(Username, Gender, Password, Numberphone) values (?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, user.getUserName());
		pstm.setString(2, user.getGender());
		pstm.setString(3, user.getPassword());
		pstm.setString(4, user.getNumberphone());
		
		pstm.executeUpdate();
		}
	
	public static void insertXemay(Connection conn, Xemay xemay) throws SQLException {
		String sql = "Insert into xemay(Id, Name, Type, Price) values (?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, xemay.getId());
		pstm.setString(2, xemay.getName());
		pstm.setString(3, xemay.getType());
		pstm.setString(4, xemay.getPrice());
		pstm.executeUpdate();
		}
	
	public static void insertOto(Connection conn, Oto oto) throws SQLException {
		String sql = "Insert into oto(Id, Name, Type, Price) values (?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, oto.getId());
		pstm.setString(2, oto.getName());
		pstm.setString(3, oto.getType());
		pstm.setString(4, oto.getPrice());
		pstm.executeUpdate();
		}
	
	public static void insertphutung(Connection conn, Phutung phutung) throws SQLException {
		String sql = "Insert into phutung(Id, Name, Type, Price) values (?,?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, phutung.getId());
		pstm.setString(2, phutung.getName());
		pstm.setString(3, phutung.getType());
		pstm.setString(4, phutung.getPrice());
		pstm.executeUpdate();
		}
	
//	public static void insertBooking(Connection conn, Booking booking) throws SQLException {
//		String sql = "Insert into booking(Id, Name, Type, Price) values (?,?,?,?)";
//		PreparedStatement pstm = conn.prepareStatement(sql);
//		pstm.setString(1, booking.getId());
//		pstm.setString(2, booking.getName());
//		pstm.setString(3, booking.getType());
//		pstm.setString(4, booking.getPrice());
//		pstm.executeUpdate();
//		}
//	
	 public static Useraccount findUser(Connection conn, //
			 String userName, String password) throws SQLException {
			 String sql = "Select a.Username, a.Gender, a.Password, a.Numberphone from user_account a " //
			 + " where a.Username = ? and a.Password= ? ";
			 PreparedStatement pstm = conn.prepareStatement(sql);
			 pstm.setString(1, userName);
			 pstm.setString(2, password);
			 ResultSet rs = pstm.executeQuery();
			 if (rs.next()) {
			 String gender = rs.getString("Gender");
			 String numberphone = rs.getString("Numberphone");
			 Useraccount user = new Useraccount();
			 user.setUserName(userName);
			 user.setPassword(password);
			 user.setGender(gender);
			 user.setNumberphone(numberphone);
			 return user;
			 }
			 return null;
			 }

	public static List<Xemay> queryXemay(Connection conn) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from xemay a ";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		ResultSet rs = pstm.executeQuery();
		List<Xemay> list = new ArrayList<Xemay>();
		while (rs.next()) {
		String Id = rs.getString("Id");
		String Name = rs.getString("Name");
		String Type = rs.getString("Type");
		String Price = rs.getString("Price");
		
		Xemay xemay = new Xemay();
		
		xemay.setId(Id);
		xemay.setName(Name);
		xemay.setType(Type);
		xemay.setPrice(Price);
	
		list.add(xemay);
		}
		return list;
		}
	
	public static List<Oto> queryOto(Connection conn) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from oto a ";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		ResultSet rs = pstm.executeQuery();
		List<Oto> list = new ArrayList<Oto>();
		while (rs.next()) {
		String Id = rs.getString("Id");
		String Name = rs.getString("Name");
		String Type = rs.getString("Type");
		String Price = rs.getString("Price");
		
		Oto oto = new Oto();
		
		oto.setId(Id);
		oto.setName(Name);
		oto.setType(Type);
		oto.setPrice(Price);
	
		list.add(oto);
		}
		return list;
		}
	
	public static List<Phutung> queryPhutung(Connection conn) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from phutung a ";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		ResultSet rs = pstm.executeQuery();
		List<Phutung> list = new ArrayList<Phutung>();
		while (rs.next()) {
		String Id = rs.getString("Id");
		String Name = rs.getString("Name");
		String Type = rs.getString("Type");
		String Price = rs.getString("Price");
		
		Phutung phutung = new Phutung();
		
		phutung.setId(Id);
		phutung.setName(Name);
		phutung.setType(Type);
		phutung.setPrice(Price);
	
		list.add(phutung);
		}
		return list;
		}
	

//	public static List<Booking> queryBooking(Connection conn) throws SQLException {
//		String sql = "Select a.Id, a.Name, a.Type, a.Price from booking a ";
//		
//		PreparedStatement pstm = conn.prepareStatement(sql);
//		
//		ResultSet rs = pstm.executeQuery();
//		//List<Booking> list = new ArrayList<Booking>();
//		while (rs.next()) {
//		String Id = rs.getString("Id");
//		String Name = rs.getString("Name");
//		String Type = rs.getString("Type");
		//String Price = rs.getString("Price");
		
	//	Booking booking = new Booking();
		
	//	booking.setId(Id);
	//	booking.setName(Name);
	//	booking.setType(Type);
	//	booking.setPrice(Price);
	
	//	list.add(booking);
	//	}
	//	return list;
	//	}
	//
	public static Xemay findXemay(Connection conn, String id) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from xemay a where a.Id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, id);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {

		String name = rs.getString("Name");
		String type = rs.getString("Type");
		String price = rs.getString("Price");
		
		Xemay product = new Xemay(id, name, type, price);
		return product;
		}
		return null;
		}

	public static Oto findOto(Connection conn, String id) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from oto a where a.Id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, id);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {

		String name = rs.getString("Name");
		String type = rs.getString("Type");
		String price = rs.getString("Price");
		
		Oto product = new Oto(id, name, type, price);
		return product;
		}
		return null;
		}
	
	public static Phutung findPhutung(Connection conn, String id) throws SQLException {
		String sql = "Select a.Id, a.Name, a.Type, a.Price from phutung a where a.Id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, id);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {

		String name = rs.getString("Name");
		String type = rs.getString("Type");
		String price = rs.getString("Price");
		
		Phutung product = new Phutung(id, name, type, price);
		return product;
		}
		return null;
		}
		
		public static void updateXemay(Connection conn, Xemay xemay) throws SQLException {
		String sql = "Update xemay set Name =?, Type =?, Price=? where Id=? ";
		PreparedStatement pstm = conn.prepareStatement(sql);		
		pstm.setString(1, xemay.getName());
		pstm.setString(2, xemay.getType());
		pstm.setString(3, xemay.getPrice());		
		pstm.setString(4, xemay.getId());
		pstm.executeUpdate();
		}
			
		public static void updateOto(Connection conn, Oto oto) throws SQLException {
			String sql = "Update oto set Name =?, Type =?, Price=? where Id=? ";
			PreparedStatement pstm = conn.prepareStatement(sql);			
			pstm.setString(1, oto.getName());
			pstm.setString(2, oto.getType());
			pstm.setString(3, oto.getPrice());			
			pstm.setString(4, oto.getId());
			pstm.executeUpdate();
			}
		
		public static void updatephutung(Connection conn, Phutung phutung) throws SQLException {
			String sql = "Update phutung set Name =?, Type =?, Price=? where Id=? ";
			PreparedStatement pstm = conn.prepareStatement(sql);		
			pstm.setString(1, phutung.getName());
			pstm.setString(2, phutung.getType());
			pstm.setString(3, phutung.getPrice());		
			pstm.setString(4, phutung.getId());
			pstm.executeUpdate();
			}
			
		public static void deleteXemay(Connection conn, String id) throws SQLException {
			String sql = "Delete From xemay where Id = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
		}
		
		public static void deleteOto(Connection conn, String id) throws SQLException {
			String sql = "Delete From oto where Id = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
		}
		
		public static void deletephutung(Connection conn, String id) throws SQLException {
			String sql = "Delete From phutung where Id = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
		}
		
		public static Connection getStoredConnection(HttpServletRequest request) {
			// TODO Auto-generated method stub
			return null;
		}

		public static Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}

		public static void closeConnection(Connection conn) {
			// TODO Auto-generated method stub	
		}	
}
