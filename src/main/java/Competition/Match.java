package Competition;

import java.util.Date;

public class Match {
    private Team localTeam;
    private Team visitorTeam;
    private Integer localScore;
    private Integer visitorScore;
    private Date matchDate;
    private Integer winnerPoints = 3;
    private Integer loserPoints = 0;
    private Integer drawPoints = 1;
    private String referee;

    public Match(Team localTeam, Team visitorTeam)
    {
        this.localTeam = localTeam;
        this.visitorTeam = visitorTeam;
        // Los goles se setean en -1 por ser valores no validos hasta que se generen
        localScore = -1;
        visitorScore = -1;
    }
    //Cuando se realice un partido queremos saber quien es el ganador
    public Team getWinner() {
        try {
            if (localScore.equals(visitorScore)) {
                return null;

            }
            if (localScore > visitorScore) {
                return localTeam;


            } else {
                return visitorTeam;
            }
        } catch (Exception e) {
            return null;
        }
    }

    //Finalizado el partido vamos a hacer el reparto de puntos dependiendo del marcador Final
    public Team getPoints() {
        try {
            if (localScore.equals(visitorScore)) {
                localTeam = drawPoints;
                visitorTeam = drawPoints;


            }
            if (localScore > visitorScore) {
                localTeam = winnerPoints;
                visitorTeam = loserPoints;


            } else {
                visitorTeam = winnerPoints;
                localTeam = loserPoints;
            }
        } catch (Exception e) {
            return null;


        }

    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Integer getLocalScore() {
        return localScore;
    }

    public void setLocalScore(Integer localScore) {
        this.localScore = localScore;
    }

    public Integer getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(Integer visitorScore) {
        this.visitorScore = visitorScore;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Integer getWinnerPoints() {
        return winnerPoints;
    }

    public void setWinnerPoints(Integer winnerPoints) {
        this.winnerPoints = winnerPoints;
    }

    public Integer getLoserPoints() {
        return loserPoints;
    }

    public void setLoserPoints(Integer loserPoints) {
        this.loserPoints = loserPoints;
    }

    public Integer getDrawPoints() {
        return drawPoints;
    }

    public void setDrawPoints(Integer drawPoints) {
        this.drawPoints = drawPoints;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}