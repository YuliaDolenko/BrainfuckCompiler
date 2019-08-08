package commands;

import brainfuck.Memory;

public class IncrementMoveCommand implements Command {
    public void execute(Memory skeleton) {
        skeleton.valueMore();
    }
}
