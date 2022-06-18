package IoC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class myTest {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		userService.getUser();
	}
}
