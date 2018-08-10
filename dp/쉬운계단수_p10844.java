/*
 * 45656�̶� ���� ����.

�� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.

�����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.)
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.
 */
package baekjoon.dp;

import java.util.Scanner;

public class �����ܼ�_p10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][]d = new int[101][101];
		
		int sum=0;
		
		for(int i=1; i<10; ++i) {
			d[1][i]=1;
		}
		for(int j=2; j<=num; ++j) {
			for(int k=0; k<10; ++k) {
				if(k==0)
					d[j][k]=d[j-1][1]%1000000000;
				else if(k==9)
					d[j][k]=d[j-1][8]%1000000000;
				else
					d[j][k] = (d[j-1][k-1]+d[j-1][k+1])%1000000000;
			}
		}
		for(int i=0; i<10; ++i) {
			sum = (sum+d[num][i])%1000000000;
		}
		System.out.println(sum);
	}

}
