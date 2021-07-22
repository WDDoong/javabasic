import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OjdbcUpdate {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정할 번호를 입력해주세요.");
		int inNum = scan.nextInt();
		
		System.out.println("수정할 문장을 입력해주세요.");
		String inStr = scan.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			
			
			String sql = "UPDATE ojdbcTest SET (?, ?)" ;
				   
					
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, inNum); 	// VALUES(?,?) 첫번째 ?에 1을 넣는다.
			pstmt.setString(2, inStr); // VALUES(?,?) 두번째 ?에 test를 넣는다. 
			
			pstmt.executeUpdate();
			
			rs = pstmt.executeQuery(sql);
			System.out.println(rs.getInt(1));
			
			rs = pstmt.executeQuery(sql);
			
			scan.close();
			System.out.println("수정이 완료 되었습니다.");
			
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