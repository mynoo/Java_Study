package self.study;

import java.util.Scanner;

/**
 * 
 * [60, 60, 60] = 예각삼각형
	[30, 60, 90] = 직각삼각형
	[20, 40, 120] = 둔각삼각형
	[0, 90, 90] = 삼각형이 아니다
	[60, 70, 80] = 삼각형이 아니다
	[40, 40, 50, 50] = 삼각형이 아니다
 * 
 *
 */



public class Tryangle 
{
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 각을 입력해주세요.");
        int a = scan.nextInt();
        System.out.println("두번째 각을 입력해주세요.");
        int b = scan.nextInt();
        System.out.println("세번째 각을 입력해주세요.");
        int c = scan.nextInt();
        String result = "";
        if (a+b+c == 180 && a!=0 && b!=0 && c!=0) {     // 삼각형이 맞을 때            
            if (a<90 || b<90 || c<90) {     // 예각 삼각형인가?
                result = "예각 삼각형입니다.";
            }
            if (a==60 && b==60 && c==60) {      // 정삼각형일 떄
                result = "정삼각형입니다.";
            }
            if (a==90 || b==90 || c==90) {      // 직각 삼각형인가?
                result = "직각 삼각형입니다.";
            }   
            if (a>90 || b>90 || c>90) {     // 둔각 삼각형인가?
                result = "둔각 삼각형입니다.";
            }               
        } else {        // 삼각형이 아닐 때
            result = "삼각형이 아닙니다.";
        }
        System.out.println(result);
        scan.close();
    }
}
