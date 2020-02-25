package example;
import java.io.*;

public class RuleOfThree {
	public static boolean over = false;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		String three = br.readLine();
		String rule1 = one.split(" ")[0];
		String result1 = one.split(" ")[1];
		String rule2 = two.split(" ")[0];
		String result2 = two.split(" ")[1];
		String rule3 = three.split(" ")[0];
		String result3 = three.split(" ")[1];
		String [] rules = new String [] {rule1, rule2, rule3};
		String [] results = new String [] {result1, result2, result3};
		String inp = br.readLine();
		int moves = Integer.parseInt(inp.split(" ")[0]);
		String start = inp.split(" ")[1];
		String end = inp.split(" ")[2];
		int [] rule = new int [moves+1];
		int [] index = new int [moves+1];
		String [] result = new String [moves+1];
		run (rules, results, start, moves, end,rule, index, result );
		
		
		/*
		 * System.out.println(rule1 + result1); System.out.println(rule2 + result2);
		 * System.out.println(rule3 + result3);
		 */
		

	}
	public static void run (String [] rules, String []results, String str, int moves, String end, int []rule, int []index, String [] result) {
//		boolean rule = false;
		if (over == true) {
			
		}
		else if(moves == 0) {
			
		}
		else {
			for (int i = 0; i<3; i++) {
				
				if (str.contains(rules[i])) {
					long count = str.split(rules[i], -1).length-1;
					System.out.println("1. " + str.contains(rules[i]));
					int ind=str.indexOf(rule[i]);
					str = str.replaceFirst(rules[i], results[i]);
					System.out.println(rules[i] + " " + str + " " + moves);
					for (int q = 0; q<count; q++) {
						
					}
					if (end.contentEquals(str)){
						for(int s = 1; s <=rule.length; s++) {
							System.out.println(rule[s] + " " + index[s] + " " + result[s]);
						}
						break;
					}else {
						rule[moves] = i+1;
						index[moves] = ind;
						result[moves] = str;
						run(rules, results, str, moves-1, end, rule, index,result);
					}
					
				}
		}
		
		}
	}
}
