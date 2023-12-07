package org.Frank;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    String squadName;
    String squadCause;
    int squadID;
    private static final List<Squad> squadList = new ArrayList<>();

    public Squad(String name, String cause, Hero hero) {
        squadName = name;
        squadCause = cause;

    }

    public String getName() {
        return squadName;
    }

    public String getCause() {
        return squadCause;
    }

    public static List<Squad> getSquadsList() {
        return squadList;
    }


}