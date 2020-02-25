
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Code {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] val = new int [num+1];
		String [] chaar = new String [num+1];
		for (int i = 0; i<num; i++) {
			String var = br.readLine();
			int times = Integer.parseInt(var.split(" ")[0]);
			String cha = var.split(" ")[1];
			//System.out.print(times + " "+ cha);
			val[i] = times;
			chaar[i] = cha;
		}
		for (int i = 0; i<num; i++) {
			int p = i;
			System.out.println(Stream.generate(() -> chaar[p]).limit(val[p]).collect(Collectors.joining()));
		}
	}

}
