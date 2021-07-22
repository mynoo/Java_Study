package self.study;

import java.util.Scanner;

/*
피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
예) 0, 1, 1, 2, 3, 5, 8, 13
인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
 */


public class Fibonacci 
{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>>");
        int count = scan.nextInt();
        
        for(int i=0; i<count; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n)
    {
        if(n <= 1)
        {
            return n;
        }else
        {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
	
		
	}

