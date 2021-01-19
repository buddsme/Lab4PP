package com.company.Staff;

public class Microwave extends ElectricalStaff{
    private int heatingPower;
    private int volume;

    public Microwave(){
        super(800,"Microwave", false);
        heatingPower = 70;
        volume = 23;
    }
}
