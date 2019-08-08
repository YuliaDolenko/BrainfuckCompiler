package commands;

import brainfuck.Memory;

public class OutputCommand implements Command {
    public void execute(Memory skeleton) {
        System.out.print((char) skeleton.getCurrentCellValue());
    }
}
