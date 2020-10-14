package com.bridgelabz;
public enum Unit{
    FEET(12), INCH(1), YARD(36),CM(0.4);
    private double unit;
    Unit(double unit){
        this.unit = unit;
    }
    public double getUnit(){
        return unit;
    }

}