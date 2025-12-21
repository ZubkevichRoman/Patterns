package Patterns.singletone;

public final class Singleton {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile Singleton instance;

    public String value;

    private Singleton() {}
    public void rocketLaunch(){
        System.out.println("Rocket takes off");
    }


    public static Singleton getInstance() {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}