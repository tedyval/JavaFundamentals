package MilitaryElite.military;

import MilitaryElite.Intrfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corp;

    protected SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corp) {
        super(id, firstName, lastName, salary);
        this.corp = corp;
    }

    @Override
    public Corps getCorp() {
        return this.corp;
    }
}
