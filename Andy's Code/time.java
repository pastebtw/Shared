package example;
import java.lang.Math;
import java.io.*;
public class time {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Otime = Integer.parseInt(br.readLine());
		System.out.println(Otime + " in Ottawa");
		System.out.println(timechange(-180,Otime) + " in Victoria");
		System.out.println(timechange(-120,Otime)+ " in Edmonton");
		System.out.println(timechange(-60,Otime)+ " in Winnipeg");
		System.out.println(timechange(0,Otime)+ " in Toronto");
		System.out.println(timechange(60,Otime)+ " in Halifax");
		System.out.println(timechange(90,Otime)+ " in St. John's");
	}
	public static int timechange(int change, int time) {
		
		int nTime = time + (change/60)*100 + change%60;
		
		if (nTime > 2359) {
			nTime = nTime - 2400;
		}
		else if (nTime < 0) {
			nTime = Math.abs(nTime);
		}
		return nTime;
		
	}

}
