import vehicule.*;

public class Main {
    public static void main(String[] args) {
        AssuranceContract contract = new MotorcyleAssuranceContract(new MotorCycle("1234", "Yamaha"));
        AssuranceContract contract2 = new CarAssuranceContract(new Car("1234", "Renault"));

        contract.calculateEstimate();
        contract2.calculateEstimate();
    }
}
