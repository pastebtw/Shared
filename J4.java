package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4 {
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		String word = br.readLine();
		String [] letters = word.split("");
		String [] shifts = new String [word.length()];
		String latest = null;
		for (int i = 0; i< word.length();i++) {
			if(latest == null) {
				String first = word.substring(0,1);
				String test = word.substring(1);
				shifts[i] = test + first;
				latest = test + first;
			}else {
				String f = latest.substring(0,1);
				String t = latest.substring(1);
				shifts[i] = t + f;
				latest = t + f;
			}
		}
//		for (int i = 0; i< shifts.length; i++) {
//			System.out.println(shifts[i]);
//		}
		boolean no = true;
		for(int i = 0; i< shifts.length; i++) {
			if(text.contains(shifts[i]) == true) {
				System.out.println("yes");
				no = false;
				
				break;
			}else {
				
			}
		}
		if(no == true) {
			System.out.println("no");
		}
	}
}
