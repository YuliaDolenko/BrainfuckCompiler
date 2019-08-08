package commands;

import brainfuck.Memory;

public interface Command {
    void execute(Memory skeleton);
}
