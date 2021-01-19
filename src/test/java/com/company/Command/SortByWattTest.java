package com.company.Command;

import com.company.Staff.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class SortByWattTest {
    private static final Logger logger = Logger.getLogger("log");
    @Test
    void sort() {
        ArrayList<ElectricalStaff> electricalStaff = new ArrayList<>();
        electricalStaff.add(new VacuumCleaner());
        electricalStaff.add(new Iron());
        electricalStaff.add(new Kettle());
        electricalStaff.add(new Microwave());
        if(electricalStaff.size() == 4){
            logger.log(Level.INFO,"Array electrical staff was created and filled");
        }
        else {
            logger.log(Level.WARNING,"Array electrical staff wasn't filled");
        }

        SortByWatt staffSort = new SortByWatt(electricalStaff);

        Collections.swap(electricalStaff,1,3);
        if(electricalStaff.get(1).getNameOfStaff().equals("Microwave") && electricalStaff.get(3).getNameOfStaff().equals("Iron")){
            logger.log(Level.INFO,"1-st and 3-rd elements were swapped");
        }else {
            logger.log(Level.INFO,"1-st and 3-rd elements couldn't swap");
        }

        assertEquals(electricalStaff, staffSort.sort());
        Collections.swap(electricalStaff,0,2);
        if(electricalStaff.get(0).getNameOfStaff().equals("Kettle") && electricalStaff.get(2).getNameOfStaff().equals("Vacuum Cleaner")) {
            logger.log(Level.INFO, " 0-element and 2-nd element were swapped");
        }else {
            logger.log(Level.INFO,"0-element and 2-nd element couldn't swap");
        }
        assertNotEquals(electricalStaff,staffSort);

    }
}