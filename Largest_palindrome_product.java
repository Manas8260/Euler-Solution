package Project_Euler;

import java.util.*;
public class Largest_palindrome_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ul = (int)Math.pow(10, n)-1;
		int ll = 1 + ul/10;
		int maxP = 0 ;
		for(int i = ul; i >= ll ;i--) {
			for(int j = i ; j >= ll ; j--) {
				   int prd = i*j;
				   if(prd < maxP)
					   break;
				   int num = prd;
				   int rev = 0;
				   
				   while(num > 0) {
					   int ld = num%10;
					   rev = 10*rev+ld;
					   num /= 10;
				   }
				   if(prd == rev && prd > maxP) maxP = prd;
			}
		}
		System.out.println(maxP);
	}

}
