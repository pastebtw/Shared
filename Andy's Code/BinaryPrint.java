package example;
import java.io.*;
public class BinaryPrint {
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		for (int i = 0; i<cases; i++) {
			int num =  Integer.parseInt(br.readLine());
			int binnum = Integer.parseInt(Integer.toBinaryString(num));
			System.out.println(binnum);
		}
		
		
	}
}
