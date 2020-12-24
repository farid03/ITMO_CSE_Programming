package attacks.tyrogue;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){
        super(Type.NORMAL, 40, 1, +1, 1);
    }

    @Override
    public String describe(){
        return "применяет Quick Attack";
    }
}
