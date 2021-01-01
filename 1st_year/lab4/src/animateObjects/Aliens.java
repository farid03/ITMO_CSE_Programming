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

    public class Bag extends InnanimateObject implements Movable {
        private InnanimateObject locationat;

        public Bag(){

        }

        public Bag(String name){
            super(name);
        }

        public Bag(String name, Location location) {
            super(name, location);
        }

        public InnanimateObject getLocationat() {
            return this.locationat;
        }

        public void setLocationatMat() {
            this.locationat = mat;
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

        @Override
        public int hashCode() {
            return this.getName().length();
        }

        InnanimateObject mat = new InnanimateObject("подстилка") {
            @Override
            public Location getLocation() {
                return super.getLocation();
            }

            @Override
            public void setLocation(Location location) {
                super.setLocation(location);
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }

            @Override
            public String getName() {
                return super.getName();
            }
        };
    }
}
