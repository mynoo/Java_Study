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
		
		int count = 0;
		String eigth = "";
		
		
		for(int i = 0; i<=10000; i++)
		{
			eigth = eigth.concat(String.valueOf(i));
		}
		
		for(int j=0; j< eigth.length(); j++)
		{
			if(eigth.charAt(j) == '8')
			{
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
		
	}
}
