package BOJ;
import java.io.*;
public class BOJ52 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String t = bf.readLine();
		int s = t.length()-1;
		int e = 0;
		for(int i = 0; i<((t.length()/2)+1);i++) {
			if(t.charAt(i)==t.charAt(s-i)) {
				e = 1;
			}else {
				e = 0;
				break;
			}
		}
		
		System.out.print(e);
		
	}

}
