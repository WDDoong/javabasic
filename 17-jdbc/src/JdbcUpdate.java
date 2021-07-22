import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("수정할 번호를 입력해주세요.");
		int inNum = scan.nextInt();
		
		System.out.println("수정할 글을 입력해주세요.");
		String inStr = scan.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
		
			stmt = con.createStatement();
			
			// String sql = "SELECT * FROM JdbcInsert ";
			
			String sql = "UPDATE jdbcinsert SET";
					sql += "	str = '" + inStr +"'";
					sql += "WHERE	num = "+inNum;
			
			rs = stmt.executeQuery(sql);
			System.out.println("sql :: " + sql);
			
			System.out.println(rs.getInt(1));
			
		scan.close();	
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
				}
			}
	}

}
