package Block.OOP.Interfaces;

import Block.OOP.TypeOfHeroes.Hero;
import java.util.ArrayList;

public interface GameI {
    void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllias);
}
