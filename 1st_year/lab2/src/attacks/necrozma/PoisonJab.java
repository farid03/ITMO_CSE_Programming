package attacks.necrozma;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(){
        super(Type.POISON, 80, 1);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        if (Math.random() >= 0.7) Effect.poison(p);
    }

    @Override
    public String describe(){
        return "применяет Poison Jab";
    }

}
