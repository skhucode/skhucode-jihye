package baekjoon.dp;

import java.util.Scanner;

public class ºØ¾î»§ÆÇ¸Å_p11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int [] d = new int [num+1];
		int [] p = new int [num+1];
		
		for(int i=1; i<=num; ++i) {
			p[i]=input.nextInt();
		}
		d[0] =0;
		for(int i=1; i<=num; ++i) {
			d[i]=0;
			for(int j=1; j<=i; ++j) {
				d[i] = Math.max(d[i],d[i-j]+p[j]);
			}
		}
		System.out.println(d[num]);
		input.close();
	}

}
