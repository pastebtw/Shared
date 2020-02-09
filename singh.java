package example;

import java.io.*;
import java.util.*;


public class singh{
  public static void main(String[] args) throws IOException{
    String late = null;
    int time = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testcase = Integer.parseInt(br.readLine());
    Queue<Integer> q = new LinkedList<>();    
    String [] priority = new String [100005];
    for (int i = 0; i<testcase; i++){
      String []temp = br.readLine().split(" ");
      priority [Integer.parseInt(temp[0])] = temp[2];
      q.add(Integer.parseInt(temp[1]));
      
    }
    for (String s:priority){
      if(s!=null){
        late = s;
      }else{
        continue;
      }
    }
    System.out.println(late.substring(1, late.length()-1));
    while (q.isEmpty()!=true){
      time=time+q.poll();
    }
    int tominutes=time*3;
    if (tominutes >= 1440) {
    	tominutes = tominutes%1440;
    }
    int hours = tominutes/60;
    int minutes = (tominutes%60);
    if (hours < 10) {
    	System.out.print(0);
    	System.out.print(hours);
    	
    }else{
    	System.out.print(hours);
    }
    if (minutes == 0) {
		System.out.print("00");
	}
    else if (minutes <10) {
		System.out.print(0);
		System.out.print(minutes);
	}else {
		System.out.print(minutes);
	}
    
    
  }
}
