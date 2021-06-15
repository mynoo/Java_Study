package self.study;

import java.util.Scanner;

/*
 * 문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라
 * 
 */
public class NumericCharacters 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // 입력 함수
		
		System.out.println("숫자와 문자를 입력하세요>");
        String input = scan.nextLine();
        StringBuffer str = new StringBuffer(); // 문자를 저장하기 위한 변수
        StringBuffer integer = new StringBuffer();// 숫자를 저장하기 위한 변수
       
        for(int i=0; i<input.length(); i++) 
        {
            if((64<input.charAt(i)&&input.charAt(i)<91)||(96<input.charAt(i)&&input.charAt(i)<123)||input.charAt(i)==32) 
            	//알파벳 소문자/대문자/스페이스바에 해당하는 아스키코드
            {
                str.append(input.charAt(i));
            }
            if(47<input.charAt(i)&&input.charAt(i)<58) { // 48~57의 아스키코드는 숫자
                integer.append(input.charAt(i));
            }
        }
        System.out.println("입력받은 문자는 : " + str + "입니다");
        System.out.println("입력받은 숫자는 : " + integer + "입니다");
	}
}
