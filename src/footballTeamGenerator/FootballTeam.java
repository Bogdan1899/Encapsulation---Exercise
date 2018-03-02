package footballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam {

    private String name;

    private int rating;

    private List<Player> players;

    public FootballTeam(String name) {
        this.setName(name);
        this.setPlayers(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        this.setRating();
        return rating;
    }

    public void setRating() {
        int allSkills = 0;

        for (Player player : players) {
            allSkills += player.getOverallSkill();
        }

        this.rating = allSkills;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        this.getPlayers().add(player);
    }

    public void removePlayer(String playerName){
        Player playerToRemove = null;
        boolean isFound = false;

        for (Player player : players) {
            if (player.getName().equals(playerName)){
                playerToRemove = player;
                isFound = true;
                break;
            }
        }

        if (isFound){
            this.getPlayers().remove(playerToRemove);
        } else {
            System.out.printf("Player %s is not in %s team.\n", playerName, this.getName());
        }
    }
}
