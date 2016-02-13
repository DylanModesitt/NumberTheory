import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class SquareTriangularNumbers {

	public static void main(String[] args) {
		BigInteger uInitial = BigInteger.valueOf(3);
		BigInteger vInitial = BigInteger.valueOf(2);
				
        long startTime = System.currentTimeMillis();
        while(false||(System.currentTimeMillis()-startTime)<10000) {
        	BigInteger sValue = uInitial.multiply(vInitial);
        	BigInteger tValue = bigSqrt(new BigDecimal(BigInteger.valueOf(1).add(BigInteger.valueOf(8).multiply(sValue).multiply(sValue)))).subtract(BigDecimal.valueOf(1)).divide(BigDecimal.valueOf(2)).toBigInteger();
        	BigDecimal tDecimal = new BigDecimal(tValue);
        	BigDecimal sDecimal = new BigDecimal(sValue);
        	
        	System.out.println("Square Triangular : " + sValue.multiply(sValue).toString() + " SquareRoot: " + sValue.toString() + " Triangle: "
        					                       + tValue.toString() + " t/s Ratio: " +  tDecimal.divide(sDecimal, MathContext.DECIMAL128) + " verified?: " + verifyTriangularSquare(sValue,tValue)
        					                       + " uGenerator: " + uInitial + " vGenerator: " + vInitial);		
        	
        	vInitial = BigInteger.valueOf(2).multiply(sValue);
        	uInitial = bigSqrt(new BigDecimal(BigInteger.valueOf(8).multiply(sValue.multiply(sValue)).add(BigInteger.valueOf(1)))).toBigInteger();
        }
    }

    private static boolean verifyTriangularSquare(BigInteger s, BigInteger t)
    {
        BigInteger a = BigInteger.valueOf(2).multiply(s).multiply(s);
        BigInteger b = t.multiply(t).add(t);
        return a.equals(b);
    }

    // From http://stackoverflow.com/questions/13649703/square-root-of-bigdecimal-in-java
    private static final BigDecimal SQRT_DIG = new BigDecimal(150);
    private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

    /**
     * Private utility method used to compute the square root of a BigDecimal.
     * 
     * @author Luciano Culacciatti 
     * @return 
     * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
     */
    private static BigDecimal sqrtNewtonRaphson  (BigDecimal c, BigDecimal xn, BigDecimal precision){
        BigDecimal fx = xn.pow(2).add(c.negate());
        BigDecimal fpx = xn.multiply(new BigDecimal(2));
        BigDecimal xn1 = fx.divide(fpx,2*SQRT_DIG.intValue(),RoundingMode.HALF_DOWN);
        xn1 = xn.add(xn1.negate());
        BigDecimal currentSquare = xn1.pow(2);
        BigDecimal currentPrecision = currentSquare.subtract(c);
        currentPrecision = currentPrecision.abs();
        if (currentPrecision.compareTo(precision) <= -1){
            return xn1;
        }
        return sqrtNewtonRaphson(c, xn1, precision);
    }

    /**
     * Uses Newton Raphson to compute the square root of a BigDecimal.
     * 
     * @author Luciano Culacciatti 
     * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
     */
    public static BigDecimal bigSqrt(BigDecimal c){
        return sqrtNewtonRaphson(c,new BigDecimal(1),new BigDecimal(1).divide(SQRT_PRE));
    }


}
