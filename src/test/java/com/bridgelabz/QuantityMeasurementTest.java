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
        Length length = new Length(Length.Unit.FEET, 0.0);
        Length length1 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(length, length1);
    }

    @Test
    public void givingFeet_whenNotSame_ShouldReturnNotEquals() {
        Length length = new Length(Length.Unit.FEET, 0.0);
        Length length1 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(length, length1);
    }

    @Test
    public void giving0Inch_whenSame_ShouldReturnEquals() {
        Length length = new Length(Length.Unit.INCH, 0.0);
        Length length1 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(length, length1);
    }

    @Test
    public void giving0Inch_whenNotSame_ShouldReturnNotEquals() {
        Length length = new Length(Length.Unit.INCH, 0.0);
        Length length1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(length, length1);
    }

    @Test
    public void giving1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length length = new Length(Length.Unit.FEET, 1.0);
        Length length1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(length, length1);
    }

    @Test
    public void giving1FeetAnd0Inch_ShouldReturnEqual(){
        Length length = new Length(Length.Unit.FEET, 0.0);
        Length length1 = new Length(Length.Unit.INCH, 0.0);
       boolean compareCheck = length.compare(length1);
       Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving0FeetAnd0Inch_ShouldReturnNotEqual(){
        Length length = new Length(Length.Unit.FEET, 1.0);
        Length length1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = length.compare(length1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void giving1FeetAnd1Feet_ShouldReturnEqualLength(){
        Length length = new Length(Length.Unit.FEET, 1.0);
        Length length1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = length.compare(length1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving1FeetAnd12Inch_ShouldReturnEqualLength(){
        Length length = new Length(Length.Unit.FEET, 1.0);
        Length length1 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = length.compare(length1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving12FeetAnd1Inch_ShouldReturnNotEqual(){
        Length length = new Length(Length.Unit.FEET, 12.0);
        Length length1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = length.compare(length1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void giving1YardAnd1Yard_ShouldReturnEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(yard1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving1YardAnd0Yard_ShouldReturnNotEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        boolean compareCheck = yard.compare(yard1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void giving3FeetAnd1Yard_ShouldReturnEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving1YardAnd1Feet_ShouldReturnNotEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void giving1YardAnd1Inch_ShouldReturnNotEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void giving1YardAnd36Inch_ShouldReturnEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving36InchAnd1Yard_ShouldReturnEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void giving1YardAnd3Feet_ShouldReturnEqual(){
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }



}
