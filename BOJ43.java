package BOJ;

import java.io.*;
import java.util.*;

public class BOJ43 {

	public static void main(String[] args)throws IOException {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		String a = in.next();
		in.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);
	}
	

}
