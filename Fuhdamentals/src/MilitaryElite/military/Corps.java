package MilitaryElite.military;

public enum Corps {
    AIRFORCES("Airforces"),
    MARINES("Marines");

    private String text;

    Corps(String text) {
        this.text = text;
    }

    public String getText(){
       return this.text;
    }
}
