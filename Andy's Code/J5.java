package contest;

import java.io.*;

public class J5 {
	public static boolean end = true;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int height = Integer.parseInt (br.readLine());
		int width = Integer.parseInt (br.readLine());
		int [][] map = new int [height+1] [width+1];
		for (int i = 1; i<=height;i++) {
			String [] val = br.readLine().split(" ");
			for (int s = 1; s<=width; s++) {
				map [i] [s] = Integer.parseInt(val[s-1]);
				
			}
		}
		long startTime = System.nanoTime();
		boolean [] []visited = new boolean [height+1][width+1];
		visited[1][1] = true;
		jump (0,0,map[1][1],visited, height, width, map);
		
		if(end == true) {
			System.out.println("no");
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
//		for (int i = 0; i<height;i++) {
//			
//			for (int s = 0; s<width; s++) {
//				System.out.print(map[i][s]);
//				
//			}
//			System.out.println();
//		}
		
	}
	public static void jump (int x, int y, int val, boolean [][] visited , int height, int width, int [][] map) {
		if(end == false ) {
			
		}
		else if(x == width  && y == height) {
			System.out.println("yes");
			end = false;
		}else {
			
			
			for (int i = 1; i<= width+height; i++) { // when i = the width
				
				int test = val%i;
				if(test == 0) {
					int d = val/i;
					if(d <= height &&i <= width) {
						if(visited[d][i] == false ) {
							visited[d][i] = true;
							
//							System.out.println("x: "+i + "y: " + d + "val: " + map [d] [i]);
							jump(i, d, map[d][i], visited, height, width, map );
						}
					}
					else if ( d<= width && i <= height) {
						if(visited[i][d] == false ) {
							visited[i][d] = true;
							
//							System.out.println("x: "+i + "y: " + d + "val: " + map [d] [i]);
							jump(d, i, map[i][d], visited, height, width, map );
						}
					}
				}

			}
			
	}
	}
}
