import java.util.List;

import com.qsl.dao.BookDao;
import com.qsl.entity.Book;

public class testBook {
	public static void main(String[] args) {
		BookDao t = new BookDao();
		Book add = new Book(1021, "Java�������", "����", "�����", "����ͼ�������", 66);
//		Book update = new Book(1023, "�ߵ���ѧ��", "��ǿ", "�̲�", "�ߵȽ���������", 6);
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
//			System.out.println("���ʧ��");
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
