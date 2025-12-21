package Patterns.singletone;

public class mainSingletone {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.rocketLaunch();
    }
}
