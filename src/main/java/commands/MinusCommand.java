package commands;

import brainfuck.Memory;

public class MinusCommand implements Command {

    public void execute(Memory skeleton) {
        skeleton.decrement();
    }
}
