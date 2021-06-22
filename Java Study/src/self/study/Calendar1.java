package self.study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Calendar1
{
	// 현재 날짜를 반환
	public static void main2(String[] args) 
	{
		Date today = new Date();
		System.out.println(today);
	}
	
	
	
	// 경과 시간 계산
	public static void main3(String[] args) 
	{
		long  time1  =  System.currentTimeMillis  ();

		long  time2  =  System.currentTimeMillis  ();

		System.out.println  (  (  time2  -  time1  )  /  1000.0  ); // 1000은 1초를 의미
	}
	
	
	
	
	// 한국 현재 시간을 SimpleDateFormat의 지정한 형식으로 출력
	public static void main4(String[] args)
	{
		SimpleDateFormat  formatter  =  new  SimpleDateFormat  (  "yyyy.MM.dd  HH:mm:ss",  Locale.KOREA  );

		Date  currentTime  =  new  Date  (  );

		String  dTime  =  formatter.format  (currentTime);

		System.out.println  (  formatter  );
	}
	
	
	
	
	// GregorianCalendar클래스를 이용하여 날짜 출력
	public static void main(String[] args) {
		GregorianCalendar  today  =  new  GregorianCalendar  (  );

		  

		int  year  =  today.get  (  today.YEAR  ); //  년

		int  month  =  today.get  (  today.MONTH  )  +  1; // 월 , 0부터 시작하기 때문에 +1

		int  yoil  =  today.get  (  today.DAY_OF_MONTH  ); // 일

		  
		System.out.println(year);
		System.out.println(month);
		System.out.println(yoil);
		



	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
