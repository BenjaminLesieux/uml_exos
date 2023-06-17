package vehicule;

public class MotorcyleAssuranceContract extends AssuranceContract {
    public MotorcyleAssuranceContract(MotorCycle motorCycle) {
        super(motorCycle);
    }

    protected void calculateVehiculeCoefficient() {
        System.out.println("Calculating motorcyle coefficient");
    }

    protected void calculateClientCoefficient() {
        System.out.println("Calculating client coefficient for motorcyle");
    }
}
