package example;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fifty {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean end = false;
        
        Long cur ;
        Queue <Long> q = new LinkedList<>();

        while(end != true){
          cur = Long.parseLong(br.readLine());
          if (cur > 50){
            q.add((long) 1);
          }
          if (cur < 50){
           q.add((long) 0);
            
          }
          if (cur == 50){
            end = true;
            while (!q.isEmpty()) {
            	System.out.println(q.poll());
            }
          }
          
        }
        

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

}

