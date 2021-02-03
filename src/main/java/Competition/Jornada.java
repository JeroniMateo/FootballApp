package Competition;

import java.util.ArrayList;
import java.util.Collections;

public class Jornada {
    // Una jornada se compone de una serie de partidos que enfrentan a los equipos entre si
    private ArrayList<Match> matches;

    /**
     * Crea objetos del tipo jornada con los equipos introducidos como parametro
     */
    public Jornada(ArrayList<Team> equipos) {
        // initialise instance variables
        matches = new ArrayList();
        // Empareja los equipos dos a dos sin repetir de forma aleatoria,
        // mezclando primero los equipos
        Collections.shuffle(equipos);
        int index = 0;
        // Toma los equipos dos a dos para el emparejamiento
        while (index < equipos.size()) {
            matches.add(new Match(Team.get(index), equipos.get(index + 1)));
            index += 2;
        }
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
}
