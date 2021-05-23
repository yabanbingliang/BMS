import java.util.List;

import com.qsl.dao.BookDao;
import com.qsl.entity.Book;

public class testGetBookListByName {
	public static void main(String[] args) {
		int page_curr = 1;
		int page_row = 10;
		String bookName = "¸ß";
		System.out.println(bookName);
		
		BookDao dao = new BookDao();
		List<Book> list = dao.getList(page_curr, page_row, bookName);
		
		for (Book s:list){
			System.out.println(s.getBookName());
		}
		int total = dao.count(bookName);
		System.out.println(total);
	}
}
