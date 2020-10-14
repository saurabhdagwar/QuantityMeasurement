package com.bridgelabz;

public class checkEqual {
    public double unit1;
    public double unit2;

    public checkEqual(double unit1, double unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }
    public boolean check(){
        if(unit1 == unit2){
            return true;
        }
        return false;
    }
}
