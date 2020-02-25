package example;
import java.io.*;
public class DealNoDeal {
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] money = new int [] {0,100,500,1000, 5000, 10000, 25000,50000, 100000,500000,1000000};
		int total = 100+500+1000+ 5000+ 10000+ 25000+50000+ 100000+500000+1000000;
		int remove = Integer.parseInt(br.readLine());
		
		for (int i = 0; i <remove; i++) {
			
			total = total - money[Integer.parseInt(br.readLine())];
		}
		int average = total/ (10-remove);
		int deal = Integer.parseInt(br.readLine());
		
		if (deal > average) {
			System.out.println("deal");
		}else {
			System.out.println("no deal");
		}
		
	}
}
