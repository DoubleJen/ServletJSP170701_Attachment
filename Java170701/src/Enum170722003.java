//Enum�C�|
public class Enum170722003 {
	public static final int  STOP=1;
	public static final int  UP=2;
	public static final int  DOWN=3;
	public static final int  LEFT=4;
	public static final int  RIGHT=5;

	public static void main(String[] args) {
		Zone zone1 = Zone.area2; //�u��area2 ���w�����|�Ӫ�����骺�غc��
		System.out.println("===================");
		
		Zone zone2 = Zone.area2;
		System.out.println(zone1==zone2);//true ���zone1 and zone2����area2
		System.out.println(zone1.getCode());
		switch(zone2) {
			case area1: break;
			case area2: break;
			case area3: break;
			case area4: break;
		}
		System.out.println("===================");
		
		int myDir = Enum170722003.STOP;
		switch(myDir) {
			case Enum170722003.STOP: break;
			case Enum170722003.UP: break;
			case Enum170722003.DOWN: break;
			case Enum170722003.LEFT: break;
			case Enum170722003.RIGHT: break;
			case 123: break;
			
		}
		
	}

}

enum Dir{
	STOP, UP, DOWM, RIGHT, LEFT //�C�|����=>�û��O�Ĥ@�D�ԭz�y
};

enum Zone{
	area1("401"), area2("402"), area3("403"), area4("404");
	private String code;
	private Zone(String code) {
		System.out.println("ZONE");
		this.code=code;
	}
	public String getCode() {
		return code;
	}
}
