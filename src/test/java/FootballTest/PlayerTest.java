package FootballTest;

import Competition.Helper.LeagueHelper;
import Competition.Player;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;


import java.util.List;
import java.util.logging.Logger;

@SpringBootTest
public class PlayerTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void generatePlayer(){
        List<Player> players = LeagueHelper.getRandomPlayers(10,"Juan","Antonio","",20);
        for (Player item :players){
            log.info(players.toString());
        }

    }
}
