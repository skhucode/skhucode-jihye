/*
 * ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �� ��, ������ ���� ���Ƶ� ������������ ģ��.

���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.

���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
 */
package baekjoon.dp;

import java.util.Scanner;

public class ��������_p11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][]d = new int[101][101];
		
		int sum=0;
		
		for(int i=0; i<=9; ++i) d[1][i]=1;
		
		for(int i=2; i<=num; ++i) {
			for(int j=0; j<=9; ++j) {
				for(int k=0; k<=j; ++k) {
					d[i][j] +=d[i-1][k];
					d[i][j] %=10007;
				}
			}
		}
		
		for(int i=0; i<10; ++i) sum += d[num][i];
		sum %= 10007;
		
		System.out.println(sum);
	}

}
