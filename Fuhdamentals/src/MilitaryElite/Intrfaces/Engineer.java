package MilitaryElite.Intrfaces;

import MilitaryElite.military.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
