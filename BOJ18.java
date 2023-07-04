package BOJ;
import java.io.*;
import java.util.*;
public class BOJ18 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String r = bf.readLine();
		int t = Integer.parseInt(r);
		
		for(int a = 1; a<10;a++) {
			System.out.println(t+" * "+a+" = "+t*a);
		}
	}

}
