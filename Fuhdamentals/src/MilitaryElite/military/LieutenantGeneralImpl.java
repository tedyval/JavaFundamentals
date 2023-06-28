package MilitaryElite.military;

import MilitaryElite.Intrfaces.LieutenantGeneral;
import MilitaryElite.Intrfaces.Private;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add((PrivateImpl)priv);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(super.toString()).append(System.lineSeparator());
        str.append("Privates:").append(System.lineSeparator());
        privates.stream().sorted((p1,p2)-> p2.getFirstName().compareTo(p1.getFirstName())).forEach(p->str.append(p.toString()).append(System.lineSeparator()));

       return str.toString().trim();
    }
}
