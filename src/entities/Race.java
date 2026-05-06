package entities;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Long raceId;
    private String raceName;
    private String date;
    private String location;
    private Double distance;
    private List<Sponsor> sponsors = new ArrayList<>();

    public Race(Long raceId, String raceName, String date, String location, Double distance) {
        this.raceId = raceId;
        this.raceName = raceName;
        this.date = date;
        this.location = location;
        this.distance = distance;
    }

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

}
