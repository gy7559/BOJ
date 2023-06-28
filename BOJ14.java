package BOJ;
import java.util.*;
import java.io.*;
public class BOJ14 {

	public static void main(String[] args)	throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String c = bf.readLine();
		
		
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(c);
		
		
		if(a>0&&b>0) {
			System.out.println("1");
		}else if(a<0&&b>0) {
			System.out.println("2");
		}else if(a<0&&b<0) {
			System.out.println("3");
		}else if(a>0&&b<0) {
			System.out.println("4");
		}
	}

}
