package attacks.seedot;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove{
    public Growth(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    public String describe(){
        return "применяет Growth";
    }
}
