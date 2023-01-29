
public class LargestPrimeFactor {

	public static Integer largestPrimeFactor(Integer n) {
		int factor = -1;
		for(int i = 2; i * i <= n; i++) {
			if(n == 1) { break; }
			if(n % i != 0) { continue; }
			factor = i;
			while(n % i == 0) {
				n /= i;
			}
		}
		return n == 1 ? factor : n;
	}
	
	public static void main(String[] args) {
		Integer x = 455;
		
		System.out.println(largestPrimeFactor(x));
		
		Integer n = 256987513;
		
		System.out.println(largestPrimeFactor(n));
	}

}
