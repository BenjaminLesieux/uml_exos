package vehicule;

public abstract class Vehicule {
    private String immatriculation;
    private String constructor;

    public Vehicule(String immatriculation, String constructor) {
        this.immatriculation = immatriculation;
        this.constructor = constructor;
    }

    public String getImmatriculation() {
        return this.immatriculation;
    }

    public String getConstructor() {
        return this.constructor;
    }
}
