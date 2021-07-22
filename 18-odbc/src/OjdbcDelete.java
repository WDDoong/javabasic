import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OjdbcDelete {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 번호를 입력해주세요.");
		int inNum = scan.nextInt();
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");

			pstmt = con.prepareStatement(url);
			
			String sql = "DELETE FROM ojdbcTest WHERE Num= " + inNum;
			
			
			pstmt.executeUpdate(sql);
			
			scan.close();
			
			System.out.println("삭제가 완료 되었습니다.");
			
			
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



