package MilitaryElite.military;

import MilitaryElite.Intrfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s %s Id: %d",
                super.getFirstName(),super.getLastName(),super.getId())).append(System.lineSeparator());
        str.append(String.format("Code Number: %03d",this.codeNumber));
        return str.toString();
    }
}

