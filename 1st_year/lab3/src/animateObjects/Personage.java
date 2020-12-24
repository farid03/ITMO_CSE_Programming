package animateObjects;

import locations.Location;

import java.util.Objects;

abstract public class Personage {
    private String name;
    private Location location;
    private PersonageStatus status = PersonageStatus.NORMAL;
    public Personage(){

    }

    public Personage(String personageName) {
        this.name = personageName;
    }

    public Personage(String personageName, Location location) {
        this.name = personageName;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return this.location;
    }

    public PersonageStatus getStatus() {
        return status;
    }

    public void setStatus(PersonageStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Personage{"
                + "Name='" + this.getName() + '\''
                + ", location=" + this.getLocation().getName()
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personage personage = (Personage) o;
        return Objects.equals(name, personage.name) &&
                Objects.equals(location, personage.location) &&
                status == personage.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, status);
    }
}
