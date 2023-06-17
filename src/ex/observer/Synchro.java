package ex.observer;

import java.util.List;

public class Synchro extends Observable {

    public void calculate(int a, int b) {
        int result = a + b;
        notifyObservers(result);
    }
}
