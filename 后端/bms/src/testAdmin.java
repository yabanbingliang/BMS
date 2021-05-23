import java.util.List;

import com.qsl.dao.AdministratorDao;
import com.qsl.entity.Administrator;

public class testAdmin {
	public static void main(String[] args) {
		Administrator add = new Administrator(2, "admin2", "666", "ÄÐ");
		Administrator add2 = new Administrator(1, "qsl", "888", "ÄÐ");
		AdministratorDao t = new AdministratorDao();
		
		t.addAdministrator(add);
		List<Administrator> list = t.getList();
		for (Administrator s : list) {
			System.out.println(s.getAdminName()+" "+s.getAdminPWD());
		}
		
		t.deleteAdministrator(add);
		list = t.getList();
		for (Administrator s : list) {
			System.out.println(s.getAdminName()+" "+s.getAdminPWD());
		}
		
		t.updateAdministrator(add2);
		list = t.getList();
		for (Administrator s : list) {
			System.out.println(s.getAdminName()+" "+s.getAdminPWD());
		}
	}
}
