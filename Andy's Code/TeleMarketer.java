package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeleMarketer {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt(br.readLine());
		int three = Integer.parseInt(br.readLine());
		int four =Integer.parseInt(br.readLine());
		//System.out.println(one + " " + two + " " + three + " "+ four) ;
		if (one == 8|| one==9 ){
			if (two == three) {
				if(four == 9 || four == 8){
					System.out.println("ignore");
				}else {
					System.out.println("answer");
				}
			}else {
				System.out.println("answer");
			}
		}
		else {
			System.out.println("answer");
		}
			
		
	
	}
}
