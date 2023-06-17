package vehicule;

public abstract class AssuranceContract {

    private Vehicule vehicule;

    public AssuranceContract(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void calculateEstimate() {
        this.calculateVehiculeCoefficient();
        this.calculateClientCoefficient();
    }

    protected abstract void calculateVehiculeCoefficient();

    protected abstract void calculateClientCoefficient();
}
