import animateObjects.*;
import inanimateObjects.*;
import locations.*;

public class Story {
    public static void main(String[] args) {
        Location bush = new Bush("куст");
        InnanimateObject mat = new Mat("подстилка", bush);
        Bag suitcase = new Bag("Чемодан", bush, mat);
        Location outdoor = new Outdoor("улица");
        Aliens tofsla = new Aliens("Тофсла", bush, suitcase);
        Aliens vifsla = new Aliens("Вифсла", bush, suitcase);
        Mumi mumiTroll = new Mumi("Муми-тролль", outdoor);

        tofsla.nod(vifsla);
        bush.setCoverage(Surface.FLUFF);
        bush.setLight(Lighting.DARKLY);
        mumiTroll.moveTo(bush);
        Location.whereAre(mumiTroll, tofsla, vifsla);
        bush.showCoverage();
        bush.showLighting();
        suitcase.showLocations();
    }
}

