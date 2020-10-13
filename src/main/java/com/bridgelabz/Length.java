package com.bridgelabz;

public class Length {

    enum Unit {FEET, INCH, YARD}
    private static final double YARD_TO_FEET = 3.0;
    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_INCH = 36.0;
    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET,that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(that.value * YARD_TO_FEET,this.value) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH,that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(that.value * YARD_TO_INCH,this.value) == 0;

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}

