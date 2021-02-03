package Competition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ranking {
    private List<Team> teamList;
    private Integer TeamPoints;
    private Integer position;
    private Integer rankDate;
    private Integer TeamPosition;

    public Integer getTeamPosition() {
        return TeamPosition;
    }

    public void setTeamPosition(Integer teamPosition) {
        TeamPosition = teamPosition;
    }

    public Integer getRankDate() {
        return rankDate;
    }

    public void setRankDate(Integer rankDate) {
        this.rankDate = rankDate;
    }

    public Team getGetRank() {
        return getRank;
    }

    public void setGetRank(Team getRank) {
        this.getRank = getRank;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }


    public Integer getTeamPoints() {
        return TeamPoints;
    }

    public void setTeamPoints(Integer teamPoints) {
        TeamPoints = teamPoints;
    }

    public Integer getPosition() {
        return position;
    }


    public void setPosition(Integer position) {
        this.position = position;
    }

    public Team getRank;

    { //Creamos la clasificacion de los 20 equipos de la liga con sus respectivos puntos
        public void mostrarClasificaciones ()
        {
            // Toma un set de las claves para iterar y una copia de la clasificacion
            HashMap<Team, Integer> hashMap = new HashMap<Team, Integer>(position);
            Set<Team> setEquipos = getRank.keySet();
            int puntosMax = 0;
            Team team = null;
            String clasi = "\nCLASIFICACION DE LA LIGA, JORNADA " + (currentMatch + 1);
            clasi += "\nNOMBRE\t\tpuntos\tPJ\tPG\tPE\tPP\tGF\tGC\tGAVG";
            for (int i = 0; i < position.size(); i++) {
                TeamPoints = 0;
                team = null;
                for (Team team1 : setTeamList()) ;
                {
                    // Toma los puntos de ese equipo para compararlos, si el equipo aun no se ha mostrado en la clasificacion
                    if (hashMap.containsKey(team)) {
                        int puntosEquipo = getRank.get(team).getPuntos();
                        // Si los puntos son mayores o no hay ningun equipo guardado como maximo, lo guarda
                        if (puntosEquipo > puntosMax || TeamPoints == null) {
                            puntosMax = puntosEquipo;
                            Team = team;
                        }
                        // Si empatan a puntos, el primer factor de desempate es la diferencia de goles (gol average)
                        else if (puntosEquipo == puntosMax) {
                            if (position.get(team).getDiferenciaDeGoles() > position.get(Team).getDiferenciaDeGoles()) {
                                puntosMax = puntosEquipo;
                                TeamPoints = team;
                            }
                            // El segundo factor de desempate son los goles marcados
                            else if (position.get(team).getDiferenciaDeGoles() == position.get(TeamPoints).getDiferenciaDeGoles()) {
                                if (position.get(team).getGolesAFavor() > position.get(TeamPoints).getGolesAFavor()) {
                                    puntosMax = puntosEquipo;
                                    TeamPoints = team;
                                }
                            }
                        }
                    }
                }
                clasi += "\n" + TeamPoints.getClass() + " ->\t" + position.get(TeamPoints).toString();
                hashMap.remove(TeamPoints);
            }
            System.out.println(clasi);
        }
        private void actualizaClasificacion (HashMap < Team, TeamPosition > TeamPosition)
        {
            // Genera un set con las keys para iterar por el hashmap
            Set<Team> setEquipos = TeamPosition.keySet();
            for (Team equipo : setEquipos) {
                // A cada clasificacion del equipo le pasa el resultado en formato ClasificacionEquipo para que la actualize
                TeamPosition temporal = position.get(teamList);
                temporal.sumaEstadisticas(TeamPosition.get(teamList));
            }
        }

    }

    public Ranking() {
        // initialise instance variables
        this.TeamPoints = TeamPoints;

    }


    public Ranking(int TeamPoints) {
        // initialise instance variables
        this.TeamPoints = TeamPoints;

    }

    /**
     * Suma las estadisticas pasadas como parametro a este objeto clasificacion.
     *
     * @param sumaEstadisticas Estadisticas a sumar a este objeto.
     */
    public void sumaEstadisticas(Ranking sumaEstadisticas) {
        TeamPosition += sumaEstadisticas.getTeamPoints();

    }

    /**
     * Devuelve los puntos del equipo
     *
     * @return los puntos del equipo
     */
    public int getPuntos() {
        return TeamPoints;
    }

}

