package IoC;

public class UserServiceImpl implements UserService {
    //更改這邊的東西來實現這個方法
	private UserDao userdao = new UserDaoOracleImpl();
	@Override
	public void getUser() {
		userdao.getUser();
	}
	


}
