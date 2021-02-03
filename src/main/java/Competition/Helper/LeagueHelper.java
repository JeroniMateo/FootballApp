package Competition.Helper;

import Competition.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class LeagueHelper {


        private static final Logger log = LoggerFactory.getLogger(LeagueHelper.class);

        public static List<Player> getRandomPlayers(int size, String baseName, String baseSurname, String item, Integer age ){
            List<Player> players = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Player player = new Player();
                player.setName(baseName + i);
                if (!baseSurname.equals("")) {
                    player.setSurname(baseSurname + i);
                }
                players.add(player);
            }
            return players;

        }
    }

