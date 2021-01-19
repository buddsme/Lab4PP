package com.company.Staff;

public class Iron extends ElectricalStaff {
    private int heatingTemperature;
    private double volumeForWater;

    public Iron(){
        super(2100, "Iron", false);
        heatingTemperature = 90;
        volumeForWater = 1.2;
    }
}
