package BOJ;
import java.io.*;
import java.util.*;
public class BOJ26 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String c = bf.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c1 = Integer.parseInt(c);
		String t = "";
		String a= "";
		for(int x = 0; x<c1;x++) {
			for(int z=0;z<c1-x;z++) {
				a = a + " ";
			}
				t = t+"*";
				
				bw.write(a+t+"\n");
				a = "";
			}
		bw.flush();
		bw.close();
		}
		

}
