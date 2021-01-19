package com.company.Command;

import com.company.Staff.ElectricalStaff;

import java.util.ArrayList;

public class CountTotalVoltage implements Command{
    private final ArrayList<ElectricalStaff> electricalStaff;
    private int totalVoltage;

    public CountTotalVoltage(ArrayList<ElectricalStaff> electricalStaff) {
        this.electricalStaff = electricalStaff;
    }

    public int getTotalVoltage() {
        return totalVoltage;
    }

    public void setTotalVoltage(int totalVoltage) {
        this.totalVoltage = totalVoltage;
    }

    public int countTotalVoltage() {
        totalVoltage = 0;
        for (ElectricalStaff staff : electricalStaff) {
            if (staff.isPower()) {
                setTotalVoltage(getTotalVoltage() + staff.getVoltage());
            }
        }
        System.out.println("Total voltage is -> " + getTotalVoltage() + " Watt");
        return totalVoltage;
    }
    @Override
    public void execute() {
        countTotalVoltage();
    }
}
