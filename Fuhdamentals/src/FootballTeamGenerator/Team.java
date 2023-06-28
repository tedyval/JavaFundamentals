package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("A name should not be empty.");
        }else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void remove(String name){
        Player player= null;
        for (Player player1 : players) {
            if(player1.getName().equals(name)){
                player = player1;
            }
        }

        if(player != null){
            this.players.remove(player);
        }else{
            System.out.printf("Player %s is not in %s team.%n",name,this.name);
        }

    }

    public double getRating(){
        return this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
