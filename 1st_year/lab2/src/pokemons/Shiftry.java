package pokemons;

import attacks.seedot.DoubleTeam;
import attacks.seedot.Facade;
import attacks.seedot.Growth;
import attacks.seedot.SwordsDance;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Nuzleaf {
    public Shiftry(String name, int level) {
        super(name, level);
        setStats(90, 100, 60, 90, 60, 80);
        setType(Type.GRASS, Type.DARK);
        setMove(new SwordsDance(), new DoubleTeam(), new Growth(), new Facade());

    }
}