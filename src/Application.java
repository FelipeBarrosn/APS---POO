import controller.EventController;
import entities.Race;
import entities.Racer;
import entities.Registration;
import entities.Sponsor;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Race Manager---");


        EventController eventController = new EventController();

        int opcao = 1;
        while (opcao != 0) {
            System.out.println("1 - New Sponsor");
            System.out.println("2 - List Sponsors");
            System.out.println("3 - New race.");
            System.out.println("4 - List races");
            System.out.println("5 - New Racer");
            System.out.println("6 - List racers");
            System.out.println("7 - Associate Sponsor with Race");
            System.out.println("8 - Race registration");
            System.out.println("9 - List registration");
            System.out.println("0 - Close.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Sponsor id: ");
                    Long sponsorId = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Sponsor name: ");
                    String sponsorName = sc.nextLine();
                    System.out.print("Sponsor cnpj: ");
                    String sponsorCnpj = sc.nextLine();
                    System.out.print("Sponsor contribution: ");
                    Double contributionValue = sc.nextDouble();

                    Sponsor sponsor = new Sponsor(sponsorId, sponsorName, sponsorCnpj, contributionValue);

                    eventController.addSponsor(sponsor);

                    break;

                case 2:
                    eventController.listAllSponsors();
                    break;
                case 3:
                    System.out.print("Race id: ");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Race name: ");
                    String raceName = sc.nextLine();
                    System.out.print("Race date: ");
                    String date = sc.nextLine();
                    System.out.print("Race location:");
                    String location = sc.nextLine();
                    System.out.print("Race distance: ");
                    Double distance = sc.nextDouble();

                    Race race = new Race(id, raceName, date, location, distance);

                    eventController.addRace(race);

                    break;
                case 4:
                    eventController.listAllRaces();
                    break;
                case 5:
                    System.out.print("Racer id: ");
                    Long racerId = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Racer name: ");
                    String racerName = sc.nextLine();
                    System.out.print("Racer age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Racer category: ");
                    String category = sc.nextLine();

                    Racer racer = new Racer(racerId, racerName, age, category);

                    eventController.addRacer(racer);
                    break;

                case 6:
                    eventController.listAllRacers();
                    break;

                case 7:
                    System.out.print("Race id: ");
                    Long raceId = sc.nextLong();
                    System.out.print("Sponsor id: ");
                    Long sponsorIdLink = sc.nextLong();

                    eventController.addSponsorToRace(raceId, sponsorIdLink);
                    break;

                case 8:
                    System.out.print("Registration id: ");
                    Long registrationId = sc.nextLong();
                    System.out.print("Race id: ");
                    Long raceRegId = sc.nextLong();
                    System.out.print("Racer id: ");
                    Long racerRegId = sc.nextLong();

                    eventController.raceRegistration(registrationId, raceRegId, racerRegId);

                    break;
                case 9:
                    eventController.listAllRegistration();
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}
