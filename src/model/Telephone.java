package model;

public class Telephone {

    private String telephone;

    public Telephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Telephone [telephone=" + telephone + "]";
    }

}
