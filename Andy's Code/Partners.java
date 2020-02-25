package example;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Partners {
	public static void main (String []args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean good = true;
		int num = Integer.parseInt(br.readLine());
		String [] p1 = br.readLine().split(" ");
		String [] p2 = br.readLine().split(" ");
		
		HashSet <String> list = new HashSet<>();
		HashMap <String,String> map = new HashMap <>();
		for (String i : p2) {
			list.add(i);
		}
		for (int i = 0; i < p1.length; i++) {
			if(p2[i] == map.get(p1[i])||p2[i] == map.containsKey(p1[i])) {
				continue;
			}
			
		}
		if (good == true) {
			System.out.println("Good");
		}
	}
}
