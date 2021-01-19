package com.company.Command;

public class Commands {
    private final Command sortByWatt;
    private final Command countTotalVoltage;
    private final Command findByVoltage;
    private final Command switchPower;

    public Commands(Command sortByWatt, Command countTotalVoltage, Command findByVoltage, Command switchPower) {
        this.sortByWatt = sortByWatt;
        this.countTotalVoltage = countTotalVoltage;
        this.findByVoltage = findByVoltage;
        this.switchPower = switchPower;
    }

    public void sortByWatt() {
        sortByWatt.execute();
    }

    public void countTotalVoltage() {
        countTotalVoltage.execute();
    }

    public void findByVoltage() {
        findByVoltage.execute();
    }

    public void switchPower() {
        switchPower.execute();
    }
}
