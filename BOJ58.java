package BOJ;
import java.io.*;
import java.util.Scanner;
public class BOJ58 {
//색종이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][]= new int[100][100];
        int cnt=0;
        int number =sc.nextInt();
         
        for(int i=0;i<number;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
             
            for(int j=y; j<y+10;j++) {
                for(int z=x;z<x+10;z++) {
                    array[j][z]=1;
                }
            }
             
        }
        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                if(array[i][j]==1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
         
 
    }   

}
