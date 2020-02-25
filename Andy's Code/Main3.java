package example;
import java.io.*;
import java.util.stream.Stream;

public class Main3 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int days = Integer.parseInt(br.readLine());
		int [][]graph= new int [days][days];
		
		for (int i = 0; i< days; i++) {
			String temp = br.readLine();
			int[] arr = Stream.of(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
			
			graph[i]= arr;
			
		}
		
		long start =System.currentTimeMillis();
		boolean n = true;
		int [] []graph2 = flip(graph);
		int [] []graph3 = flip(graph2);
		int [] []graph4 = flip(graph3);
		
		
		for (int i = 0; i< days; i++) {
			
			int difference = 0;
			
			for (int s = 1; s<days;s++) {
				//System.out.println(i + " " + s);
				if (graph[i][s] - graph[i][s-1]<=0) {
					i = days;
					n = false;
					break;
				}
				if(difference == 0) {
					difference = graph[i][s] - graph[i][s-1];
					//System.out.println(graph[i][s] - graph[i][s-1]);
					
				}else {
					if (difference == graph[i][s] - graph[i][s-1]) {
						
					}else {
						i = days;
						n = false;
						break;
					}
				}
				
				
				
				
			}
		
			}
		boolean nine = true;
		for (int i = 0; i< days; i++) {
			
			int difference = 0;
			
			for (int s = 1; s<days;s++) {
				//System.out.println(i + " " + s);
				if (graph2[i][s]  <graph2[i][s-1]) {
					i = days;
					nine = false;
					break;
				}
				if(difference == 0) {
					difference = graph2[i][s] - graph2[i][s-1];
					//System.out.println(graph2[i][s] - graph2[i][s-1]);
					
				}else {
					if (difference == graph2[i][s] - graph2[i][s-1]) {
						
					}else {
						i = days;
						nine = false;
						break;
					}
				}
				
				
				
				
			}
		
			}
		boolean one = true;
		for (int i = 0; i< days; i++) {
			
			int difference = 0;
			
			for (int s = 1; s<days;s++) {
				//System.out.println(i + " " + s);
				if (graph3[i][s] - graph3[i][s-1]<=0) {
					i = days;
					one = false;
					break;
				}
				if(difference == 0) {
					difference = graph3[i][s] - graph3[i][s-1];
					//System.out.println(graph3[i][s] - graph3[i][s-1]);
					
				}else {
					if (difference == graph3[i][s] - graph3[i][s-1]) {
						
					}else {
						i = days;
						one = false;
						break;
					}
				}
				
				
				
				
			}
		
			}
		boolean two = true;
		for (int i = 0; i< days; i++) {
			
			int difference = 0;
			
			for (int s = 1; s<days;s++) {
				//System.out.println(i + " " + s);
				if (graph4[i][s] - graph4[i][s-1]<=0) {
					i = days;
					two = false;
					break;
				}
				if(difference == 0) {
					difference = graph4[i][s] - graph4[i][s-1];
					//System.out.println(graph4[i][s] - graph4[i][s-1]);
					
				}else {
					if (difference == graph4[i][s] - graph4[i][s-1]) {
						
					}else {
						i = days;
						two = false;
						break;
					}
				}
				
				
				
				
			}
		
			}
		
		System.out.println(n + " "+ nine + " "+one + " "+two);
		print(graph,days);
		print(graph2,days);
		print(graph3,days);
		print(graph4,days);
		int highest = 0;
		int num = 0;
		if (n == true) {
			
			if (highest == 0) {
				highest = graph[days-1][days-1] ;
				num = 1;
			}
			else if (highest < graph[days-1][days-1]){
				highest = graph[days-1][days-1] ;
				num = 1;
			}
		}
		if (nine == true) {
			
			if (highest == 0) {
				highest = graph2[days-1][days-1] ;
				num = 2;
			}
			else if (highest < graph2[days-1][days-1]){
				highest = graph2[days-1][days-1] ;
				num = 2;
			}
		}
		if (one == true) {
			
			if (highest == 0) {
				highest = graph3[days-1][days-1] ;
				num = 3;
			}
			else if (highest < graph3[days-1][days-1]){
				highest = graph3[days-1][days-1] ;
				num = 3;
		}
		}
		if (two == true) {
			
			if (highest == 0) {
				highest = graph4[days-1][days-1] ;
				num = 4;
			}
			else if (ahighest < graph4[days-1][days-1]){
				highest = graph4[days-1][days-1] ;
				num = 4;
		}
		}
		if (num ==1) {
			print(graph,days);
		}
		if (num ==2) {
			print(graph2,days);
		}
		if (num ==3) {
			print(graph3,days);
		}
		if (num ==4) {
			print(graph4,days);
		}
		
		
		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
//		int [][]graph2 = flip(graph);
//		for ( int y = 0; y<days;y++) {
//			for ( int g= 0; g<days;g++) {
//				System.out.print(graph2 [y][g]);
//			}
//			System.out.println();
//		}
		
		
		
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

