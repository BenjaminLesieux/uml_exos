package ex.observer;

import java.util.List;

import static java.lang.Thread.sleep;

public class Calculator extends Observable implements Observer {

    @Override
    public <T> void notifyObserver(T t) {
        for (int i = 1; i <= 10; i++) {
            this.notifyObservers(".".repeat(i));
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done !");
        System.out.println("Result: " + t);
    }
}
