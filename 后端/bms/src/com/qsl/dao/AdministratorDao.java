package com.qsl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsl.entity.Administrator;

public class AdministratorDao {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
//	登录时按id查询
	public Administrator getAdministratorById(String admin_name){
		String sql = "select * from administrator where admin_name=?";
		
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, admin_name);
			rs = stmt.executeQuery();
			while(rs.next()){
				int adminID = rs.getInt("admin_id");
				String adminName = rs.getString("admin_name");
				String adminPWD = rs.getString("admin_pwd");
				String adminSex = rs.getString("admin_Sex");
				Administrator m = new Administrator(adminID, adminName, adminPWD, adminSex);
				return m;
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
	
//	查
	public List<Administrator> getList() {
		List<Administrator> list = new ArrayList<Administrator>();
		String sql = "select * from administrator order by admin_id asc";
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int adminID = rs.getInt("admin_id");
				String adminName = rs.getString("admin_name");
				String adminPWD = rs.getString("admin_pwd");
				String adminSex = rs.getString("admin_Sex");
				Administrator m = new Administrator(adminID, adminName, adminPWD, adminSex);

				list.add(m);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
//	增
	public int addAdministrator(Administrator admin) {
		int adminID = admin.getAdminID();
		String adminName = admin.getAdminName();
		String adminPWD = admin.getAdminPWD();
		String adminSex = admin.getAdminSEX();
		String sql = "INSERT INTO bms.administrator(admin_id, admin_name, admin_pwd, admin_sex) "
				+ "VALUES ("+ adminID +", '"+ adminName +"', '"+ adminPWD +"', '"+ adminSex +"');";
		System.out.println(sql);
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			int res = stmt. executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
//	删
	public int deleteAdministrator(Administrator admin) {
		int adminID = admin.getAdminID();
		String adminName = admin.getAdminName();
		String adminPWD = admin.getAdminPWD();
		String adminSex = admin.getAdminSEX();
		String sql = "DELETE FROM  bms.administrator WHERE admin_id = "+ adminID +";";
		System.out.println(sql);
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			int res = stmt. executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
//	改
	public int updateAdministrator(Administrator admin) {
		int adminID = admin.getAdminID();
		String adminName = admin.getAdminName();
		String adminPWD = admin.getAdminPWD();
		String adminSex = admin.getAdminSEX();
		String sql = "UPDATE bms.administrator SET "
				+ "admin_name = '"+ adminName +"', admin_pwd = '"+ adminPWD +"', admin_sex = '"+ adminSex +"' "
				+ "WHERE admin_id = "+ adminID +";";
		System.out.println(sql);
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			int res = stmt. executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			BaseDao.closeAll(conn, stmt, rs);
		}
	}	
}
