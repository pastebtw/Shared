package example;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p1 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i<cases; i++) {
            String [] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            int c = Integer.parseInt(temp[2]);
            
            solve(a,b,c);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static void solve (int a, int b, int c) {
        if (a<=-1) {
            System.out.println(400/(b*c));
        }
        if (b<=-1) {
            System.out.println(400/(a*c));
        }
        if (c<=-1) {
            System.out.println(400/(b*a));
        }
    }
}
	

