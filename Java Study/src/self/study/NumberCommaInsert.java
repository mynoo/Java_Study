package self.study;

import java.util.Scanner;

/**
 * 
 * 숫자 형태의 문자열을 콤마가 포함된 금액 표기식 문자열로 바꾸어주는 프로그램을 작성하시오.
 * 즉 세자리 숫자마다 콤마를 붙혀분다.
 * ex) 1000 => 1,000
 *
 */

public class NumberCommaInsert {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in); // 입력 Scanner 정의
    	
    	System.out.println("숫자를 입력하세요>>");
        String num = scan.next();



        if(num.contains(".") && num.length() > 3)// 실수가 나왔을 경우 // 입력받은 숫자가 3자리 이상일 경우
        {
            int index = num.indexOf(".");
            StringBuffer sb = new StringBuffer(num);
            for(int j = index-3; j > 0; j=j-3)
            {
            	sb = sb.insert(j , ",");
            }
            System.out.println(sb.toString());
            }
        else if(num.length() > 3) // 정수형일 경우
        {
        	StringBuffer sb = new StringBuffer(num);
                for(int j = sb.length()-3; j > 0; j=j-3) // 문자열 오른쪽에서부터 왼쪽으로 3번째마다 콤마를 넣어준다.
                {
                    sb.insert(j , ",");
                }
                System.out.println(sb.toString());
            }

        }

    }

