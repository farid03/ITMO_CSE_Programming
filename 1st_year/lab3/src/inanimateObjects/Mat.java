package inanimateObjects;

import animateObjects.Movable;
import locations.Location;

public class Mat extends InnanimateObject implements Movable {
    public Mat() {

    }

    public Mat(String matName) {
        super(matName);
    }

    public Mat(String name, Location location) {
        super(name, location);
    }

    @Override
    public void moveTo(Location location){
        this.setLocation(location);
        System.out.println(this.getName() + " перемещен в локацию " + this.getLocation().getName() + ". ");
    }

}
