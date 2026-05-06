package controller;

import entities.Race;
import entities.Racer;
import entities.Registration;
import entities.Sponsor;

import java.util.ArrayList;
import java.util.List;

public class EventController {

    private List<Racer> racers = new ArrayList<>();
    private List<Race> races = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public void addRacer(Racer racer) {
        this.racers.add(racer);
        System.out.println("Racer added successfully!");
    }

    public void addRace(Race race) {
        if (sponsors.isEmpty()) {
            System.out.println("No sponsor registered yet.");
            return;
        }

        this.races.add(race);
        System.out.println("Race added successfully!");
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
        System.out.println("Sponsor added successfully!");
    }

    public void raceRegistration(Long registrationId, Long raceId, Long racerId) {
        Race race = null;
        Racer racer = null;

        for (Race r : races) {
            if (r.getRaceId().equals(raceId)) {
                race = r;
                break;
            }
        }

        for (Racer rc : racers) {
            if (rc.getRacerId().equals(racerId)) {
                racer = rc;
                break;
            }
        }

        if (race == null || racer == null) {
            System.out.println("Race or Racer not found!");
            return;
        }

        registrations.add(new Registration(registrationId, race, racer));
        System.out.println("Registration successful!");

    }

    public void addSponsorToRace(Long raceId, Long sponsorId) {

        Race race = null;
        Sponsor sponsor = null;

        for (Race r : races) {
            if (r.getRaceId().equals(raceId)) {
                race = r;
                break;
            }
        }

        for (Sponsor s : sponsors) {
            if (s.getId().equals(sponsorId)) {
                sponsor = s;
                break;
            }
        }

        if (race == null || sponsor == null) {
            System.out.println("Race or Sponsor not found!");
            return;
        }

        race.addSponsor(sponsor);
        System.out.println("Sponsor added to race!");
    }

    public void listAllRaces() {
        if (races.isEmpty()) {
            System.out.println("No races registered yet.");
            return;
        }
        for (Race r : races) {
            System.out.println("ID: " + r.getRaceId()
                    + "\nNAME: " + r.getRaceName()
                    + "\nDATE: " + r.getDate()
                    + "\nLOCATION: " + r.getLocation()
                    + "\nDISTANCE: " + r.getDistance() + "km");

            System.out.println("Sponsors: ");
            if (r.getSponsors().isEmpty()) {
                System.out.println("No sponsors for this race.");
            } else {
                for (Sponsor s : r.getSponsors()) {
                    System.out.println("- " + s.showDetails());
                }

            }

            System.out.println("-----------------------");
        }
    }

    public void listAllRacers() {
        if (racers.isEmpty()) {
            System.out.println("No racers registered yet.");
            return;
        }
        for (Racer r : racers) {
            System.out.println("ID: " + r.getRacerId()
                    + "\nNAME: " + r.getRacerName()
                    + "\nAGE " + r.getAge()
                    + "\n-----------------------");
        }
    }

    public void listAllRegistration() {
        if (registrations.isEmpty()) {
            System.out.println("No registration yet.");
            return;
        }
        for (Registration reg : registrations) {
            System.out.println("REGISTRATION ID: " + reg.getRegistrationId()
                    + "\nRACE ID: " + reg.getRace().getRaceName()
                    + "\nRACER ID: " + reg.getRacer().getRacerName()
                    + "\n-----------------------");
        }
    }

    public void listAllSponsors() {
        if (sponsors.isEmpty()) {
            System.out.println("No sponsors registered.");
            return;
        }

        for (Sponsor s : sponsors) {
            System.out.println(s.showDetails());
            System.out.println("---------------------");
        }
    }
}
