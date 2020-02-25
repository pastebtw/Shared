package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		String [] day1 = br.readLine().split("");
		String [] day2 = br.readLine().split("");
		//System.out.print(rows +" "+ day1.length +" " + day2.length);
		int total = 0;
		for (int i = 0; i < day1.length; i++) {
			if (day1[i].contentEquals("C")&&day2[i].contentEquals("C")){
				total ++;
				//System.out.println(day1[i] + day2[i]);
			}
		}
		System.out.println(total);
	}

}
