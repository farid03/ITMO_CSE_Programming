package attacks.tyrogue;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    public String describe(){
        return "применяет Work Up";
    }
}
