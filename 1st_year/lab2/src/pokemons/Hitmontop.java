package pokemons;

import attacks.tyrogue.Bulldoze;
import attacks.tyrogue.QuickAttack;
import attacks.tyrogue.RockSlide;
import attacks.tyrogue.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Hitmontop extends Tyrogue {
    public Hitmontop(String name, int level) {
        super(name, level);
        setStats(50, 95, 95, 35, 110, 70);
        setType(Type.FIGHTING);
        setMove(new RockSlide(), new Bulldoze(), new WorkUp(), new QuickAttack());

    }
}