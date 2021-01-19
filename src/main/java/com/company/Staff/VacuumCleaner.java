package com.company.Staff;

public class VacuumCleaner extends ElectricalStaff {
    private int noiseLevel;
    private  int cordLength;

    public VacuumCleaner(){
        super(700, "Vacuum Cleaner", false);
        noiseLevel = 78;
        cordLength = 6;
    }
}
