package MilitaryElite.Intrfaces;

import MilitaryElite.military.Mission;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();

}
