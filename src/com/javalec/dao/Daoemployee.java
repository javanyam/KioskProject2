package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.javalec.util.DBConnect;

public class Daoemployee {
	String eid;
	String ename;
	String erank;
	String eindate;
	String eoutdate;
	String epw;

	public Daoemployee() {
		// TODO Auto-generated constructor stub
	}

	public Daoemployee(String eid, String epw) {
		super();
		this.eid = eid;
		this.epw = epw;
	}

//m
	public int employeecheck1() {// 탈퇴회원인지 아닌지 부터 판별 해당 아이디를 가진 사람의 탈퇴일이 null인지 판별
		// 0일때 customercheck1로 이동 1일때 탈퇴된 화원이라고 메세지
		PreparedStatement ps = null;
		int check1 = 0;

		String whereStatement = "select count(*) from employee  ";
		String whereStatement2 = "where eid='" + eid + "' and eoutdate is  not null  ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
// 연결
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
// 데이터베이스에 접근을 하겠다 선언한것이다.

// 입력할떄 필요없음 검색할떄 필요함
			Statement stmt_mysql = conn_mysql.createStatement();

			ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);

			while (rs.next()) {
				check1 = rs.getInt(1);

			}

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); // 개발할떈 이렇게 쓰지만 나중엔 메세지로 잠시만 기다려주세요 등 쓰면됨.
		}
		return check1;
	
	}

	public int employeecheck2() {// 아이디와 비밀번호 DB에 있는지 확인하고 탈퇴일이 null인지 확인
		// 1일때 id님 환영합니다. 0일때 비밀번호와 아이디를 확인 해주세요.
		PreparedStatement ps = null;
		int check2 = 0;
		String whereStatement = "select count(*) from employee where eid='" + eid + "' and epw='" + epw
				+ "' and eoutdate is null ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
// 연결
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
// 데이터베이스에 접근을 하겠다 선언한것이다.

// 입력할떄 필요없음 검색할떄 필요함
			Statement stmt_mysql = conn_mysql.createStatement();

			ResultSet rs = stmt_mysql.executeQuery(whereStatement);

			while (rs.next()) {
				check2 = rs.getInt(1);

			}

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); // 개발할떈 이렇게 쓰지만 나중엔 메세지로 잠시만 기다려주세요 등 쓰면됨.
		}
		return check2;

	}

}
