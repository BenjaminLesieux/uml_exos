package ex.observer;

public class ProgressBar implements Observer {
    @Override
    public <T> void notifyObserver(T t) {
        System.out.println("Progress : " + t);
    }
}
