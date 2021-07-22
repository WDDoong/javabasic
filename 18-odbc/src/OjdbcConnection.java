import java.sql.*;

public class OjdbcConnection {
	
	public static void main(String[] args) {
		// MySQL과 마찬가지로 Oracle SQL역시 .jar파일을 제공한다.
		// 먼저, jar파일을 import해야 연결이 되기 때문에 연결부터 실시
		// .jar파일의 위치
		// sqldeveloper폴더 -> jdbc폴더 -> lib폴더 -> ojdbc8.jar
		// 프로젝트에 임포트 하면 Oracle SQL과 연동된다.
		
		// 프로젝트 우클릭 -> Properties -> Java build Path -> 상단 라이브러리 탭 ->
		// add Library 선택 -> User Library -> User libraries -> NEW -> 이름짓고
		// -> ADD External jar -> jar파일 추가 -> Apply
		
		Connection con = null;
		
		try {
			// Oracle SQL과 연동할 것임을 나타냄.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 접속 URL도 Oracle SQL에 맞춰서 적습니다.
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "mytest", "mytest");
		} catch(ClassNotFoundException e) {
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


