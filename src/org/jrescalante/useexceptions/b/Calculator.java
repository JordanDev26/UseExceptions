package org.jrescalante.useexceptions.b;

public class Calculator {

    public double divide(int dividend, int divisor)throws Division0Exception{
        if (divisor == 0){
            throw new Division0Exception("It's impossible to divide by zero.");
        }
        return dividend/(double)divisor;
    }

    public double divide(String dividend, String divisor) throws Division0Exception, NumberrFormatException {
        try {
            int numDividend = Integer.parseInt(dividend);
            int numDivisor = Integer.parseInt(divisor);
            return this.divide(numDividend,numDivisor);
        }catch (NumberFormatException e){
            throw new NumberrFormatException("You must enter a number in the numerator and the divisor.");
        }
    }



    }
