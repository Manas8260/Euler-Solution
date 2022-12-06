package Project_Euler;

public class Sum_square_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		long sum = 0,sq = 0;
		for(int i = 1 ;i <= n ;i++) {
			sum += i*i;
		}
		sq = ((n*(n+1))/2)*((n*(n+1))/2);
		System.out.println((sq-sum));
	}

}
