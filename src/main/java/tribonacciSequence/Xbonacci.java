package tribonacciSequence;

public class Xbonacci {

	public double[] tribonacci(double[] s, int n) {
		double[] dsTmp = null;
		//for low n, we create array, with n size, and return first n elements from s 
		if (s.length <= 3 && n < 3) {

			dsTmp = new double[n];
			for (int i0 = 0; i0 < n; i0++) {
				dsTmp[i0] = s[i0];
			}
			return dsTmp;
		}
			
		if (n == 0) {
			return new double[0];
		}
		
		dsTmp = new double[n];

		for (int i0 = 0; i0 < s.length; i0++) {
			dsTmp[i0] = s[i0];
		}

		for (int i1 = 2; i1 < n-1; i1++) {
			dsTmp[i1+1] = dsTmp[i1] + dsTmp[i1 - 1] + dsTmp[i1 - 2];
		}

		return dsTmp;
	}
}
