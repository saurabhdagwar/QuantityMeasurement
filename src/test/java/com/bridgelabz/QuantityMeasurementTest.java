package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givingLength_WhenSame_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        int checkFeet = 1;
        int inch = 12;
        boolean check = quantityMeasurement.compareLength(checkFeet, inch);
        Assert.assertTrue(check);
    }

    @Test
    public void givingFeet_whenSame_ShouldReturnEquals() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 1.0);
        double feet1 = new Length().convert(Unit.FEET.getUnit(), 1.0);
        Assert.assertEquals(feet, feet1, 0.0);
    }

    @Test
    public void givingFeet_whenNotSame_ShouldReturnNotEquals() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 1.0);
        double feet1 = new Length().convert(Unit.FEET.getUnit(), 0.0);
        Assert.assertNotEquals(feet, feet1);
    }

    @Test
    public void giving0Inch_whenSame_ShouldReturnEquals() {
        double inch = new Length().convert(Unit.INCH.getUnit(), 0.0);
        double inch1 = new Length().convert(Unit.INCH.getUnit(), 0.0);
        Assert.assertEquals(inch, inch1, 0.0);
    }

    @Test
    public void giving0Inch_whenNotSame_ShouldReturnNotEquals() {
        double inch = new Length().convert(Unit.INCH.getUnit(), 0.0);
        double inch1 = new Length().convert(Unit.INCH.getUnit(), 1.0);
        Assert.assertNotEquals(inch, inch1);
    }

    @Test
    public void giving1FeetAnd1Inch_ShouldReturnNotEqual() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 1.0);
        double inch1 = new Length().convert(Unit.INCH.getUnit(), 1.0);
        Assert.assertNotEquals(feet, inch1);
    }

    @Test
    public void giving0FeetAnd0Inch_ShouldReturnNotEqual() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 0.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 0.0);
        boolean compareCheck = new checkEqual(feet, inch).check();
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giving1FeetAnd1Feet_ShouldReturnEqualLength() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 1.0);
        double feet1 = new Length().convert(Unit.FEET.getUnit(), 1.0);
        boolean compareCheck = new checkEqual(feet, feet1).check();
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giving12FeetAnd1Inch_ShouldReturnNotEqual() {
        double feet = new Length().convert(Unit.FEET.getUnit(), 12.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 1.0);
        boolean compareCheck = new checkEqual(feet, inch).check();
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void giving1YardAnd1Yard_ShouldReturnEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double yard1 = new Length().convert(Unit.YARD.getUnit(), 1.0);
        boolean compareCheck = new checkEqual(yard1, yard).check();
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giving1YardAnd0Yard_ShouldReturnNotEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double yard1 = new Length().convert(Unit.YARD.getUnit(), 0.0);
        boolean compareCheck = new checkEqual(yard1, yard).check();
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void giving3FeetAnd1Yard_ShouldReturnEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double feet = new Length().convert(Unit.FEET.getUnit(), 3.0);
        boolean compareCheck = new checkEqual(feet, yard).check();
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giving1YardAnd1Feet_ShouldReturnNotEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double feet = new Length().convert(Unit.FEET.getUnit(), 1.0);
        boolean compareCheck = new checkEqual(yard, feet).check();
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void giving1YardAnd1Inch_ShouldReturnNotEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 1.0);
        boolean compareCheck = new checkEqual(yard, inch).check();
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void giving1YardAnd36Inch_ShouldReturnEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 36.0);
        boolean compareCheck = new checkEqual(yard, inch).check();
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giving36InchAnd1Yard_ShouldReturnEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 36.0);
        Assert.assertEquals(yard, inch, 0.0);
    }

    @Test
    public void giving1YardAnd3Feet_ShouldReturnEqual() {
        double yard = new Length().convert(Unit.YARD.getUnit(), 1.0);
        double feet = new Length().convert(Unit.FEET.getUnit(), 3.0);
        Assert.assertEquals(yard, feet, 0.0);
    }
    @Test
    public void giving2InchAnd5CM_ShouldReturnEqual() {
        double cm = new Length().convert(Unit.CM.getUnit(), 5.0);
        double inch = new Length().convert(Unit.INCH.getUnit(), 2.0);
        boolean compareCheck = new checkEqual(cm, inch).check();
        Assert.assertTrue(compareCheck);
    }

}
