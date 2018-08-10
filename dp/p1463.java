/*
 * 1로 만들기 문제
 * D[N] = N을 1로 만드는데 필요한 연산 수의 최소값
 */
package baekjoon.dp;

import java.util.Scanner;

public class p1463 {
	
	static int[]d;
	static int one(int n) {
		if(n==1) return 0;
		
		if(d[n]>0) return d[n];
		
		d[n] = one(n-1)+1;
		
		if(n%2==0) {
			int temp = one(n/2)+1;
			if(d[n]>temp) d[n] = temp;
		}
		
		if(n%3 ==0) {
			int temp = one(n/3) +1;
			if(d[n]>temp) d[n] = temp;
		}
		return d[n];
	}
	
	static int two(int n) {
		d[1]=0;
		for(int i=2; i<=n; ++i) {
			d[i] = d[i-1]+1;
			
			if(i%2==0 && d[i]>d[i/2]+1) {
				d[i] = d[i/2]+1;
			}
			if(i%3==0 && d[i]>d[i/3]+1) {
				d[i] = d[i/3] +1;
			}
		}
		return d[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		d = new int[num+1];
		
		int value=one(num);
		
		
		System.out.println(value);
		
		System.out.println(two(num));
	}

}
