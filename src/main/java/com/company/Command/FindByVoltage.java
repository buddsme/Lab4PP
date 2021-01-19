package com.company.Command;

import com.company.Staff.ElectricalStaff;

import java.util.ArrayList;
import java.util.Scanner;

public class FindByVoltage implements Command {

    private final ArrayList<ElectricalStaff> electricalStaff;

    public FindByVoltage(ArrayList<ElectricalStaff> electricalStaff) {
        this.electricalStaff = electricalStaff;
    }

    public void findByVoltage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min:");
        int min = input.nextInt();
        System.out.println("Enter max:");
        int max = input.nextInt();
        int countStaffInPower = 0;
        for(ElectricalStaff staff : electricalStaff){
            if(staff.getVoltage() >= min && staff.getVoltage() <= max){
                System.out.println(staff);
                countStaffInPower++;
            }
        }
        if(countStaffInPower == 0){
            System.out.println("No one device in power on.");
        }

    }
    @Override
    public void execute() {
        findByVoltage();
    }
}
