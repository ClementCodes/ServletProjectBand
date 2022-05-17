package model;

public class ImplementClient implements Client {

    private int idClient;
    private String password;
    private String fName;
    private String name;
    private Telephone telephone;
    private Adresse adresse;
    private Instructions instructions;

    public ImplementClient(int idClient, String password, String fName, String name, Telephone telephone,
            Adresse adresse, Instructions instructions) {
        this.idClient = idClient;
        this.password = password;
        this.fName = fName;
        this.name = name;
        this.telephone = telephone;
        this.adresse = adresse;
        this.instructions = instructions;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Instructions getInstructions() {
        return instructions;
    }

    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "ImplementClient [adresse=" + adresse + ", fName=" + fName + ", idClient=" + idClient + ", instructions="
                + instructions + ", name=" + name + ", password=" + password + ", telephone=" + telephone + "]";
    }

}
