package MilitaryElite.military;

import MilitaryElite.Intrfaces.Repairable;

public class Repair implements Repairable {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.getPartName();
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d",this.partName,this.hoursWorked);
    }
}
