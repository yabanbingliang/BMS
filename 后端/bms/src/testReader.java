import java.util.List;

import com.qsl.dao.ReaderDao;
import com.qsl.entity.Reader;

public class testReader {
	public static void main(String[] args) {
		ReaderDao t = new ReaderDao();
//		List<Reader> list = t.getList();
//		for (Reader s : list) {
//			System.out.println(s.getReaderName()+" "+s.getReaderDepartment());
//		}
//		List<Reader> list = t.getList("小");
//		for (Reader s : list) {
//			System.out.println(s.getReaderName()+" "+s.getReaderDepartment());
//		}
//		List<Reader> list = t.getList(110);
//		for (Reader s : list) {
//			System.out.println(s.getReaderName()+" "+s.getReaderDepartment());
//		}
		Reader r = new Reader(181491104, "孙韬宁", "男", "信息学院", "软件工程", 666);
		Reader e = new Reader(181491106, "曲尚来", "男", "信息学院", "软件工程", 333);
//		t.addReader(r);
//		List<Reader> list = t.getList();
//		for (Reader s : list) {
//			System.out.println(s.getReaderName()+" "+s.getReaderDepartment());
//		}
//		t.deleteReader(r);
//		List<Reader> list = t.getList();
//		for (Reader s : list) {
//			System.out.println(s.getReaderName()+" "+s.getReaderDepartment());
//		}
		t.updateReader(e);
		List<Reader> list = t.getList();
		for (Reader s : list) {
			System.out.println(s.getReaderName()+" "+s.getReaderDepartment()+" "+s.getReaderPWD());
		}
	}
}
