package Competition;

import java.util.*;

public class Calendar {
    private List<Team> TeamMatch;
    private List<Match> match;
    private Date matchdate;
    private Integer jornada;

    public Integer getJornada() {
        return jornada;
    }

    public Date getMatchdate() {
        return matchdate;
    }

    public void setMatchdate(Date matchdate) {
        this.matchdate = matchdate;
    }

    public void setJornada(Integer jornada) {
        this.jornada = jornada;
    }

    public List<Team> getTeamMatch() {
        return TeamMatch;
    }

    public void setTeamMatch(List<Team> teamMatch) {
        TeamMatch = teamMatch;
    }

    public List<Match> getMatch() {
        return match;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }



    //Creamos el calendario formado por 38 jornadas que integran 10 partidos
    public void generaJornadas() {
        String[] TeamMatch = {}; //Creamos un string con los equipos
        ArrayList<Team> teamday = new ArrayList<Team>();


        for (int i = 0; i < 38; i++) { //Creamos las 38 jornadas

            for (int j = 0; j < 10; j++) { //Creamos los 10 partidos de cada jornada de forma aleatoria

                //Finalmente creamos los emparejamientos de los equipos

                //Elegimos 2 equipos diferentes los cuales seran los rivales de un partido

                    int indice = 0;
                    int index = 0;
                    boolean addDate = true;
                    Date matchdate = null;
                    while(indice < (Team.size() - 1))
                    {
                        // Genera una jornada
                        jornada = new Date(Team);
                        // Comprueba que no exista en el arraylist una incompatible. Si no hay incompatibles la añade
                        addDate = true;
                        index = 0;
                        while(index < jornada.size() && addDate)
                        {
                            // Si devuelve true, son compatibles y sigue comprobando. En cuanto encuentre uno no compatible termina el bucle
                            addDate = jornada.get(index).compatibles(jornada);
                            index++;
                        }
                        // Si la nueva jornada es compatible con todas, se añade
                        if(addDate)
                        {
                            jornada.add(jornada);
                            indice++;
                        }
                    }
                }
            }

            }


        }

