package commands;

import brainfuck.Memory;

public class DecrementMoveCommand implements Command {
    public void execute(Memory skeleton) {
        skeleton.valueLess();
    }
}
