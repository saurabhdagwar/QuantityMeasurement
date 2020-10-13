package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givingLength_WhenSame_ShouldReturnTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int checkFeet = 1;
        int inch = 12;
        boolean check = quantityMeasurement.compareLength(checkFeet,inch);
        Assert.assertTrue(check);
    }
    @Test
    public void givingFeet_whenEquals_ShouldReturnEquals(){
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertEquals(feet,feet1);
    }
    @Test
    public void givingFeet_whenEquals_ShouldReturnNotEquals(){
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(1.0);
        Assert.assertNotEquals(feet,feet1);
    }
    @Test
    public void giving0Inch_whenEquals_ShouldReturnEquals(){
       Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertEquals(inch,inch1);
    }
    @Test
    public void giving0Inch_whenEquals_ShouldReturnNotEquals(){
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(1.0);
        Assert.assertNotEquals(inch,inch1);
    }
}
