package inanimateObjects;

import locations.Location;

import java.util.Objects;

abstract public class InnanimateObject {
    private String name;
    private Location location;

    public InnanimateObject(){

    }

    public InnanimateObject(String name){
        this.name = name;
    }

    public InnanimateObject(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "InnanimateObject{"
                + "Name='" + this.getName() + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnanimateObject that = (InnanimateObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
