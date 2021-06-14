package self.study;

import java.util.Scanner;


//입력받은 5개의 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.


public class OddEvenCount 
{
	public static void main(String[] args) 
	{
		 int[] names = new int[5]; // 5개의 숫자 저장

         int size = names.length;
		Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++)  // 5번 입력
        {
        	System.out.print("숫자를 입력해주세요. ");
        	names[i] = scan.nextInt();  // 입력받은 숫자 배열 저장
        }
        
        for (int i = 0; i < size; i++) 
        {
            if (names[i] % 2 == 0) {
            	even++;
            }
            else 
            {
            	odd++;
            }
        }
        
        
        System.out.println("짝수 : " + even + " 개" + "\n" + "홀수 : " + odd + " 개");
    }
}
