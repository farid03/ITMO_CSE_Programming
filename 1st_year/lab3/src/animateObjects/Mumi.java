package animateObjects;

import locations.Location;

public class Mumi extends Personage implements Communicatable, Movable {
    public Mumi(){

    }

    public Mumi(String name){
        super(name);
    }

    public Mumi(String name, Location location){
        super(name, location);
    }

    @Override
    public void moveTo(Location location) {
        this.setLocation(location);
        System.out.println(this.getName() + " прополз в локацию " + this.getLocation().getName() + ". ");
    }

    @Override
    public void speak(){
        System.out.println("Меня зовут " + this.getName() + "! ");
    }

    @Override
    public void nod(){
        System.out.println("Да...");
    }
}
