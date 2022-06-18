package IoC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class myTest {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		
		//使用控制反轉，讓客戶自行創建對象
		//符合OCP(Open-Closed Principle) 開放擴充 封閉修改(一個軟體製品在面對擴展時是開放的，且擴充時不應修改到原有的程式)
		userService.setUserdao(new UserDaoImp());
		userService.getUser();

	}
}
