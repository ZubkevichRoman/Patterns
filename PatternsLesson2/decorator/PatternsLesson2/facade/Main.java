package PatternsLesson2.decorator.PatternsLesson2.facade;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory);
        computerFacade.startComputer();
    }
}
