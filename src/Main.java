import ex.observer.Calculator;
import ex.observer.ProgressBar;
import ex.observer.Synchro;
import vehicule.*;

public class Main {
    public static void main(String[] args) {
        Synchro sync = new Synchro();
        Synchro sync2 = new Synchro();
        Calculator calc = new Calculator();
        sync.addObserver(calc);
        sync2.addObserver(calc);

        ProgressBar progressBar = new ProgressBar();
        calc.addObserver(progressBar);

        sync.calculate(1, 2);
        sync2.calculate(3, 4);
    }
}
