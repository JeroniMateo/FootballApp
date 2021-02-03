package Competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private List<Player> playerList;
    private String name;
    private String icon;
    private Integer points;
    private Ranking ranking;
    private Integer playerNum;

    public Integer getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(Integer playerNum) {
        this.playerNum = playerNum;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Team(String name, int playerNum)
    {
        this.name = name;
        Random rnd = new Random();
        int clave = rnd.nextInt(playerNum - 2) + 2;
        Player player = new ArrayList<playerList>();
        int crack = rnd.nextInt(playerNum*2);
        boolean esCrack = false;
        for (int i = 1; i<=playerNum; i++){
            if(i == crack)
            {
                esCrack = true;
            }
            else
            {
                esCrack = false;
            }
        }
    }
}
