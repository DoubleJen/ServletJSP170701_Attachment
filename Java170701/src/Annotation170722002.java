import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//Annotaion
public class Annotation170722002 {

	public static void main(String[] args) {
		Annotation17072200201 obj1 = new Annotation17072200201();
		obj1.m1();
		
		Annotation17072200202 obj2 = new Annotation17072200202();
		obj2.m1();
		
		Annotation17072200203 obj3 = new Annotation17072200203();
		obj3.m1();
		
		Annotation17072200205 obj5 = new Annotation17072200205();
		obj5.m1();
		System.out.println("====================");
		
		Annotation17072200206 obj6 = new Annotation17072200206();
		obj6.m1();

	}

}

//Marker Annotation => �ۤv�������Ѹ�T
//�ۦP�ɮץu�|���@��public �ҥH�H�U�Ӧ۩w�qAnnotation���[public
@interface Debug{}
class Annotation17072200201{
	@Debug
	void m1() {}
}

@interface Debug2{
	String value();
}
class Annotation17072200202{
	@Debug2(value="debug2")
	void m1() {}
}
class Annotation17072200203{
	@Debug2("debug2")	//�P��@Debug2(value="debug2")
	void m1() {}
}

//�Q��Annotation�ǻ��h�ӭ�
@interface Debug3{
	String[] value();
}
class Annotation17072200204{
	@Debug3(value= {"A1","A2","B1","B2"})
	void m1() {}
}

//metadata
@Retention(RetentionPolicy.RUNTIME)	//�ŧi�ΨӳB�zRunTime�����q
@interface Debug4{
	String[] value() default "Brad";
}
//metadata
class Annotation17072200205{
	@Debug4(value= {"a", "b", "c"})	//�]���w�]�ȩҥH�����Ȥ]�L���Y
	public void m1() {
		try {
			Debug4 debug4 = getClass().getMethod("m1", null).getAnnotation(Debug4.class); //���oDebug4���������
			String[] values = debug4.value();
			for(String value: values) {
				System.out.println(value);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface Debug5{
	//�C�|
	public enum Dir{
		STOP, UP, DOWM, RIGHT, LEFT
	};
	Dir dir() default Dir.STOP;
	String[] names() default {"guest"};
	boolean isWinner() default false;
}
class Annotation17072200206{
	@Debug5(
			dir = Debug5.Dir.LEFT,
			names = {"Brad1", "Brad2"}
			)
	public void m1() {
		try {
			Debug5 debug5 = getClass().getMethod("m1", null).getAnnotation(Debug5.class);
			Enum dir = debug5.dir();
			System.out.println(dir);
			
			String[] names = debug5.names();
			for(String name: names) {
				System.out.println(name);
			}
			
			boolean isWinner = debug5.isWinner();
			System.out.println(isWinner);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}