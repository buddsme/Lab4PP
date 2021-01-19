package com.company.Command;

import com.company.Staff.Iron;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class SwitchPowerTest {
    private static final Logger logger = Logger.getLogger("log");
    @Test
    void powerOnOff() {
        Iron iron = new Iron();
        iron.setPower(!(iron.isPower()));
        if(iron.isPower()){
            logger.log(Level.INFO,"The device powered on");
        }else {
            logger.log(Level.WARNING,"The device wasn't powered on");
        }
        boolean actual = iron.isPower();
        boolean expected = true;
        assertEquals(expected, actual);
        boolean nonExpected = false;
        assertNotEquals(nonExpected, actual);
    }
}