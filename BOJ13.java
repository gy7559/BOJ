package BOJ;
import java.util.*;
import java.io.*;
public class BOJ13 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		
		int n = Integer.parseInt(s);
		int t = 0;
		if(n%4 ==0 && n%100 != 0) {
			t = 1;
			
		}else if(n%400 == 0) {
			t = 1;
		}else {
			
		}
		System.out.println(t);
	}

}
