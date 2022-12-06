package Project_Euler;

import java.util.*;
public class Multiples_of_3_or_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 3 ;i < n ;i++) {
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
	}

}
