package com.company.Command;

import com.company.Staff.ElectricalStaff;

import java.util.ArrayList;
import java.util.Collections;

public class SortByWatt implements Command{

    private final ArrayList<ElectricalStaff> electricalStaff;

    public SortByWatt(ArrayList<ElectricalStaff> electricalStaff) {
        this.electricalStaff = electricalStaff;
    }

    public ArrayList<ElectricalStaff> sort(){
        System.out.println("Sorted list of electrical staff by Watt:\n");
        Collections.sort(electricalStaff);
        for (ElectricalStaff staff : electricalStaff) {
            System.out.println(staff);
        }
        return electricalStaff;
    }

    @Override
    public void execute() {
        sort();
    }
}
