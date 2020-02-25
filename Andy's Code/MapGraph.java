package example;
import java.io.*;

import java.util.*;
public class MapGraph {
	public static HashMap<String, LinkedList<String>> map = new HashMap<>();
	static boolean end = false;
	public static int disRoad;
	public static void main (String[]args) throws IOException{
		graph();
		
	}
	
	public static void graph () throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (end == false) {
			String [] s = br.readLine().split("");
			if (s[0].contains("*")) {
				end = true;
			}else {
				String a = s[0];
				String b = s[1];
				if (map.containsKey(a) == true) {
					map.get(a).add(b);
				}
				if (map.containsKey(a)!= true) {
					LinkedList<String> temp = new LinkedList<>();
					temp.add(b);
					map.put(a, temp);
				}
			}
		}
		//System.out.println(map.get("A"));
		solve(map);
	}
	public static void solve (HashMap <String, LinkedList<String>>map) {
		Queue <String> cut = new LinkedList<>();
		cut.addAll(map.keySet()); //creates a queue of all the points to try and cut
		for (String c : cut) { //creates a DFS for all the nodes 
			HashMap <String, LinkedList<String>> temp = map;
			for (String l:temp.get(c)) {
				HashMap <String, LinkedList<String>> temp2 = map; //creates new map to edit as temp for DFS
				temp2.get(l).remove(c);
				DFS(temp2, l+c);
				//removes the road that we are testing to see if it disconnects A and B
			}
			
			//runs DFS to see if we can still access B
			
		}
		
	}
	public static void DFS (HashMap<String, LinkedList<String>> nmap, String disroad ) {
		HashMap<String, Integer> visited = new HashMap<>(); 
		LinkedList<String> queue= new LinkedList<String>();
		for(String l : nmap.keySet()) {
			visited.put(l, 0);
		}
		visited.replace("A", 1);
		queue.add("A");
		
		while (queue.size() != 0) 
		{
			String p = queue.poll();
			Iterator <String> i = nmap.get(p).listIterator();
			while (i.hasNext()) {
				String t = i.next();
				if (visited.get(t).equals(1) ) {
					visited.put(t, 1);
					queue.add(t);
				}
			
		}
		
		
	}if(visited.get("B").equals(0)) {
		System.out.println(disroad);
	}
	
	
	}
}

