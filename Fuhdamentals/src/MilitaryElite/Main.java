package MilitaryElite;

import MilitaryElite.Intrfaces.Private;
import MilitaryElite.Intrfaces.Soldier;
import MilitaryElite.military.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Integer, Private> privateById = new LinkedHashMap<>();
        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            switch(type){
                case "Private":
                    Private priv = CreaterOfType.createPrivate(tokens);
                    privateById.put(Integer.parseInt(tokens[1]),priv);
                    if(priv != null){
                        System.out.println(priv);
                    }

                    break;
                case "LieutenantGeneral":
                    LieutenantGeneralImpl lieut = CreaterOfType.createLieutenantGeneralImpl(tokens,privateById);
                    if(lieut != null){
                        System.out.println(lieut);
                    }

                    break;
                case "Engineer":
                    EngineerImpl eng = CreaterOfType.createEngineerImpl(tokens);
                    if(eng != null){
                        System.out.println(eng);
                    }

                    break;
                case "Commando":
                    CommandoImpl comm =CreaterOfType.createCommandoImpl(tokens);
                    if(comm != null){
                        System.out.println(comm);
                    }

                    break;
                case "Spy":
                    SpyImpl spy = CreaterOfType.createSpyImpl(tokens);
                    if(spy != null){
                        System.out.println(spy);
                    }

                    break;


            }

            input = scanner.nextLine();
        }



    }









}
