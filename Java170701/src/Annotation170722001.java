/*
 * Annotation => key-value => metadata
 * 用在=>
 * 1. Compile Time(提供編譯時期的資訊)
 * 2. 發佈時期
 * 3. Run Time
 * 
 * 格式=>
 * @Entity
 * 	ex: 
 * 	@Author(name="Brad", date="2017/07/22") => @Xxx(value="default") => @Xxx("default")
 * 	以下可同時多個相同
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
//使用java的Annotation
class Test1 {
	void m1() {}
	
	@Deprecated		//不建議繼續使用的Annotation
	void m2() {}
}

class Test2 extends Test1{
	//@Override		//要Override的應為Test1的m1()
	void m11() {}
	
	@Override
	void m1() {}
}
