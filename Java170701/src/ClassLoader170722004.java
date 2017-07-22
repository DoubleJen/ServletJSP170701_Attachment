import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Class Loader and reflection
public class ClassLoader170722004 {

	public static void main(String[] args) {
		String[] name = {"Brad"};
		Class nameClass = name.getClass();
		System.out.println(nameClass.getName());//�Ǧ^���O
		System.out.println(nameClass.isInterface());
		System.out.println(nameClass.isPrimitive());
		System.out.println(nameClass.isArray());
		System.out.println(nameClass.getSuperclass().getName());
		System.out.println("===================");
		
	 	Class strClass = String.class;
		System.out.println(strClass.getName());//�Ǧ^���O
		System.out.println(strClass.isInterface());
		System.out.println(strClass.isPrimitive());
		System.out.println(strClass.isArray());
		System.out.println(strClass.getSuperclass().getName());
		System.out.println("===================");
		
		
		//���J���O
		try {
			Class c1 = Class.forName("ClassLoader00401");	//�@��|��package name
			c1.newInstance();	//���X�@�Ӫ������ (���b�N�W��)
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("===================");
		
		
		try {
			Class c2 = Class.forName("tw.dou.app170716.Dou170722005");
			System.out.println(c2.getName());
			System.out.println(c2.getPackage().getName());
			
			Constructor[] cs = c2.getConstructors();
			System.out.println(cs.length);//�Ǧ^N��public�غc��
			for(Constructor cc: cs) {
				Class[] types = cc.getParameterTypes();
				for(Class type : types) {
					System.out.println(type.getName());
				}
				System.out.println("---Class type---");
			}
			System.out.println("===================");
			
			Method[] methods = c2.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName());
				//�L�XObject�U����k(���tpublic�H�~��k)https://docs.oracle.com/javase/7/docs/api/
			}
			
			
		} catch (ClassNotFoundException ee) {
			System.out.println(ee.toString());
		}
		
	
		
		
	}

}

class ClassLoader00401{
	//�{���϶�
	static {
		System.out.println("Load ClassLoader00401");
	}
	{
		System.out.println("ClassLoader00401 OBJ");
	}
}
