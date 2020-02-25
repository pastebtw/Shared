package example;
import java.io.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LogoLillard {


 static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int scale = Integer.parseInt(br.readLine());
		for (int i = 0; i< scale;i++) {
			System.out.println(Stream.generate(() -> "*").limit(scale).collect(Collectors.joining())+Stream.generate(() -> "x").limit(scale).collect(Collectors.joining())+Stream.generate(() -> "*").limit(scale).collect(Collectors.joining()));
		}
		for (int i = 0; i< scale;i++) {
			System.out.println(Stream.generate(() -> " ").limit(scale).collect(Collectors.joining())+Stream.generate(() -> "x").limit(scale).collect(Collectors.joining())+Stream.generate(() -> "x").limit(scale).collect(Collectors.joining()));
		}
		for (int i = 0; i< scale;i++) {
			System.out.println(Stream.generate(() -> "*").limit(scale).collect(Collectors.joining())+Stream.generate(() -> " ").limit(scale).collect(Collectors.joining())+Stream.generate(() -> "*").limit(scale).collect(Collectors.joining()));
		}
		System.out.println(Stream.generate(()->"x").limit(10).collect(Collectors.joining()) );
	}

}
