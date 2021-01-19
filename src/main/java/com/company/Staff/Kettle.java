package com.company.Staff;

public class Kettle extends ElectricalStaff {
    private double volume;
    private int temperature;

    public Kettle(){
        super(1800, "Kettle", false);
        volume = 1.7;
        temperature = 100;
    }
}
