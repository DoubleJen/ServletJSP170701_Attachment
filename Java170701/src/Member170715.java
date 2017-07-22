

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Member170715 {
	private String account, passwd, realname;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public Member170715() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/double", "root", "root");
	}
	
	public void setAccount(String account) {this.account=account;}
	public void setPasswd(String passwd) {this.passwd=passwd;}
	public void setRealName(String realname) {this.realname=realname;}
	
	public String getName() {return account;}
	public String getPasswd() {return passwd;}
	public String getRealName() {return realname;}
	
	public boolean newInsert() throws Exception {
		pstmt =	conn.prepareStatement("insert into member(account, passwd, realname) values(?,?,?)");
		pstmt.setString(1, account);
		pstmt.setString(2, passwd);
		pstmt.setString(3, realname);
		
	 	int n = pstmt.executeUpdate();
		return n>0;
		}
}
