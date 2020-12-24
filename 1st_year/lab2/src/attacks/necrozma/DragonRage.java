package attacks.necrozma;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove{
    public DragonRage(){
        super(Type.DRAGON, 0, 1);
    }

    @Override
    public String describe() {
        return "применяет Dragon Rage";
    }
}
