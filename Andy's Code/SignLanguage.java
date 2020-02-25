package example;
import java.io.*;

public class SignLanguage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String word = br.readLine();
		char [] temp = word.toCharArray();
		int tem = 'a';
		String bintem;
		char []bintemp;
		
		for (int s : temp) {
			tem = s;
			int norh=0;
			bintem= Integer.toBinaryString(tem-96);
			bintemp = bintem.toCharArray();
			
			for (int i: bintemp) {
				if (i=='1') {
					norh++;
				}
				else {
					continue;
				}
			}
			System.out.println(norh); 
		}		
	}
}
