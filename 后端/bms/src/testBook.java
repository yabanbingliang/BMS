import java.util.List;

import com.qsl.dao.BookDao;
import com.qsl.entity.Book;

public class testBook {
	public static void main(String[] args) {
		BookDao t = new BookDao();
		Book add = new Book(1021, "Java程序设计", "大龙", "计算机", "辽宁图书出版社", 66);
//		Book update = new Book(1023, "高等数学上", "大强", "教材", "高等教育出版社", 6);
//		int flag = t.addBook(add);
//		List<Book> list = t.getList(1,100);
//		for (Book s : list) {
//			System.out.println(s.getBookName()+" "+s.getBookAuthor());
//		}
//		if (flag != 0) {
//			
//			for (Book s : list) {
//				System.out.println(s.getBookName()+" "+s.getBookAuthor());
//			}
//		} else {
//			System.out.println("添加失败");
//		}
////		
//		t.deleteBook(add);
//		list = t.getList();
//		for (Book s : list) {
//			System.out.println(s.getBookName()+" "+s.getBookAuthor());
//		}
//		
		t.updateBook(add);
		List<Book> list = t.getList(1,100);
		for (Book s : list) {
			System.out.println(s.getBookName()+" "+s.getBookAuthor());
		}
	}
}
