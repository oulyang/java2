package m1d281;

/*
 * final�ؼ��֣���ʾ���յģ����ɱ��
 * 
 * final���ε����޷��̳�
 * 
 * final���εķ����޷�������
 * 
 * final���εı���һ����ֵ�󲻿����¸�ֵ
 * 
 * final���ε�ʵ�����������ֶ���ֵ��ʵ��������Ĭ��ֵ�������ܲ���Ĭ��ֵ
 * 
 * final���ε�����һ��ָ��ĳ������֮������ָ���������󣬱�ָ��Ķ����޷�������
 * ��ָ�����Ĳ��� ���Կ����޸�
 */


public class Test1 {
	/*
	//final int a;�������
	//��һ��
	final int a=100;
	
	//�ڶ���
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
	//final���ε�ʵ�������ǲ��ɱ�ģ����ֱ���һ���static����ʹ�ã�����Ϊ��������
	
	
	/*�����Ķ����﷨��ʽ
	 * public static final ���� ������=ֵ;
	 * 
	 * java�淶��Ҫ����������ȫ����д��ÿ������֮�����»��߸���
	 */
	//static final String country="China";
	
	public static final String PERSONAL_COUNTRY="China";
}
