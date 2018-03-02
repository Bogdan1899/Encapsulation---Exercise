package footballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FootballTeamGenerator {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        List<FootballTeam> footballTeams = new ArrayList<FootballTeam>();

        String[] inputArgs = bfr.readLine().split(";");

        while (!inputArgs[0].equals("END")){
            String command = inputArgs[0];
            String teamName = inputArgs[1];
            String playerName;
            FootballTeam footballTeam;

            try {
                switch (command){
                    case "Team":
                        footballTeam = new FootballTeam(teamName);
                        footballTeams.add(footballTeam);
                        break;
                    case "Add":
                        playerName = inputArgs[2];
                        int endurance = Integer.parseInt(inputArgs[3]);
                        int sprint = Integer.parseInt(inputArgs[4]);
                        int dribble = Integer.parseInt(inputArgs[5]);
                        int passing = Integer.parseInt(inputArgs[6]);
                        int shooting = Integer.parseInt(inputArgs[7]);

                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

                        boolean isAdded = false;

                        for (FootballTeam team : footballTeams) {
                            if (team.getName().equals(teamName)){
                                team.addPlayer(player);
                                isAdded = true;
                                break;
                            }
                        }

                        if (!isAdded){
                            System.out.printf("Team %s does not exist.\n", teamName);
                        }
                        break;
                    case "Remove":
                        playerName = inputArgs[2];

                        for (FootballTeam team : footballTeams) {
                            if (team.getName().equals(teamName)){
                                team.removePlayer(playerName);
                            }
                        }
                        break;
                    case "Rating":
                        boolean isFound = false;

                        for (FootballTeam team : footballTeams) {
                            if (team.getName().equals(teamName)){
                                System.out.printf("%s - %d\n", teamName, team.getRating());
                                isFound = true;
                                break;
                            }
                        }

                        if (!isFound){
                            System.out.printf("Team %s does not exist.\n", teamName);
                        }
                        break;
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            inputArgs = bfr.readLine().split(";");
        }
    }
}