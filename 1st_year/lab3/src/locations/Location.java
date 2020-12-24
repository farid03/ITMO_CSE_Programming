package locations;

import animateObjects.Personage;
import inanimateObjects.InnanimateObject;

import java.util.Objects;

abstract public class Location {
    private String name;
    private Surface coverage;
    private Lighting light;

    public Location() {
    }

    public Location(String name) {
        this.name = name;
    }

    public Location(String name, Surface coverage) {
        this.name = name;
        this.coverage = coverage;
    }

    public Location(String name, Surface coverage, Lighting light) {
        this.name = name;
        this.coverage = coverage;
        this.light = light;
    }

    public void showCoverage() {
        switch (this.getCoverage()) {
            case CLEAR:
                System.out.print("В локации " + this.getName() + " покрытие чисто. ");
                break;
            case DIRTY:
                System.out.print("В локации " + this.getName() + " покрытие грязно. ");
                break;
            case FLUFF:
                System.out.print("Локация " + this.getName() + " покрытие в пуху. ");
                break;
            case GRASS:
                System.out.print("Локация " + this.getName() + " покрытие в траве. ");
                break;
            default:
                System.out.println("В локации " + this.getName() + " покрытие не задано. ");
        }
    }
    public void showLighting() {
        switch (this.getLight()) {
            case DARKLY:
                System.out.println("В локации " + this.getName() + " темно. ");
                break;
            case NORMAL:
                System.out.println("В локации " + this.getName() + " нормальное освещение. ");
                break;
            case SHINING:
                System.out.println("В локации " + this.getName() + " очень светло. ");
                break;
            default:
                System.out.println("В локации " + this.getName() + " освещение не задано. ");
        }
    }
    public static void whereAre(Personage... personages) {
        boolean flag = true;
        Location location0 = personages[0].getLocation();
        for (Personage p: personages){
            if (location0 != p.getLocation()){
                flag = false;
            }
        }
        if (flag) {
            for (Personage p: personages){
                System.out.print(p.getName() + " ");
            }
            System.out.println("находятся в локации " + location0.getName() + ". ");
        } else {
            for (Personage p: personages){
                System.out.println(p.getName() + " находится в локации " + p.getLocation().getName() + ". ");
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Surface getCoverage() {
        return coverage;
    }

    public void setCoverage(Surface coverage) {
        this.coverage = coverage;
    }

    public Lighting getLight() {
        return light;
    }

    public void setLight(Lighting light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", coverage=" + coverage +
                ", light=" + light +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) &&
                coverage == location.coverage &&
                light == location.light;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coverage, light);
    }
}