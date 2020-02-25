package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Compress {

}BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int line = Integer.parseInt(br .readLine());
String [] words = new String[line];
for (int i = 0; i< line;i++) {
	String []temp = br.readLine().split("");
	String temps = "";
	int count = 0;
	String let= "";
	//System.out.println();
	for(String g : temp) {
		if(let == "") {
			let = g;
			count = 1;
			//System.out.println("ABCDEFG");
		}
		else if (let.equals( g)) {
			count++;
			//System.out.println("HIJKLMNOP");
		}else {
			//System.out.println("QRSTUVWX");
			temps = temps +(count + " "+let+" ");
			let = g;
			count = 1;
			
		}
	}
	temps = temps +(count + " "+ let);
	words[i] = temps;
	
}
for (String q : words) {
	System.out.println(q);
}


