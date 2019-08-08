package commands;

import brainfuck.Memory;

public class EmptyCommand  implements Command{
    public void execute(Memory skeleton) {
        System.out.println("No preset values!");
    }
}
