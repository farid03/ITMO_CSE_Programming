import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battleground{
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Necrozma("", 10));
        b.addAlly(new Tyrogue("", 10));
        b.addAlly(new Hitmontop("", 10));
        b.addAlly(new Seedot("", 10));
        b.addAlly(new Nuzleaf("", 10));
        b.addFoe(new Shiftry("111111", 100));
        try {
            b.go();
        } catch (NullPointerException e1){
            System.out.printf("\n%23s%n", "Ошибка!");
            System.out.print("Распределите покемонов по разным командам!\n");
            }

    }
}
