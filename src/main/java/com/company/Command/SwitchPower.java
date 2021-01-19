package com.company.Command;

import com.company.Staff.ElectricalStaff;

import java.util.ArrayList;
import java.util.Scanner;


public class SwitchPower implements Command {

    private final ArrayList<ElectricalStaff> electricalStaff;

    public SwitchPower(ArrayList<ElectricalStaff> electricalStaff) {
        this.electricalStaff = electricalStaff;
    }

    public void powerOnOff(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        for (ElectricalStaff staff : electricalStaff) {
            System.out.println(staff.getNameOfStaff() + ". Do you want to switch power? 1 - Yes 2 - No");
            choose = scanner.nextInt();
            if (choose == 1) {
                staff.setPower(!(staff.isPower()));
            }
        }
    }

    @Override
    public void execute() {
        powerOnOff();
    }
}
