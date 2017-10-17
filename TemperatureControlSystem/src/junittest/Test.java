package junittest;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Test {
	public static void main(String[]  args){
		Date date  = new Date(System.currentTimeMillis());
		System.out.println("date-->"+ date);
		Time time = new Time(System.currentTimeMillis());
		System.out.println("time-->"+time);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
	}
}
