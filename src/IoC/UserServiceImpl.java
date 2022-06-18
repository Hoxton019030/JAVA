package IoC;

public class UserServiceImpl implements UserService {
    //更改這邊的東西來實現這個方法
	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void getUser() {
		userdao.getUser();
	}

	


}
