package m1d282;

/*
 * 访问控制权限修饰符来控制元素的访问范围
 * 包括：（范围由大到小排序）
 * （大）public 		公开的，在任何位置都可以访问
 *		 protected  同包 子类
 * 		缺省			同包
 * 		private   	私有的，在本类中能访问
 * 
 * 访问控制权限修饰符可以修饰类、变量、方法...
 * 类只能采用public 和 缺省 修饰（内部类（在类中定义一个类）除外）
 * 当某个数据只希望子类使用，用protected
 * 
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();	
		System.out.println(u.i);
		System.out.println(u.j);
	}

}
