package IoC;

public class UserDaoImp implements UserDao {
	@Override
	public void getUser() {
		System.out.println("默認獲取用戶的數據");
	}
	
}
