package self.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
	{이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌}
1.김씨와 이씨는 각각 몇 명 인가요?
2."이재영"이란 이름이 몇 번 반복되나요?
3.중복을 제거한 이름을 출력하세요.
4.중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 *
 */

public class HumanName 
{
	public static void main(String[] args)
	{
		String[] name = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완",
						"최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
		
		ArrayList<String> lists = new ArrayList<>();
		
		int count = 0;
		int count2 = 0;
		
		for(int i = 0; i< name.length; i++)
		{
			if(name[i].startsWith("김") == true || name[i].startsWith("이") == true)
			{
				count++;
			}
			
			if(name[i] == "이재영")
			{
				count2++;
			}
		}
		
		for(String data : name) // 중복을 제거하기위한 for문
		{
			if(!(lists.contains(data))) // 중복이 없으면 lists에 데이터 추가
			{
				lists.add(data);
			}
		}
		
		Arrays.sort(name); // 문자 배열을 오름차순으로 정렬
//		Arrays.sort(name, Collections.reverseOrder()); // 내림차순 정령

		
		System.out.println("김씨나 이씨의 사람 수는 :" + count);
		System.out.println("이재영 이름의 수는 : " + count2);
		System.out.println("중복을 제거한 이름들 > " + lists);
		System.out.println("중복을 제거한 이름 오름차순 > " + Arrays.toString(name));
	}
}
