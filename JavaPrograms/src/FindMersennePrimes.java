import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;


public class FindMersennePrimes {

	public static void main(String[] args) {
		BigInteger two = BigInteger.valueOf(2);
		
		
	}
	
	public boolean isPrime(BigInteger n) {
		if(!n.isProbablePrime(1)) { return false; }
	    for(BigInteger i= BigInteger.valueOf(0);n.subtract(i.multiply(i)).intValue() >= 0; i.add(BigInteger.valueOf(2))) {
	        if(n.mod(i).equals(0))
	            return false;
	    }
	    return true;
	}
}
