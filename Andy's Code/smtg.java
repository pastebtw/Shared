package example;
import java.io.*;

public class smtg {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int coins = Integer.parseInt(br.readLine());
	int machine1 = Integer.parseInt(br.readLine());
	int machine2 = Integer.parseInt(br.readLine());
	int machine3 = Integer.parseInt(br.readLine());
	int machine = 1;
	while (coins >=1) {
		if (machine == 1) {
			machine1++;
			coins=coins-1;
			if (machine1 == 35) {
				coins=coins+30;
			}
		if (machine == 2) {
			machine2++;
			coins=coins-1;
			if (machine2 == 100) {
				coins=coins+60;
				}
		if (machine == 3) {
			machine3++;
			coins=coins-1;
			if (machine3 ==10) {
				coins=coins+9;
				}
		}
	}

	}

}
	}
}
