package self.study;

/**
 * 사용자가 입력한 양의정수(범위는 int)각 자리수를 더해 출력하는 프로그램을 만들고 싶어한다. 
 * ex) 5923의 결과는 5+9+2+3인 19이다 ex) 200의 결과는 2+0+0인 2이다 ex) 6719283의 결과는 6+7+1+9+2+8+3인 36이다.
 * 
 */


import java.util.Scanner;

public class number_sum {
	public static void main(String args[]) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 >");
        int number = scan.nextInt();

        String aaa = String.valueOf(number);

        int aaaLength = aaa.length();
        int total =0;

        for(int i=0; i<aaaLength; i++){
            total += Integer.parseInt(aaa.substring(i, i+1));

        }
        System.out.print(total);
    }
}
