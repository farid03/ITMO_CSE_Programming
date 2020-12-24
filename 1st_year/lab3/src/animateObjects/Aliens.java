package animateObjects;

import inanimateObjects.InnanimateObject;
import locations.Location;

public class Aliens extends Personage implements Communicatable, Movable {
    private InnanimateObject bag;

    public Aliens(){

    }

    public Aliens(String name){
        super(name);
    }

    public Aliens(String name, Location location){
        super(name, location);
    }

    public Aliens(String name, Location location, InnanimateObject bag){
        super(name, location);
        this.bag = bag;
    }

    @Override
    public void nod() {
        System.out.println(this.getName() + " кивнул. ");
    }

    public void nod(Aliens personage) {
        System.out.println(this.getName() + " и " + personage.getName() + " кивнули. ");
    }

    @Override
    public void speak(){
        System.out.println("Привет-сла, я иностранец!");
    }

    @Override
    public void moveTo(Location location) {
        this.setLocation(location);
        System.out.println(this.getName() + " go to " + this.getLocation().getName());
    }

    public void setBag(InnanimateObject bag){
        this.bag = bag;
    }

    public InnanimateObject getBag() {
        return bag;
    }

    @Override
    public String toString() {
        return "Personage{"
                + "Name='" + this.getName() + '\''
                + ", location=" + this.getLocation().getName()
                + ", bag=" + this.getBag().getName()
                + '}';
    }
}
