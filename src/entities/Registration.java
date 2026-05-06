package entities;

import java.util.ArrayList;
import java.util.List;

public class Registration {

    private Long registrationId;
    private Race race;
    private Racer racer;



    public Registration(Long registrationId, Race race, Racer racer){
        this.registrationId = registrationId;
        this.race = race;
        this.racer = racer;

    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Racer getRacer() {
        return racer;
    }

    public void setRacer(Racer racer) {
        this.racer = racer;
    }

}
