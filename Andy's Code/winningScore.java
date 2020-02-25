package example;
import java.io.*;
public class winningScore {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Aone = Integer.parseInt(br.readLine());
		int Atwo = Integer.parseInt(br.readLine());
		int Athree = Integer.parseInt(br.readLine());
		int Bone = Integer.parseInt(br.readLine());
		int Btwo = Integer.parseInt(br.readLine());
		int Bthree = Integer.parseInt(br.readLine());
		int Atotal = Aone + Atwo*2+Athree*3;
		int Btotal = Bone + Btwo*2 + Bthree*3;
		if (Btotal > Atotal) {
			System.out.println("A");
		}
		if (Atotal > Btotal) {
			System.out.println("B");
		}else {
			System.out.println("T");
		}
	}

}
