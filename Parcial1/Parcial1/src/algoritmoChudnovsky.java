public class algoritmoChudnovsky implements Chudnovsky {
	
	/**
	 * @author Jose Pablo Paz 
	 */
	
	/**
	 * @return   Una aproximacion de pi
	 */
	@Override
	public double calcularChudnovsky (int k){
		long a = -262537412640768000L;
		if(k==0) {
			return 3.14159265359;
		}else {
		return ( (Factorial((6 * k)) * (13591409.0 + (545140134.0 * k)))/((Factorial(3 * k) * (Factorial(k)^3)) * (a^(k))) ) + calcularChudnovsky(k-1);
		}
	}

	/**
	 * @return   El factorial de un numero
	 */
	public int Factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n * Factorial(n-1);
		}
	}
	
}
