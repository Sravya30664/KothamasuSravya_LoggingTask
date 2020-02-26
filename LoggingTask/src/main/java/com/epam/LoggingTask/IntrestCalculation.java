package com.epam.LoggingTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class IntrestCalculation {
	private static final Logger LOGGER = LogManager . getLogger(IntrestCalculation. class);
	public double simpleIntrest(double principle_amount,double rate_of_intrest,double time_in_years) {
   	    double si;
		si=principle_amount*rate_of_intrest*time_in_years/100;
   	    LOGGER . debug("The simple intrest is"+si);
   	    return si;
    }
    public double compoundIntrest(double principle_amount,double rate_of_intrest,double time_in_years) {
   	 double ci =principle_amount*Math.pow(1+(rate_of_intrest/100),time_in_years);
   	 LOGGER.debug("The compound intrest obtained is"+ci);
   	 return ci;
}
}