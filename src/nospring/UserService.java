package nospring;
/**
 * 没有使用spring的时候，UserService依赖于IUserDao，自己负责使用工厂创建自己所需要的IUserDao的对象，控制权在自己的手里
 */
public class UserService {

	IUserDao userDao = DaoFactory.createUserDao();
	
	public void findUsers()
	{
	    userDao.selectUser();
	}
}
