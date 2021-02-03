package Data;

import Competition.Player;
import Competition.Ranking;
import Competition.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LigaSantander {

    private static Team createTeam (String name, String icon, List<Player> players){
        Team team = new Team();
        team.setName(name);
        team.setIcon(icon);
        team.setPlayerList(players);
        return team;
    }

    public static void main(String[] args) {
        Team Barcelona = createTeam("Barcelona", "myIcon.png",new ArrayList<>());
        Team Madrid = createTeam("Madrid", "myIcon2.png",new ArrayList<>());
        Team Atletico = createTeam("Atletico", "myIcon3.png",new ArrayList<>());
        Team Real_Sociedad = createTeam("Real_Sociedad", "myIcon4.png",new ArrayList<>());
        Team Sevilla = createTeam("Sevilla", "myIcon5.png",new ArrayList<>());
        Team Villareal = createTeam("Villareal", "myIcon6.png",new ArrayList<>());
        Team Granada = createTeam("Granada", "myIcon7.png",new ArrayList<>());
        Team Celta = createTeam("Celta", "myIcon8.png",new ArrayList<>());
        Team Cadiz = createTeam("Cadiz", "myIcon9.png",new ArrayList<>());
        Team Betis = createTeam("Betis", "myIcon10.png",new ArrayList<>());
        Team Bilbao = createTeam("Bilbao", "myIcon11.png",new ArrayList<>());
        Team Levante = createTeam("Levante", "myIcon12.png",new ArrayList<>());
        Team Getafe= createTeam("Getafe", "myIcon13.png",new ArrayList<>());
        Team Alaves = createTeam("Alaves", "myIcon14.png",new ArrayList<>());
        Team Eibar = createTeam("Eiber", "myIcon15.png",new ArrayList<>());
        Team Valencia = createTeam("Valencia", "myIcon16.png",new ArrayList<>());
        Team Elche = createTeam("Elche", "myIcon17.png",new ArrayList<>());
        Team Valladolid = createTeam("Valladolid", "myIcon18.png",new ArrayList<>());
        Team Osasuna = createTeam("Osasuna", "myIcon19.png",new ArrayList<>());
        Team Huesca = createTeam("Huesca", "myIcon20.png",new ArrayList<>());


    }

    //Vamos a Jugar un partido

    }


