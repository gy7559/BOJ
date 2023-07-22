package BOJ;
import java.io.*;
import java.util.*;
public class BOJ49 {
//그대로 출력
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String t;
		while((t=bf.readLine())!=null) {
			 sb.append(t).append("\n");
		}
		
		System.out.println(sb);
	}

}
