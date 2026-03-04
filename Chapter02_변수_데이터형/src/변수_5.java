
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int kor;
		int math;
		int eng;
		int total;
		double average;
		String score;
		int grade;
		*/
		/*
		int drink = 12;
		drink -= 5;
		System.out.println("남은 음료수:"+drink);
		*/
		/*
		 * 		샌드위치 ==> 250
		 * 		사과 ==> 100
		 * 		쥬스 ==> 150
		 * 
		 * 		샌드위치 1 사과 2 쥬스 1
		 * 		=> 총 칼로리
		 */
		
		/*
		 * int sand = 250; 
		 * int apple = 100; 
		 * int juice = 150; 
		 * System.out.println("총 칼로리:" + (sand+apple*2+juice));
		 */	
		/*
		 * 		이름은 홍길동 / 성별 남자 / 나이 20 / 키 180.5 / card false
		 * 		장바구니 
		 * 		  우유 = 1200 => 2개
		 * 		  빵 = 1500 => 3개
		 * 		  계란 = 200 => 10개
		 * 		---------------------------------------
		 */
		String name = "홍길동";
		String sex = "남자";
		int age = 20;
		double height = 180.5;
		boolean isCard = false;
		int milk = 1200*2;
		int bread = 1500*3;
		int egg = 200*10;
		
		System.out.println("name:" + name + " sex:" + sex + " age:" + age + " height:" + height + " card:" + isCard);
		System.out.println("total: " + (milk+bread+egg) + "원");
		
		String msg = """
				aaaaaaaaaaaaaa
				bbbbbbbbbbbbbb
				cccccccccccccc
				dddddddddddddd
				""";
		System.out.println(msg);
		}
}
