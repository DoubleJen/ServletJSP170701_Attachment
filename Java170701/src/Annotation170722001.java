/*
 * Annotation => key-value => metadata
 * �Φb=>
 * 1. Compile Time(���ѽsĶ�ɴ�����T)
 * 2. �o�G�ɴ�
 * 3. Run Time
 * 
 * �榡=>
 * @Entity
 * 	ex: 
 * 	@Author(name="Brad", date="2017/07/22") => @Xxx(value="default") => @Xxx("default")
 * 	�H�U�i�P�ɦh�ӬۦP
 * 	@Author("Brad1")
 * 	@Author("Brad2")
 * 	@Author("Brad3")
 * */
public class Annotation170722001 {

	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.m1();
		obj1.m2();
	}

}
//�ϥ�java��Annotation
class Test1 {
	void m1() {}
	
	@Deprecated		//����ĳ�~��ϥΪ�Annotation
	void m2() {}
}

class Test2 extends Test1{
	//@Override		//�nOverride������Test1��m1()
	void m11() {}
	
	@Override
	void m1() {}
}
