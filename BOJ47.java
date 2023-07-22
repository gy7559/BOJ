package BOJ;
import java.util.*;
import java.io.*;
public class BOJ47 {
//상수
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				
		String nm = bf.readLine();
		
		String[] nm1 = nm.split(" ");
		String t ="";
		for(int i = 2;i>-1;i--) {
			char n = nm1[0].charAt(i);
			char m = nm1[1].charAt(i); 
			int n1 = n-'0';
			int m1 = m-'0';
			
			if(n1>m1) {
				t=nm1[0];
				break;
			}else if(n1==m1) {
				continue;
			}else {
				t=nm1[1];
				break;
			}
		}
		
		for(int i=2;i>-1;i--) {
			System.out.print(t.charAt(i));
		}
		
		
		
		
	}
}

