package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String name;
    private int maxSize;
    private String cause;
    private List<Hero> heroes;

    // Constructors, getters, setters

    public void addHero(Hero hero) {
        if (heroes.size() < maxSize) {
            heroes.add(hero);
        }
    }
}
