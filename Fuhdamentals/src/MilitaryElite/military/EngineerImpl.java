package MilitaryElite.military;

import MilitaryElite.Intrfaces.Engineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;


    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new ArrayList<>();
    }



    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public List<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString()).append(System.lineSeparator());
        str.append(String.format("Corps: %s",this.getCorp().getText())).append(System.lineSeparator());
        str.append("Repairs:").append(System.lineSeparator());
        repairs.stream().forEach(p->str.append(p.toString()).append(System.lineSeparator()));

        return str.toString().trim();
    }
}
