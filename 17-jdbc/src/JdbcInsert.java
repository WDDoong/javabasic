import java.sql.*;
import java.util.Scanner;

public class JdbcInsert {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
//		ResultSet은 SLEECT구문에 대한 결과만 처리함. 이외의 구문에는 불필요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num 컬럼에 들어갈 정수를 입력해주세요.");
		int inNum = scan.nextInt();
		
		System.out.println("str 컬럼에 들어갈 문자열을 입력해주세요.");
		String inStr = scan.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
		
			stmt = con.createStatement();
			
			String sql = "INSERT INTO JDBCInsert (num, str) VALUES(" + inNum + ", '" + inStr + "')";
			System.out.println(sql);
			
			// SELECT문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외 구문은 excuteUpdate(sql구문); 으로 호출합니다.
			stmt.executeUpdate(sql);
			
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
