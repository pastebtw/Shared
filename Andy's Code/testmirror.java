package example;

import java.io.*;

public class testmirror {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());

		int [] [] room = new int [width+1] [length+1];
    //System.out.print(room);
		for (int i = 0; i<length; i++){
			String [] temp = Integer.toBinaryString(Integer.parseInt(br.readLine())).split("");
			//System.out.println(temp.length);
			for (int s = 0; s<width; s++){
				if (s<temp.length) {
					room[s][i] = Integer.parseInt(temp[s]);
				}
				else if (i == length-1 && s== width -1) {
					room [s][i] = 1;
				}
				else {
					room[s][i]= 0;
				}
			
				//System.out.print(temp[s]);
      }
			//System.out.println(" - "+i);
    }
		for (int i = 0; i<length; i++) {
			System.out.print("\n");
			for (int s= 0; s<width; s++) {
				System.out.print(room[s][i]);
			}
		}
	}

}
