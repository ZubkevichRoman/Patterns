package PatternsLesson2.decorator.PatternsLesson2.facade;

public class Memory {
    void load(long position, String data){
        System.out.println("Memory: загрузка данных '" + data + "' в позицию " + position);
    }
}
