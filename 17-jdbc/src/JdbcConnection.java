import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) {
//		JAVA와 DB를 연동하기 위해서 JSBC(Java DataBase Connectivity)라는 API가 필요합니다.
//		MySQL은 그 중에서도 Connector J라는 라이브러리를 이용합니다.
//		Connector J는 MySQL 공홈에서 다운받아 설치할 수 있고
//		아니면 jar파일만 구해서 바로 적용가능 합니다.
		
//		공식 홈페이즈 루트는
//		1. mysql.com 접속
//		2. downloads탭에서 하단의 mysql community(GPL)선택
//		3. OS에 맞는 버전 선택 (mysql installer 선택)
//		4. 상단의 2메가바이트짜리 업데이트 파일 다운 후 실행.
//		5. connector J 설치
//		6. program files(x86) -> mysql -> connector J 폴더 내부의 .jar파일 확인
//		
//		이제 jar파일을 구했다면 사용할 프로젝트에 jar파일을 추가해야 한다.
//		프로젝트 생성시 계속 추가해야하니 방법을 잘 기억해두자.
//		1. 프로젝트 우클릭 -> properties -> 좌측탭의 java build path
//		2. 상단 탭의 libraries 선택 후 우측의 ADD library 선택
//		3. user  library 선택후 우측 user libraries 선택
//		4. 우측 new 버튼 누르고 이름 임의로 입력(현재 jdbc connection)
//		5. Add External Jar 선택 후 connector j 폴더로 이동
//		6. jar파일 선택 후 apply and close 선택
		
		// DB연동 코드 작성
		// 위쪽의 모든 작업이 끝났다면 본격적으로 코드를 작성해보겠습니다.
		// 기본적으로 (DB데이터)import java.sql.*; 을 1번 라인에 입력하고 시작합니다.
		
		// 연결은 Connection 자료형으로 진행한다.
		Connection con = null;
		
		// DB연결에 관련된 로직은 무조건 try~catch구문을 활용하도록 강요받는다.
		try {
		/** MySQL DB와 연동할 것임을 나타냅니다.*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		/** 접속url은 jdbc:mysql://localhost/db명 입니다.*/
		/** Oracle 접속url jdbc:oracle:thin:@localhost:1521/db명 */
			String url = "jdbc:mysql://localhost/sqldb/employees";
			
		/** 접속주소, 계정, 비밀번호를 이용해 접속요청을 넣는다.*/
			con = DriverManager.getConnection(url, "root", "mysql");
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


