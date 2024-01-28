package Block.OOP.Heroes;

import Block.OOP.TypeOfHeroes.MeleeHero;
import Block.OOP.Vector2;

public class Pikeman extends MeleeHero {

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY, 1);
        Vector2 position;
    }

    @Override
    public String toString() {
        return ("Пикман: " + super.toString());
    }
    @Override
    public String getInfo() {
        return "Пикман";
    }
}
