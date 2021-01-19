package com.company.Staff;

public class ElectricalStaff implements Comparable<ElectricalStaff> {
    private String nameOfStaff;
    private int voltage;
    private boolean power;

    public ElectricalStaff(int voltage,String nameOfStaff, boolean power){
        this.voltage = voltage;
        this.nameOfStaff = nameOfStaff;
        this.power = power;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getNameOfStaff() {
        return nameOfStaff;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }


    @Override
    public String toString() {
        return  nameOfStaff +
                ": voltage = " + voltage +
                ", power = " + power;
    }

    @Override
    public int compareTo(ElectricalStaff o) {
        return getVoltage() - o.getVoltage();
    }
}
