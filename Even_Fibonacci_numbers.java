package Project_Euler;

import java.util.*;

public class Even_Fibonacci_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 1,n2 = 2,sum=2;
		for(int i = 0 ; i < n-2 ;i++) {
			int t = n1;
			n1 = n2;
			n2 = n2+t;
			if((n2&1) == 0)
				sum += n2;
		}
		System.out.println(sum);
	}

}
