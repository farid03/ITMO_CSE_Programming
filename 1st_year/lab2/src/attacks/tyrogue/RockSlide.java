package attacks.tyrogue;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 0.9);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        if (Math.random() >= 0.7) Effect.flinch(p);
    }

    @Override
    public String describe(){
        return "применяет Rock Slide";
    }
}
