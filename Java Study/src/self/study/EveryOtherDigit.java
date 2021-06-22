package self.study;

/**
 * 모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.)
 * Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
 * 
 *
 */

public class EveryOtherDigit {

	public static void main(String[] args) 
	{
		String str = "a1b2cde3~g45hi6";
		StringBuffer buf = new StringBuffer();
		for(int i =0; i<str.length();i++)
		{
			if(i==0 || i%2==1) // 짝수번째 검사
			{
				if(str.charAt(i)>=48 && str.charAt(i)<=57)
				{
					char a = str.charAt(i);
					a = '*';
					buf.append(a);
				}
				else
				{
					buf.append(str.charAt(i));
				}
			}
			else // 짝수번째가 아니면 그냥 추가
			{
				buf.append(str.charAt(i));
			}
		}
		
		System.out.println(buf);

	}

}
