package com.javalec.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.dto.DtoMenu;
import com.javalec.util.DBConnect;

public class DaoMenu {

	// F
	String menuid;
	String menuname;
	int menuprice;
	int menuquantity;
	String menuimage;
	public static ArrayList<DtoMenu> a = new ArrayList<DtoMenu>();
	public static String selectmenuid;
	
	// C
	public DaoMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	// M
	
	// DB에서 menuid 가져오기
		public ArrayList<String> selectMenu() {
			
			ArrayList<String> menuId = new ArrayList<String>();
			String query = "select menuid from menu ";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql, DBConnect.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
				ResultSet rs = stmt_mysql.executeQuery(query);

				while(rs.next()) {
					
					String name = rs.getString(1);
					menuId.add(name);
				}

				conn_mysql.close();

			} catch (Exception e) {
				e.printStackTrace(); 
			}
			
			return menuId;
			
		}
	
	public DtoMenu selectMenuInfo(){
		
		
		DtoMenu menuList = null;
		
		String query = "select menuname, menuprice, menuimage from menu ";
		String query1 = "where menuid = '" + selectmenuid + "'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql, DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			ResultSet rs = stmt_mysql.executeQuery(query + query1);

			while(rs.next()) {
				
				String wkName = rs.getString(1);
				int wkPrice = Integer.parseInt(rs.getString(2));
				
				DBConnect.filename = DBConnect.filename + 1; //파일 이름
	        	File file = new File(Integer.toString(DBConnect.filename)); // 1번 파일 생성
	        	FileOutputStream output = new FileOutputStream(file);
	        	InputStream input = rs.getBinaryStream(3);
	            byte[] buffer = new byte[1024];
	            while (input.read(buffer) > 0) {
	                output.write(buffer);
	            }
				
				menuList = new DtoMenu(wkName, wkPrice);
				
			}

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return menuList;
	}
	
public DtoMenu selectMenuInfo2(){
		
		
		DtoMenu menuList = null;
		
		String query = "select menuname, menuprice, menuimage from menu ";
		String query1 = "where menuid = '" + selectmenuid + "'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql, DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			ResultSet rs = stmt_mysql.executeQuery(query + query1);

			while(rs.next()) {
				
				String wkName = rs.getString(1);
				int wkPrice = Integer.parseInt(rs.getString(2));
				
				DBConnect.filename = DBConnect.filename + 1; //파일 이름
	        	File file = new File(Integer.toString(DBConnect.filename)); // 1번 파일 생성
	        	FileOutputStream output = new FileOutputStream(file);
	        	InputStream input = rs.getBinaryStream(3);
	            byte[] buffer = new byte[1024];
	            while (input.read(buffer) > 0) {
	                output.write(buffer);
	            }
				
				menuList = new DtoMenu(wkName, wkPrice);
				a.add(menuList);
				
			}

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return menuList;
	}
	
} // End
