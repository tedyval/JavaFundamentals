package MilitaryElite.military;

import MilitaryElite.Intrfaces.Commando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(missions);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString()).append(System.lineSeparator());
        str.append(String.format("Corps: %s",this.getCorp().getText())).append(System.lineSeparator());
        str.append("Missions:").append(System.lineSeparator());
        missions.stream().forEach(p->str.append(p.toString()).append(System.lineSeparator()));

        return str.toString().trim();
    }
}
