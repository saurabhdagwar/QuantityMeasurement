package com.bridgelabz;
public class Length {
public double quantity;
    public double convert(double unit, double quantity){
        return this.quantity = unit * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.quantity, quantity) == 0;
    }

}


