package exceptions;

public class LightingNotFoundException extends RuntimeException {
    private String locationName;

    public LightingNotFoundException() {
    }

    public LightingNotFoundException(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String getMessage() {
        return "В локации " + locationName + " освещение не задано. ";
    }
}

