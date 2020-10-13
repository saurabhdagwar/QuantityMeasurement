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
        Length length = new Length(Length.Unit.FEET,0.0);
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length, length1);
    }
    @Test
    public void givingFeet_whenEquals_ShouldReturnNotEquals(){
        Length length = new Length(Length.Unit.FEET,0.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(length, length1);
    }
    @Test
    public void giving0Inch_whenEquals_ShouldReturnEquals(){
        Length length = new Length(Length.Unit.INCH,0.0);
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(length,length1);
    }
    @Test
    public void giving0Inch_whenEquals_ShouldReturnNotEquals(){
        Length length = new Length(Length.Unit.INCH,0.0);
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(length,length1);
    }
    @Test
    public void giving1FeetAnd1Inch_ShouldReturnNotEqual(){
        Length length = new Length(Length.Unit.FEET,1.0);
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(length,length1);
    }
}
