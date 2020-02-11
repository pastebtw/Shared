package example;
import java.io.*;
import java.util.stream.Stream;

	public class Baseball {
		public static void main (String []args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int games = Integer.parseInt(br.readLine());
		String temp = br.readLine();
		int [] team1 = Stream.of(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
		String temp2 = br.readLine();
		int [] team2 = Stream.of(temp2.split(" ")).mapToInt(Integer::parseInt).toArray();
		int total1 =0;
		int total2 =0;
		int highest = 0;
		for (int i = 0; i<games; i++) {
			total1 = total1 + team1[i];
			total2 = total2 + team2[i];
		
			if(total2 == total1) {
				highest = i+1;
		}
	}
		System.out.println(highest);
	}
}
