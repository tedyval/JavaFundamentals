package MilitaryElite.military;

public enum State {

    INPROGRESS("inProgress"),
    FINISHED("finished");

    private String status;

    State(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
