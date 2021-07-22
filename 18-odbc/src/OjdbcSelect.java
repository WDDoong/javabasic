import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcSelect {

	public static void main(String[] args) {
//		 Oracle SQL과 연동해서
//		 Employees 테이블의 모든 인원에 대한 정보를
//		  콘솔창에 띄워주세요.
//		   SLEECT * From employees;
//		  에 대한 결과물을 콘솔창에 띄워라

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// Oracle SQL과 연동할 것임을 나타냄.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속 URL도 Oracle SQL에 맞춰서 적습니다.
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "hr", "hr");
			
			stmt = con.createStatement();
			
			String sql = "SELECT employee_id, first_name, hire_date, job_id, salary FROM employees";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { // While(true) 가능. 1.커서 옮기기 / 2.참이나 거짓을 리턴
				int empNo = rs.getInt(1);
				String fName = rs.getString(2);
				Date hiDate = rs.getDate(3);
				String jobId = rs.getString(4);
				int salary = rs.getInt(5);
				System.out.println("사번 : " + empNo + 
						", 성 : " + fName + 
						", 입사일 : " + hiDate +
						", 직무명 : " + jobId + 
						", 연봉 : " + salary);
			}	
		
		
			
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


