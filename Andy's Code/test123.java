package example;
import java.io.*;
public class test123 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int riverLength = Integer.parseInt(br.readLine());
		int [] river = new int [riverLength];
		int animals = Integer.parseInt(br.readLine());
		for (int i = 0; i < animals; i++) {
			String [] lengths = br.readLine().split(" ");
			for (int s = Integer.parseInt(lengths[0]); s < Integer.parseInt(lengths[1]) ; s++ ) {
				river[s] = -1;
			}
			
		}
		
		int streak = 0;
		int highest = 0;
		for(int i = 0; i < riverLength; i++) {
			if (river[i]== -1) {
				if (streak >highest ) {
					highest = streak;
					streak = 0;
				}else {
					streak = 0;
				}
				
			}else {
				streak++;
				
			}
		}
		if (streak > highest) {
			highest = streak;
			
		}
		System.out.println(highest);
			}



}
