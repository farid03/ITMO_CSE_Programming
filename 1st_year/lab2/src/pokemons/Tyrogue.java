package pokemons;

import attacks.tyrogue.Bulldoze;
import attacks.tyrogue.RockSlide;
import attacks.tyrogue.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level) {
        super(name, level);
        setStats(35, 35, 35, 35, 35, 35);
        setType(Type.FIGHTING);
        setMove(new RockSlide(), new Bulldoze(), new WorkUp());

    }
}