package Project_Euler;

public class prime10001 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long c = 0,ans = 0;
		for(long i = 2; ;i++) {
			if(isP(i))c++;
			if(c == 10001) {
				ans = i;
				break;
			}	
		}
		System.out.println(ans);
	}
	static boolean isP(long n ) {
		boolean ans = true;
		for(long i = 2l ;i*i <= n ;i++) {
			if(n % i == 0)
				ans = false;
		}
		return ans;
	}	

}
