package com.qsl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsl.entity.Reader;

public class ReaderDao {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
//	查所有的
	public List<Reader> getList() {
		List<Reader> list = new ArrayList<Reader>();
		String sql = "SELECT * FROM reader order by reader_sno";
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int readerSno = rs.getInt("reader_sno");
				String readerName = rs.getString("reader_name");
				String readerSex = rs.getString("reader_sex");
				String readerDepartment = rs.getString("reader_department");
				String readerProfession = rs.getString("reader_profession");
				int readerPWD = rs.getInt("reader_pwd");
				Reader m = new Reader(readerSno, readerName, readerSex, readerDepartment, readerProfession, readerPWD);

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
//	模糊查询 按名
	public List<Reader> getList(String name) {
		List<Reader> list = new ArrayList<Reader>();
		String sql = "SELECT * FROM reader where reader_name like ? order by reader_sno";
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			if(name.trim().equals("")){
				name = "%";
			}else{
				name = "%"+name+"%";
			}
			//给sql中的？占位符指定数据，注意数据类型
			stmt.setString(1, name);
			
//			System.out.println(stmt.toString());
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				int readerSno = rs.getInt("reader_sno");
				String readerName = rs.getString("reader_name");
				String readerSex = rs.getString("reader_sex");
				String readerDepartment = rs.getString("reader_department");
				String readerProfession = rs.getString("reader_profession");
				int readerPWD = rs.getInt("reader_pwd");
				Reader m = new Reader(readerSno, readerName, readerSex, readerDepartment, readerProfession, readerPWD);

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
//	模糊查询 按学号
	public List<Reader> getList(int reader_sno) {
		List<Reader> list = new ArrayList<Reader>();
		String sql = "SELECT * FROM reader where reader_sno like ? order by reader_sno";
		try {
			conn = BaseDao.getConn();
			String sno = Integer.toString(reader_sno);
			stmt = conn.prepareStatement(sql);
			if(sno.trim().equals("-1")){
				sno = "%";
			}else{
				sno = "%"+sno+"%";
			}
			//给sql中的？占位符指定数据，注意数据类型
			stmt.setString(1, sno);
			
//			System.out.println(stmt.toString());
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				int readerSno = rs.getInt("reader_sno");
				String readerName = rs.getString("reader_name");
				String readerSex = rs.getString("reader_sex");
				String readerDepartment = rs.getString("reader_department");
				String readerProfession = rs.getString("reader_profession");
				int readerPWD = rs.getInt("reader_pwd");
				Reader m = new Reader(readerSno, readerName, readerSex, readerDepartment, readerProfession, readerPWD);

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
	public int addReader(Reader reader) {
		int readerSno = reader.getReaderSno();
		String readerName = reader.getReaderName();
		String readerSex = reader.getReaderDepartment();
		String readerDepartment = reader.getReaderDepartment();
		String readerProfession = reader.getReaderProfession();
		int readerPWD = reader.getReaderPWD();
		
		String sql = "INSERT INTO bms.reader(reader_sno, reader_name, reader_sex, reader_department, reader_profession, reader_pwd) "
				+ "VALUES ("+ readerSno +", '"+ readerName +"', '"+ readerSex +"', '"+ readerDepartment +"', '"+ readerProfession +"', '"+ readerPWD +"');";
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
	public int deleteReader(Reader reader) {
		int readerSno = reader.getReaderSno();
		String readerName = reader.getReaderName();
		String readerSex = reader.getReaderDepartment();
		String readerDepartment = reader.getReaderDepartment();
		String readerProfession = reader.getReaderProfession();
		int readerPWD = reader.getReaderPWD();
		
		String sql = "DELETE FROM reader where reader_sno = "+ readerSno +"";
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
	public int updateReader(Reader reader) {
		int readerSno = reader.getReaderSno();
		String readerName = reader.getReaderName();
		String readerSex = reader.getReaderDepartment();
		String readerDepartment = reader.getReaderDepartment();
		String readerProfession = reader.getReaderProfession();
		int readerPWD = reader.getReaderPWD();
		
		String sql = "UPDATE bms.reader SET "
				+ "reader_name = '"+ readerName +"', reader_sex = '"+ readerSex +"', reader_department = '"+ readerDepartment +"', "
				+ "reader_profession = '"+ readerProfession +"', reader_pwd = '"+ readerPWD +"' WHERE reader_sno = "+ readerSno +";";
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
