package inanimateObjects;

import animateObjects.Movable;
import locations.Location;

public class Bag extends InnanimateObject implements Movable {
    private InnanimateObject locationat;
    public Bag(){

    }

    public Bag(String name){
        super(name);
    }

    public Bag(String name, Location location, InnanimateObject locationat) {
        super(name, location);
        this.locationat = locationat;
    }

    public InnanimateObject getLocationat() {
        return this.locationat;
    }

    public void setLocationat(InnanimateObject locationat) {
        this.locationat = locationat;
    }

    public void showLocations(){
        System.out.println(this.getName() + " находится в локации " + this.getLocation().getName() +
                " на объекте " + this.getLocationat().getName() + ". ");
    }

    @Override
    public void moveTo(Location location){
        this.setLocation(location);
        System.out.println(this.getName() + " перемещен в локацию " + this.getLocation().getName() + ". ");
    }
    @Override
    public String toString() {
        return "Bag{"
                + "Name='" + this.getName() + '\''
                + ", location=" + this.getLocation().getName()
                + '}';
    }
}
