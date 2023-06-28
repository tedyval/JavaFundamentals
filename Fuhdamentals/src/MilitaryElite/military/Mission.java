package MilitaryElite.military;

import MilitaryElite.Intrfaces.Missonable;


public class Mission implements Missonable {

    private String codeName;
    private MilitaryElite.military.State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public String getPartName() {
        return this.codeName;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void completeMission() {
        this.state = State.FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",this.codeName,this.getState().getStatus());
    }
}
