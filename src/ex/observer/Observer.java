package ex.observer;

public interface Observer {
    <T> void notifyObserver(T t);
}

