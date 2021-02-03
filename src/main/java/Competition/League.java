package Competition;

import java.util.*;

public class League {
    private List<Team> teamList;
    private List<Match> matchList;
    private Team winner;
    private Integer year;
    private Calendar matchCalendar;

    public Calendar getMatchCalendar() {
        return matchCalendar;
    }

    public void setMatchCalendar(Calendar matchCalendar) {
        this.matchCalendar = matchCalendar;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    // Equipos que juegan la liga
    private ArrayList<Team> teams;
    // Jornadas que componen la liga
    private ArrayList<Calendar> calendars;
    // El nombre de los equipos sera "equipo" + un numero
    public static final String NOMBRE ="Equipo";
    // Recoje las puntuaciones de cada equipo para hacer la clasificacion
    private HashMap<Team,Ranking> rankingHashMap;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(ArrayList<Calendar> calendars) {
        this.calendars = calendars;
    }

    public static String getNOMBRE() {
        return NOMBRE;
    }

    public HashMap<Team, Ranking> getRankingHashMap() {
        return rankingHashMap;
    }

    public void setRankingHashMap(HashMap<Team, Ranking> rankingHashMap) {
        this.rankingHashMap = rankingHashMap;
    }

    public int getCurrentMatch() {
        return currentMatch;
    }

    public void setCurrentMatch(int currentMatch) {
        this.currentMatch = currentMatch;
    }

    // Marca la jornada actual en la que se encuentra la liga
    private int currentMatch;
}



