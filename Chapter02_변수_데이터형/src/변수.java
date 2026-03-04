/*
 * 변수 / 상수
 * int a = 10;
 * final A = 10;
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1문
		/*
		 * 	홍길동은
		 * 		사과 3개
		 * 		배 2개
		 * 		=> 메모리에 저장
		 * 		=> 과일 총 갯수
		 */
		/*
		int apple = 3;
		int pear = 2;
		System.out.println("사과:" + apple);
		System.out.println("배:" + pear);
		System.out.println("과일 총 갯수:" + (apple + pear));
		*/
		//2문
		/*
		 * 	사과 1개에 1000원
		 * 	배 1개에 2000원
		 * 	-----------------
		 * 	사과 3개, 배 2개
		 * 	=> 총 가격
		 */
		/*
		int appleP = 1000;
		
		int pearP = 2000;
		int apple = 3;
		int pear = 2;
		System.out.println("총 가격:" + (appleP*apple + pearP*pear));
		*/
		//3문
		/*
		 * 	사과 10개
		 * 	친구 3명에게 나눠주려면 한명당 몇개를 받을수 있을까?
		 */
		int apple = 10;
		System.out.println(apple/3.0);
	}

}
