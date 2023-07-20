package BOJ;
import java.io.*;
import java.util.*;
public class BOJ39 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
		String s = bf.readLine();
		
		String n = bf.readLine();
		int n1 = Integer.parseInt(n);
		
		char t = s.charAt(n1-1);
		
		System.out.println(t);
	}

}
