package Project_Euler;

public class Smallest_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		long ans = 1;
		for(long i = 2; i<= n ;i++) {
			ans = lcmL(ans,i);
		}
		System.out.println(ans);
	}
	static long gcdR(long a ,long b) {
		if(b == 0)
			return a;
		return gcdR(b,a%b);
	}
	static long lcmL(long a,long b) {
		return (a*b)/gcdR(a, b);
	}

}
