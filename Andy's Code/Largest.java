package example;
import java.io.*;
public class Largest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt(br.readLine());
		int three = Integer.parseInt(br.readLine());
		int four = Integer.parseInt(br.readLine());
		int [] num = new int [] {one, two , three, four};
		int max = 0;
		int min =101;
		for (int i : num) {
			if(i> max) {
				max =i;
			}
			if(i<min) {
				min = i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
