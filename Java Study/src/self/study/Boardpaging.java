package self.study;

import java.util.Scanner;

//입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//출력 : 총페이지수

public class Boardpaging {
	public static void main(String[] args) {
		
		int totalpage = 0; // 총 페이지수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총 건수를 입력하세요>>");
		int m = scan.nextInt();
		
		System.out.println("한페이지에 보여줄 게시물수를 입력하세요>>");
		int n = scan.nextInt();
		
		scan.close();
		totalpage = m / n; // 총 페이지 수 계산
		
		
		if(m % n != 0) // 건수가 남으면 한페이지 더 추가한다.
		{
			totalpage += 1;
		}
		
		System.out.println("총 페이지수는 : " + totalpage + "페이지입니다.");
	}
}
