package BOJ;
import java.io.*;

public class BOJ27 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String t="";
		int a=0;
		int b=0;
		while(true) {
			t = bf.readLine();
			
			String[] t1 = t.split(" ");
			a = Integer.parseInt(t1[0]);
			b =	Integer.parseInt(t1[1]);
			int c = a+b;
			if(c==0) {
				break;
			}
			bw.write(c+"\n");
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
