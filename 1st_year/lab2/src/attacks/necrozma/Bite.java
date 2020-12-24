package attacks.necrozma;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove{
    public Bite(){
        super(Type.DARK, 60, 1);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        if (Math.random() >= 0.7) {
            Effect.flinch(p);
        }else{
            super.applyOppEffects(p);
        }
    }

    @Override
    public String describe() {
        return "применяет Bite";
    }
}
