
package example;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		int radar = Integer.parseInt(br.readLine());
		int [] frequencys = new int [2000000];
		for (int i = 0; i<radar;i++) {
			int level = Integer.parseInt(br.readLine());
			frequencys[level] = frequencys[level] + 1;
		}
		// index is the radiation value and the value is the frequency
		Set <Integer>mf = new HashSet <>();
		
		Set <Integer>smf = new HashSet <>();
		
		
		int smfi=0;
		int mfi = 0;
		int mfv = 0;
		int smfv = 0;
		for(int i = 0; i <2000000; i++) {
//			System.out.println("1 " + mf);
//			System.out.println("2 "+smf);
//			System.out.println("f "+frequencys[i]);
			if(frequencys[i] == 0) {
				continue;
			}
			if(frequencys[i] >mfv) {
				//shift 1st to second 
//				System.out.println("<"+ frequencys[i] + ">");
				smfv = mfv;
				smf.addAll(mf) ;
				
				
				// new to 1st
				mfi = i;
				mfv = frequencys[i];
				mf.clear();
				mf.add(i);
			}
			else if(frequencys[i] == mfv) {
//				System.out.println("L");
				mf.add(i);
			}
			else if(frequencys[i] > smfv ) {
//				System.out.println("M");
				smfv = frequencys[i];
				smfi = i;
				smf.clear();;
				smf.add(i) ;
			}
			else if(frequencys[i] == smfv) {
//				System.out.println("O");
				smf.add(i) ;
			}
		}
//		System.out.println(mf);
//		System.out.println(smf);
//		System.out.println(mfi);
//		System.out.println(smfi);
//		System.out.println(Math.abs((mfi - smfi)));
//		System.out.println(mf.size());
//		System.out.println(smf.size());
		if (mf.size ()> 1) {
//			System.out.println("LOL");
			most(mf);
		}
		else if (mf.size() == 1 && smf.size() == 1) {
//			System.out.println("LO");
			int most = 0;
			int second = 0;
			for (int i: mf) {
				most = i;
			}
			for (int i : smf) {
				second = i;
			}
//			System.out.println(most);
//			System.out.println(second);
			System.out.println( Math.abs(most - second));
					
		}else {
//			System.out.println("LOLOOOOOO");
			int most1 = 0;
			for (int i: mf) {
				most1 = i;
			}
			int highestdif = 0;
			for (int s : smf) {
				if (Math.abs(most1 - s) > highestdif) {
					highestdif = Math.abs(most1-s);
				}else {
					
				}
			}
			System.out.println(highestdif);
		}
		}
		
		
		
	
	public static void print (int [] ar) {
		System.out.println();
		for (int i : ar) {
			System.out.print(i);
		}
	}
	public static void most (Set <Integer> mf) {
		int highestM = 0;
		int smallestM = 1000;
		for (int s : mf) {
			if(s> highestM) {
				highestM = s;
				
			}
			if (s < smallestM){
				smallestM = s;
			}else {
				
			}
		}
//		System.out.println(smallestM + " " + highestM);
		System.out.println(Math.abs(highestM - smallestM));
	}
	
}
