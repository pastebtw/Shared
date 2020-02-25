package example;
import java.io.*;
import java.math.*;
import java.text.*;
public class cacti {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt (br.readLine());
		DecimalFormat format = new DecimalFormat("##.00");
		String area =format.format(((one * two)/4));
		
		
		
		System.out.println(area);
		
	}

}
