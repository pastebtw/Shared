package example;
import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Main2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int days = Integer.parseInt(br.readLine());
		int [][]graph= new int [days][days];
		
		for (int i = 0; i< days; i++) {
			String temp = br.readLine();
			int[] arr = Stream.of(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
			
			graph[i]= arr;
			
		}
		ArrayList<int [][]> list = new ArrayList<int[][]>(5);
		boolean [] correct = new boolean [] {true,true,true,true};
		int [][] graph2 = flip(graph);
		int [][] graph3 = flip(graph2);
		int [][] graph4 = flip(graph3);
		list.add(graph);
		list.add(graph2);
		list.add(graph3);
		list.add(graph4);
		for (int rot = 0; rot<4;rot++) {
			for (int i = 0; i< days; i++) {
				
				
				
				for (int s = 1; s<days;s++) {
					//System.out.println(i + " " + s);
					if (list.get(rot)[i][s]> list.get(rot)[i][s-1]) {
						
					}else {
						correct[rot]= false;
						i = days;
						break;
					}
					
					
					
					
				}
			
				}
		}
		int highest = 0;
		int index = -1;
		for (int i = 0; i< 4; i++) {
			if (correct[i] == true) {
				if(highest == 0) {
					highest = list.get(i)[days-1][days-1];
					index = i;
				}else {
					if (highest <list.get(i)[days-1][days-1] ) {
						highest = list.get(i)[days-1][days-1];
						index = i;
					}
				}
			}
		}
		print(list.get(index),days);
		
	}
	static int[][] flip(int[][] mat) {
	    final int M = mat.length;
	    final int N = mat[0].length;
	    int[][] ret = new int[N][M];
	    for (int r = 0; r < M; r++) {
	        for (int c = 0; c < N; c++) {
	            ret[c][M-1-r] = mat[r][c];
	        }
	    }
	    return ret;
	}
	static void print (int [][] map, int days) {
		for ( int y = 0; y<days;y++) {
			for ( int g= 0; g<days;g++) {
				System.out.print(map [y][g]+" ");
			}
			System.out.println();
		}
	}

}