
public class Member170715test {

	public static void main(String[] args) {
		
		try {
			Member170715 member = new Member170715();
			member.setAccount("test1");
			member.setPasswd("124");
			member.setRealName("TEST");
			
			if(member.newInsert()) {
				System.out.println("SUCCESS");
			}else {
				System.out.println("NOT OK");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
