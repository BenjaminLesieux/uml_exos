package vehicule;

public class CarAssuranceContract extends AssuranceContract {
    public CarAssuranceContract(Car car) {
        super(car);
    }

    protected void calculateVehiculeCoefficient() {
        System.out.println("Calculating car coefficient");
    }

    protected void calculateClientCoefficient() {
        System.out.println("Calculating client coefficient for car");
    }
}
