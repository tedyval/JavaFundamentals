package FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Team> teams = new LinkedHashMap<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String nameTeam= tokens[1];
            switch (command) {
                case "Team":
                    Team team = new Team(tokens[1]);
                    teams.put(tokens[1], team);
                    break;
                case "Add":
                    String nameOfPlayer = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);
                    if (teams.containsKey(nameTeam)) {
                        try{
                            Player player = new Player(nameOfPlayer,endurance,sprint,dribble,passing,shooting);
                            teams.get(nameTeam).addPlayer(player);
                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }

                    } else {
                        System.out.printf("Team %s does not exist.%n",nameTeam);
                    }
                    break;
                case "Remove":
                    teams.get(tokens[1]).remove(tokens[2]);
                    break;
                case "Rating":
                    if (teams.containsKey(nameTeam)) {
                        System.out.println(nameTeam + " - " + Math.round(teams.get(nameTeam).getRating()));
                    } else {
                        System.out.printf("Team %s does not exist.%n",nameTeam);
                    }
                    break;

            }


            input = scanner.nextLine();
        }

    }
}
