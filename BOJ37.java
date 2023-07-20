package BOJ;
import java.io.*;
import java.util.*;
public class BOJ37 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String nm = bf.readLine();
		String[] nm1 = nm.split(" ");
		int n = Integer.parseInt(nm1[0]);
		int m = Integer.parseInt(nm1[1]);
		int[] n2 = new int[n];
		int z= 0;
		for(int i=0;i<n;i++) {
			n2[i] = i+1;
		}
		
		for(int g =0;g<m;g++) {
			String yj = bf.readLine();
			String[] yj1 = yj.split(" ");
			int y = Integer.parseInt(yj1[0]);
			int j = Integer.parseInt(yj1[1]);
			if(y==j) {
			
			}
			else {
				for(int a=j;a>y;a--) {
					for(int s =y-1;s<a-1;s++) {
						z = n2[s+1];
						n2[s+1]=n2[s];
						n2[s] = z;
					
					}
				}
			}
		}
		for(int x=0;x<n;x++) {
			System.out.print(n2[x] + " ");
			}
		
	}

}
