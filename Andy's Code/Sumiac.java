package example;
import java.io.*;
public class Sumiac {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt(br.readLine());
		int three = 0;
		boolean end = false;
		int length = 2;
		while (end == false) {
			if (one > two) {
				three = one - two;
				one = two;
				two = three;
				System.out.println(three);
				length ++;
				
			}else {
				end = true;
			}
		}
		System.out.println(length);
	}

}
