
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=Byte.MIN_VALUE;
		byte b2=Byte.MAX_VALUE;
		//네트워크 전송, 파일 입출력
		// 1byte => 8bit
		System.out.println("byte의 범위:"+b1+"~"+b2);
		
		long l1=Long.MIN_VALUE;
		long l2=Long.MAX_VALUE;
		
		System.out.println("long의 범위:"+l1+"~"+l2);
		
		short s1=Short.MIN_VALUE;
		short s2=Short.MAX_VALUE;
		//사용빈도 거의 없음
		System.out.println("short의 범위:"+s1+"~"+s2);
		
		int i1=Integer.MIN_VALUE;
		int i2=Integer.MAX_VALUE;
		
		System.out.println("int의 범위:"+i1+"~"+i2);
		
		double d1=Double.MIN_VALUE;
		double d2=Double.MAX_VALUE;
		
		System.out.println("double의 범위:"+d1+"~"+d2);
		
		double d = 10.5f;
		float f = (float)10.5;
	}

}
