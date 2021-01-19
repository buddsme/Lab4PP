package com.company.Command;

import com.company.Staff.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CountTotalVoltageTest {

    private static final Logger logger = Logger.getLogger("log");
    @Test
    void countTotalVoltage() {
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

        CountTotalVoltage actualVoltage = new CountTotalVoltage(electricalStaff);
        electricalStaff.get(1).setPower(!(electricalStaff.get(1).isPower()));
        if(electricalStaff.get(1).isPower()){
            logger.log(Level.INFO,"The device powered on");
        }else {
            logger.log(Level.WARNING,"The device wasn't powered on");
        }
        int expected = 2100;
        int actual = actualVoltage.countTotalVoltage();
        logger.log(Level.INFO,"Actual value is " + actual);
        assertEquals(expected,actual);
        int nonExpected = 0;
        assertNotEquals(nonExpected,actual);
    }
}