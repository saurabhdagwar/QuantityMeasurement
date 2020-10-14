package com.bridgelabz;
public class Length {
public double quantity;

    public double convert(double unit, double quantity){
        return this.quantity = unit * quantity;
    }

    public double add(double unit1,double unit2){
        return unit1+unit2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.quantity, quantity) == 0;
    }

}


