package entities;

public class Organization {

    private Long id;
    private String name;
    private String cnpj;

    public Organization(Long id, String name, String cnpj) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
    }

    public Organization(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String showDetails() {
        return "Id: " + id + " | Name: " + name + " | CNPJ: " + cnpj;
    }
}
