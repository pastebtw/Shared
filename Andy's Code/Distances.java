package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distances {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int [][] map = new int [5][5];
		String dis = br.readLine();
		int dist1 = Integer.parseInt(dis.split(" ")[0]);
		int dist2 = Integer.parseInt(dis.split(" ")[1]);
		int dist3 = Integer.parseInt(dis.split(" ")[2]);
		int dist4 = Integer.parseInt(dis.split(" ")[3]);
		int []distances = new int [] {0,dist1, dist2,dist3,dist4} ;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5;c++) {
				int value = 0;
				for (int v = r+1; v<=c;v++) {
					
					value = value + distances[v];
					map [r][c] = value;
					
				}
				//System.out.print(map[r][c]);
				
			}
			//System.out.println("\n");
		}
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5;c++) {
				int value = 0;
				for (int v = r+1; v<=c;v++) {
					
					value = value + distances[v];
					map [c][r] = value;
					
				}
				if (c == 0) {
					System.out.print(map[r][c]);
				}else {
					System.out.print(" "+map[r][c]);
				}
				
				
			}
			if (r == 5) {
				
			}else {
				System.out.println();
			}
			
		}
		
		
	
	}
}
