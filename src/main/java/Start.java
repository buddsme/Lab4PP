import com.company.Command.*;
import com.company.Staff.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ElectricalStaff> electricalStaff = new ArrayList<>();
        electricalStaff.add(new Iron());
        electricalStaff.add(new Kettle());
        electricalStaff.add(new Microwave());
        electricalStaff.add(new VacuumCleaner());

        Command totalVoltage = new CountTotalVoltage(electricalStaff);
        Command findBy = new FindByVoltage(electricalStaff);
        Command sort = new SortByWatt(electricalStaff);
        Command switchPower = new SwitchPower(electricalStaff);
        Commands start = new Commands(sort, totalVoltage, findBy, switchPower);

        int choice;
        do {
            printMenuInfo();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    start.switchPower();
                    break;
                }
                case 2: {
                    start.countTotalVoltage();
                    break;
                }
                case 3: {
                    start.sortByWatt();
                    break;
                }
                case 4: {
                    start.findByVoltage();
                    break;
                }
                case 5: {
                    printDevices(electricalStaff);
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default: {
                    {
                        System.out.println("Invalid request");
                        System.exit(1);
                    }
                }
            }
        } while (true);

    }

    public static void printMenuInfo() {
        System.out.println("\n1) Switch power of devices.\n" +
                "2) Count total voltage of powered on devices.\n" +
                "3) Sort list of devices by voltage.\n" +
                "4) Find devices in the range.\n" +
                "5) Print all devices.\n" +
                "6) Exit");
    }

    public static void printDevices(ArrayList<ElectricalStaff> electricalStaff) {
        for (ElectricalStaff staff : electricalStaff) {
            System.out.println(staff);
        }
    }
}
