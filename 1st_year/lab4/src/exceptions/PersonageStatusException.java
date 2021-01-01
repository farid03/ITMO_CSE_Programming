package exceptions;

import animateObjects.Personage;

public class PersonageStatusException extends Exception {
    private String personageName;

    public PersonageStatusException() {
    }


    public PersonageStatusException(String personageName) {
        this.personageName = personageName;
    }

    @Override
    public String getMessage(){
        return "Статус персонажа " + this.personageName + " не задан! ";
    }
}
