package m1d281;

/*
 * final关键字，表示最终的，不可变的
 * 
 * final修饰的类无法继承
 * 
 * final修饰的方法无法被覆盖
 * 
 * final修饰的变量一旦赋值后不可重新赋值
 * 
 * final修饰的实例变量必须手动赋值（实例变量有默认值），不能采用默认值
 * 
 * final修饰的引用一旦指向某个对象之后不能再指向其他对象，被指向的对象无法被回收
 * 但指向对象的参数 属性可以修改
 */


public class Test1 {
	/*
	//final int a;编译错误
	//第一种
	final int a=100;
	
	//第二种
	final int b;
	public Test1() {
		this.b=100;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new A("100");
		
		final B b1=new B(100);
		b1.id=10;
		

	}

	
}

class Chinese{
	//final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为“常量”
	
	
	/*常量的定义语法格式
	 * public static final 类型 变量名=值;
	 * 
	 * java规范中要求常量的名字全部大写，每个单词之间用下划线隔开
	 */
	//static final String country="China";
	
	public static final String PERSONAL_COUNTRY="China";
}
