package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3 {
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int point = Integer.parseInt(br.readLine());
		int hy = -1;
		int hx = -1;
		int ly = 101;
		int lx = 101;
		
		for (int i = 0; i< point; i++) {
			String cor = br.readLine();
			int y = Integer.parseInt(cor.split(",")[1]);
			int x = Integer.parseInt(cor.split(",")[0]);
			if(y> hy) {
				hy = y;
			}
			if (x > hx) {
				hx = x;
				
			}
			if(y<ly) {
				ly = y;
			}
			if(x<lx) {
				lx = x;
			}
		}
		hy = hy+1;
		hx = hx+1;
		ly = ly-1;
		lx = lx-1;
				
		System.out.println(lx + "," + ly);
		System.out.println(hx + "," + hy);
	}
}
