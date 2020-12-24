package attacks.seedot;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    public SwordsDance(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    public String describe() {
        return "применяет Sword Dance";
    }
}
