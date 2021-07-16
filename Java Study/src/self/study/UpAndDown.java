package self.study;

import java.util.Scanner;

public class UpAndDown 
{
    public static void main(String[] args) 
    {
        //사용자 입력
        Scanner sc = new Scanner(System.in);
        //랜덤 두자리숫자
        int com = (int) (Math.random() * 99 + 1);
        int number = 0;
        while (true) 
        {
            System.out.println("숫자를 입력해주세요.");
            int input = sc.nextInt();
            if(com < input) 
            {
                System.out.println("Down");
            } 
            else if(com > input){
                System.out.println("Up");
            } 
            else
            {
                System.out.println(number+1 + "번만에 성공하셨습니다.\n축하합니다.");
                break;
            }
            // 입력횟수에 따른 카운트
            number++;
            System.out.println(number + "번째 시도중입니다.");
        }
        sc.close();
    }
}
