package self.study;
/* 
 * 
 * <구글 입사 문제>
 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
   8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
   (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
 * 
 * 
 */


public class Count8 
{
	public static void main(String[] args) 
	{
		
		int count = 0; // 카운터 변수
		String eigth = "";
		
		
		for(int i = 0; i<=10000; i++)
		{
			eigth = eigth.concat(String.valueOf(i)); // 각 숫자들을 문자로 변환하여 일렬로 나열
		}
		
		for(int j=0; j< eigth.length(); j++) // 문자 길이만큼 반복
		{
			if(eigth.charAt(j) == '8') // 문자 하나씩 검사하여 8이면 카운터
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
