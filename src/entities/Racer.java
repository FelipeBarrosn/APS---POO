package entities;

public class Racer {

    private Long racerId;
    private String racerName;
    private int age;
    private String category;


    public Racer(Long racerId, String racerName, int age, String category) {
        this.racerId = racerId;
        this.racerName = racerName;
        this.age = age;
        this.category = category;
    }

    public Long getRacerId() {
        return racerId;
    }

    public void setRacerId(Long racerId) {
        this.racerId = racerId;
    }

    public String getRacerName() {
        return racerName;
    }

    public void setRacerName(String racerName) {
        this.racerName = racerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
