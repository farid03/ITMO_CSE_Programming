package attacks.tyrogue;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 1);
    }

    public void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }

    @Override
    public String describe(){
        return "применяет Bulldoze";
    }
}
