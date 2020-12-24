package attacks.seedot;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;

public class Facade extends PhysicalMove{

    public Facade(){
        super(Type.NORMAL, 70, 1);
    }
   @Override
   public void applyOppEffects(Pokemon p){
       Effect.burn(p);
       Effect.sleep(p);
       Effect.freeze(p);
      }

    @Override
    public String describe(){
        return "применяет Facade";
    }
}
