package baekjoon.stack;

import java.util.*;

public class 조세퍼스_p1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		StringBuilder builder = new StringBuilder();
		builder.append('<');
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; ++i) {
			queue.offer(i);
		}
		
		for(int i=0; i<n-1; ++i) {
			for(int j=0; j<m-1; ++j) {
				queue.offer(queue.poll());
			}
			builder.append(queue.poll() + ", ");
		}
		builder.append(queue.poll()+">");
		System.out.println(builder.toString());
	}

}
