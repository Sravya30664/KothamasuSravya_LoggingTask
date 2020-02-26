package com.epam.LoggingTask;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class HouseConstructionTest {
HouseConstruction house;
@Before
public void init() {
	house=new HouseConstruction();
}


@Test
public void testhousecost() {
	assertEquals(264000,house.housecost("standard", 220, "no"),0);
}
@Test
public void testhousecost1() {
	assertEquals(495000.00,house.housecost("above standard", 330, "no"),0);
}
@Test
public void testhousecost2() {
	assertEquals(802800.00,house.housecost("high standard", 446, "no"),0);
}
@Test
public void testhousecost3() {
	assertEquals(2650000.00,house.housecost("high standard", 1060, "yes"),0);
}

}
