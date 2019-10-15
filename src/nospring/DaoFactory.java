package nospring;

/**
 * 
 * 
 * 		
 */
/**
 * 
* <p>Title: DaoFactory</p>  
* <p>
*	Description: 
*   工厂模式:(负责new对象)
*   三要素： 1.基于继承或实现  2.向上转型  3.多态
* </p> 
* @author xianxian 
* @date 2019年10月14日
 */
public class DaoFactory {

	public static IUserDao createUserDao()
	{
		return new UserDaoImpl_2();
	}
}
