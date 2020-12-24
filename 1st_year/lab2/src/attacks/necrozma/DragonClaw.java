package attacks.necrozma;

import ru.ifmo.se.pokemon.*;

public class DragonClaw extends PhysicalMove{
    public DragonClaw(){
        super(Type.DRAGON, 80, 1);
    }

    @Override
    public String describe(){
        return "применяет Dragon Claw";
    }

}
