package MilitaryElite.Intrfaces;

import MilitaryElite.military.State;

public interface Missonable {
    String getPartName();
    State getState();
    void completeMission();

}
