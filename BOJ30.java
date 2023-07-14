package BOJ;
import java.io.*;


public class BOJ30 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int l = 0;
		String nx = bf.readLine();
		String[] nx1 = nx.split(" ");
		
		int n = Integer.parseInt(nx1[0]);
		int x = Integer.parseInt(nx1[1]);
		
		String all = bf.readLine();
		String[] all1= all.split(" ");
		
		int[] w = new int[all1.length];
		for(int i = 0; i<all1.length;i++) {
			int s = Integer.parseInt(all1[i]);
			if(s<x) {
				w[l] = s;
				l=l+1;
			}
		}
		for(int t = 0; t<w.length;t++) {
			if(w[t+1]==0) {
			System.out.print(w[t]);
			break;
			}else if(w[t]>0){
               System.out.print(w[t]+" "); 
            }
		}
		
	}

}
