import java.util.Scanner;
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int apple = 5;
		// int eat = 2;
		apple -= 2;
		System.out.println("남은 사과:" + apple);
		*/
		
		/*
		 * 	국어 80
		 * 	영어 90
		 * 	수학 70
		 * ----------평균 구하기
		 */
		/*
		int kor = 80;
		int eng = 90;
		int math = 70;
		System.out.println("평균점수:" + (kor+eng+math)/3);
		*/
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("국어 점수 입력:");
		int kor = sc.nextInt();
		System.out.println("국어:"+kor);
		System.out.print("영어 점수 입력:");
		int eng = sc.nextInt();
		System.out.println("영어:"+eng);
		System.out.print("수학 점수 입력:");
		int math = sc.nextInt();
		*/
		System.out.print("국어 영어 수학 입력(n n n):");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
	}

}
