package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2 {
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goal = Integer.parseInt(br.readLine());
		int stat = Integer.parseInt(br.readLine());
		int rate = Integer.parseInt(br.readLine());
//		System.out.println(goal);
//		System.out.println(stat);
//		System.out.println(rate);
		int current = stat;
		int total= 0;
		int day = 0;
		while (total<= goal) {
			day++;
			
			stat = stat*rate ;
			total = total +stat;
//			System.out.println(stat);
//			System.out.println(day);
		}
		System.out.println( day);
	}
}
