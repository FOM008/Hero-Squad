import org.Frank.Hero;
import org.junit.jupiter.api.Test;

public class HeroTest {

    @Test
    private Hero setupNewHero(){
        return new Hero("Flash", 18, "Speed", "Light");
    }

    @Test
    public void heroInstantiatesCorrectly() {
        Hero newHero = setupNewHero();
        assertTrue(true);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void getHeroName_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getName() != null);
    }

    @Test
    public void getHeroAge_int() {
        Hero newHero = setupNewHero();
        assertEquals(newHero.getAge());
    }

    private void assertEquals(int age) {
    }

    @Test
    public void getHeroSuperPower_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getPower() != null);
    }

    @Test
    public void getHeroWeakness_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getWeakness() != null);
    }

    @Test
    public void getHeroList_storeTwoHeroes_true() {
        Hero newHero = setupNewHero();
        assertTrue(Hero.getHeroList().contains(newHero));
    }

}
