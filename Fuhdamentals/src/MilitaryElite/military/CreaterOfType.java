package MilitaryElite.military;

import MilitaryElite.Intrfaces.Private;

import java.util.Map;

public class CreaterOfType {

    public static SpyImpl createSpyImpl(String[]tokens){
        String type = tokens[0];
        int id = Integer.parseInt(tokens[1]);
        String firstName = tokens[2];
        String lastName = tokens[3];
        int codeNum = Integer.parseInt(tokens[4]);
        if(type.equals("Spy")){
            SpyImpl spy = new SpyImpl(id,firstName,lastName,codeNum);
            return spy;
        }
        return null;
    }
    public static CommandoImpl createCommandoImpl(String[]tokens){
        String type = tokens[0];
        int id = Integer.parseInt(tokens[1]);
        String firstName = tokens[2];
        String lastName = tokens[3];
        double salary = Double.parseDouble(tokens[4]);
        Corps corp = Corps.valueOf(tokens[5].toUpperCase());

        if(type.equals("Commando")){
            if(tokens[5].equals("Airforces") || tokens[5].equals("Marines") ) {
                CommandoImpl com = new CommandoImpl(id, firstName, lastName, salary, corp);
                for (int i = 6; i < tokens.length; i += 2) {
                    String codeName = tokens[i];
                    State state = State.valueOf(tokens[i + 1].toUpperCase());
                    if (tokens[i + 1].equals("inProgress") || tokens[i + 1].equals("finished")) {
                        Mission mission = new Mission(codeName, state);
                        com.addMission(mission);
                    }
                }

                return com;
            }

        }
        return null;


    }


    public static  EngineerImpl createEngineerImpl(String[] tokens) {
        String type = tokens[0];
        int id = Integer.parseInt(tokens[1]);
        String firstName = tokens[2];
        String lastName = tokens[3];
        double salary = Double.parseDouble(tokens[4]);
        Corps corp = Corps.valueOf(tokens[5].toUpperCase());

        if(type.equals("Engineer")){
            if(tokens[5].equals("Airforces") || tokens[5].equals("Marines") ) {
                EngineerImpl eng = new EngineerImpl(id, firstName, lastName, salary, corp);
                for (int i = 6; i < tokens.length; i += 2) {
                    String partName = tokens[i];
                    int hoursWorked = Integer.parseInt(tokens[i + 1]);
                    Repair repair = new Repair(partName, hoursWorked);
                    eng.addRepair(repair);
                }

                return eng;
            }

        }
        return null;


    }

    public static LieutenantGeneralImpl createLieutenantGeneralImpl(String[]tokens, Map<Integer, Private> privateById) {
        String type = tokens[0];
        int id = Integer.parseInt(tokens[1]);
        String firstName = tokens[2];
        String lastName = tokens[3];
        double salary = Double.parseDouble(tokens[4]);
        if(type.equals("LieutenantGeneral")){
            LieutenantGeneralImpl lieut = new LieutenantGeneralImpl(id,firstName,lastName,salary);
            for (int i = 5; i <tokens.length ; i +=1 ){
                int idOfPrivate = Integer.parseInt(tokens[i]);
                lieut.addPrivate(privateById.get(idOfPrivate));
            }
            return lieut;
        }
        return null;
    }

    public static  Private createPrivate(String[] tokens) {
        String type = tokens[0];
        int id = Integer.parseInt(tokens[1]);
        String firstName = tokens[2];
        String lastName = tokens[3];
        double salary = Double.parseDouble(tokens[4]);
        if(type.equals("Private")){
            Private priv = new PrivateImpl(id,firstName,lastName,salary);
            return priv;
        }
        return null;

    }
}
