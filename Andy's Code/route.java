package example;
import java.util.*;
import java.io.*;
public class route {
	public static void main(String[]args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> direction = new Stack<String>();
		Stack <String> location = new Stack<String>();
		location.push("home");
		String curd;
		boolean end = false;
		boolean word = false;
		while(end == false){
			String line = br.readLine();
			if (line=="SCHOOL") {
				end = false;
			}
			else if (word == false) {
				
				if (line.equals("L")) {
					direction.push("RIGHT");
					word = true;
				}
				else if (line.equals("R")) {
					direction.push("LEFT");
				}
			else if (word == true) {
				location.push(line);
				word = false;
			}
			}
			
		}
		while (direction.isEmpty()==false && location.isEmpty()==false) {
			System.out.println("Turn " + direction.pop() + " onto " + location.pop()+"street.");
			
			
		}
	}
}
