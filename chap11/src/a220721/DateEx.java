package a220721;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		String str = now.toString();
		System.out.println(str);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String str1 = sdf.format(now);
		System.out.println(str1);
	}
}
