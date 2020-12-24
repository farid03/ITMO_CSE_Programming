package attacks.seedot;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    public void applySelfEffects(Pokemon p){
        p.restore();
    }

    @Override
    public String describe(){
        return "применяет Double Team";
    }
}