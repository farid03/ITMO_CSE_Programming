package pokemons;

import attacks.necrozma.Bite;
import attacks.necrozma.DragonClaw;
import attacks.necrozma.DragonRage;
import attacks.necrozma.PoisonJab;
import ru.ifmo.se.pokemon.*;

public class Necrozma extends Pokemon {
    public Necrozma(String name, int level) {
        super(name, level);
        setStats(97, 107, 101, 127, 89, 79);
        setType(Type.PSYCHIC);
        setMove(new DragonRage(), new PoisonJab(), new Bite(), new DragonClaw());

    }
}