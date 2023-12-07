import org.Frank.Hero;
import org.Frank.Squad;
import org.junit.jupiter.api.Test;

public class SquadTest {

    @Test
    private Hero setupNewHero() {
        return new Hero("Flash", 18, "Speed", "light");
    }

    @Test
    private Squad setupNewSquad(Hero hero) {
        return new Squad("The Invincibles", "Safe City", hero);
    }

    @Test
    public void squadInstancedCorrectly() {
        Squad squad = setupNewSquad(setupNewHero());
        assertTrue(true);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void getSquadName() {
        Squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad.getName() != null);
    }

    @Test
    public void getSquadCause() {
        Squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad.getCause() != null);
    }
}
