package example;
import java.io.*;

public class smile {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numofad = Integer.parseInt(br.readLine());
		int numofn = Integer.parseInt(br.readLine());
		String [] ad = new String [numofad];
		String [] n=  new String[numofn];
		for(int c = 0; numofad>c;c++) {
			ad[c] = br.readLine();
			//System.out.println(ad[c]);
			}
		
		for (int i = 0; numofn>i; i++) {
			n[i] = br.readLine();
			//System.out.println(n[i]);
		}
		
		for (String s: ad) {
			for(String l: n) {
				System.out.println(s+" as "+ l);
			}
		}
	}
}
