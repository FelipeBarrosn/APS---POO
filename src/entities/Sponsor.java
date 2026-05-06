package entities;

public class Sponsor extends Organization{

    private Double contributionValue;

    public Sponsor(Long id, String name, String cnpj, Double contributionValue) {
        super(id, name, cnpj);
        this.contributionValue = contributionValue;
    }

    public Sponsor(){

    }

    public Double getContributionValue() {
        return contributionValue;
    }

    public void setContributionValue(Double contributionValue) {
        this.contributionValue = contributionValue;
    }

    public Long getSponsorId() {
        return getId();
    }

    @Override
    public String showDetails() {
        return super.showDetails() + " | Contribution: " + contributionValue + " R$";
    }
}
