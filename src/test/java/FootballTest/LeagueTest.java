package FootballTest;

import Competition.Player;
import Competition.Team;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.List;
import java.util.logging.Logger;

public class LeagueTest {

        private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

        @Test
        void testArrayCollection() {
            List<Player> data = com.studentsfp.devenvironment.unittesting.data.p1.data.Competition.LeagueHelper.getRandomPlayers(10, "Pepito ", null);
            for (Player item : data) {
                log.info(data.toString());
            }
            Team team = new Team();
            team.setPlayerList(data);
            log.info("fin");
        }

        @Test
        void testLinkedListCollection() {

        }

    }

