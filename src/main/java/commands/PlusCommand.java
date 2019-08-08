package commands;

import brainfuck.Memory;

public class PlusCommand implements Command {
    public void execute(Memory skeleton) {
        skeleton.increment();
    }
}
