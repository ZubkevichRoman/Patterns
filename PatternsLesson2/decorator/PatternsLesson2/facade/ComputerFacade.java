package PatternsLesson2.decorator.PatternsLesson2.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }
    public void startComputer(){
        System.out.println("startComputer...");
        cpu.freeze();
        memory.load(0,"OC");
        cpu.execute();
    }
}
