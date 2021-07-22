package self.study;

import java.util.Random;

/**
 * 
1에서 9까지의 숫자들이 있다.
이 1에서 9까지의 숫자를 무작위로 배열하여
2 3 5 6 7 9 1 4 8 과 같이 1~9의 숫자가 빠짐없이 배열되는 프로그램을 만들고자 한다.
문제 풀이 방법 : 작성한 코드를 제시하고, 이 코드에 따라 나온 다른 배열 5개를 입력한다.
 * 
 * @author Jo MinWoo
 *
 */



public class NumberArray {


    public static void main(String[] args) {
        Random random = new Random();
        int[] arNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        //5개의 배열 출력
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 100; j++) 
            {
                int temp = arNum[0];
                int mixIndex = random.nextInt(9);
                arNum[0] = arNum[mixIndex];
                arNum[mixIndex] = temp;
            }
            
            //출력
            for (int j = 0; j < arNum.length-1; j++) {
                System.out.print(arNum[j]+",");
            }
            System.out.print(arNum[8]+"\n");

        }

    }

}
