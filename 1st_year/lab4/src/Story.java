import animateObjects.*;
import locations.*;
import exceptions.*;

public class Story {
    public static void main(String[] args) {
        Location bush = new Bush("куст");
        Location outdoor = new Outdoor("улица");
        Aliens tofsla = new Aliens("Тофсла", bush);
        Aliens.Bag suitcase = tofsla.new Bag("Чемодан", bush);

        suitcase.setLocationatMat();
        Aliens vifsla = new Aliens("Вифсла", bush, suitcase);

        Aliens.Bag suitcase1 = vifsla.new Bag("Чемодан1", bush);
        tofsla.setBag(suitcase1);

        Mumi mumiTroll = new Mumi("Муми-тролль", outdoor);
        try {
            tofsla.checkStatus();
            vifsla.checkStatus();
            mumiTroll.checkStatus();

            tofsla.nod(vifsla);
            bush.setCoverage(Surface.FLUFF);
            bush.setLight(Lighting.DARKLY);
            mumiTroll.moveTo(bush);
            Location.Locator.whereAre(mumiTroll, tofsla, vifsla);
            bush.showCoverage();
            bush.showLighting();
            suitcase.showLocations();
        } catch (LightingNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (PersonageStatusException e2){
            System.out.println(e2.getMessage());
        }
    }
}

