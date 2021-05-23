package com.qsl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsl.entity.Book;

public class BookDao {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
//	 无查询条件 返回数据总条数
	public int count(){
		String sql = "select count(*) num from book";
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()){
				return rs.getInt("num");
			}
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
//	模糊查询 返回数据总条数
	public int count(String name){
		String sql = "select count(*) num from book  where book_name like ? ";
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			
			if(name.trim().equals("")){
				name = "%";
			}else{
				name = "%"+name+"%";
			}
			
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			if(rs.next()){
				return rs.getInt("num");
			}
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally{
			BaseDao.closeAll(conn, stmt, rs);
		}
	}
//	查所有的图书信息
	public List<Book> getList(int page_curr, int page_row) {
		List<Book> list = new ArrayList<Book>();
		String sql = "SELECT * FROM book order by book_id limit ?,?";
//		System.out.println(sql);
		try {
			conn = BaseDao.getConn();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, (page_curr - 1) * page_row);
			stmt.setInt(2, page_row);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int bookID = rs.getInt("book_id");
				String bookName = rs.getString("book_name");
				String bookAuthor = rs.getString("book_author");
				String bookCategory = rs.getString("book_category");
				String bookPublish = rs.getString("book_publish");
				int bookStock = rs.getInt("book_stock");
				Book m = new Book(bookID, bookName, bookAuthor, bookCategory, bookPublish, bookStock);

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
//	模糊查询图书的信息
	public List<Book> getList(String name) {
		List<Book> list = new ArrayList<Book>();
		String sql = "SELECT * FROM book where book_name like ? order by book_id";
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
				int bookID = rs.getInt("book_id");
				String bookName = rs.getString("book_name");
				String bookAuthor = rs.getString("book_author");
				String bookCategory = rs.getString("book_category");
				String bookPublish = rs.getString("book_publish");
				int bookStock = rs.getInt("book_stock");
				Book m = new Book(bookID, bookName, bookAuthor, bookCategory, bookPublish, bookStock);

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
//	模糊查询图书信息 可分页
	public List<Book> getList(int page_curr, int page_row, String name) {
		List<Book> list = new ArrayList<Book>();
		String sql = "SELECT * FROM book where book_name like ? order by book_id limit ?,?";
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
			stmt.setInt(2, (page_curr - 1) * page_row);
			stmt.setInt(3, page_row);
			
//			System.out.println(stmt.toString());
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				int bookID = rs.getInt("book_id");
				String bookName = rs.getString("book_name");
				String bookAuthor = rs.getString("book_author");
				String bookCategory = rs.getString("book_category");
				String bookPublish = rs.getString("book_publish");
				int bookStock = rs.getInt("book_stock");
				Book m = new Book(bookID, bookName, bookAuthor, bookCategory, bookPublish, bookStock);

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
	public int addBook(Book book) {
		String bookName = book.getBookName();
		String bookAuthor = book.getBookAuthor();
		String bookCategory = book.getBookCategory();
		String bookPublish = book.getBookPublish();
		int bookStock = book.getBookStock();
		
		String sql = "INSERT INTO bms.book(book_name, book_author, book_category, book_publish, book_stock) "
				+ "VALUES ('"+ bookName +"', '"+ bookAuthor +"', '"+ bookCategory +"', '"+ bookPublish +"', '"+ bookStock +"');";

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
	public int deleteBook(Book book) {
		int bookID = book.getBookID();
		String bookName = book.getBookName();
		String bookAuthor = book.getBookAuthor();
		String bookCategory = book.getBookCategory();
		String bookPublish = book.getBookPublish();
		int bookStock = book.getBookStock();
		
		String sql = "DELETE FROM book where book_ID = "+ bookID +"";
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
	public int deleteBook(String bookID) {
		
		String sql = "DELETE FROM book where book_ID = "+ bookID +"";
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
	public int updateBook(Book book) {
		int bookID = book.getBookID();
		String bookName = book.getBookName();
		String bookAuthor = book.getBookAuthor();
		String bookCategory = book.getBookCategory();
		String bookPublish = book.getBookPublish();
		int bookStock = book.getBookStock();
		String sql = "UPDATE bms.book "
				+ "SET book_name = '"+ bookName +"', book_author = '"+ bookAuthor +"', "
				+ "book_category = '"+ bookCategory +"', book_publish = '"+ bookPublish +"', book_stock = "+ bookStock +" "
				+ "WHERE book_id = "+ bookID +";";
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
