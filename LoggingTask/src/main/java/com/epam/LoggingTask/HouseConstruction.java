package com.epam.LoggingTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class HouseConstruction {
	private static final Logger LOGGER = LogManager . getLogger(HouseConstruction. class);
	public double housecost(String material,double area,String automation) {
		  double cost=0.0;
		  if(material=="standard" && automation=="no") 
			  cost=1200*area;
		  else if(material=="above standard" && automation=="no")
			  cost=1500*area;
		  else if(material=="high standard" && automation=="no")
			  cost=1800*area;
		  else if(material=="high standard" && automation=="yes")
			  cost=2500*area;
		  LOGGER.debug("The construction of house cost is"+cost);
		  return cost;
}
}
