package commands;

import brainfuck.Memory;

import java.util.List;

public class LoopCommand implements Command {
    private List<Command> commands;

    public LoopCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute(Memory skeleton) {
        while (skeleton.getCurrentCellValue() != 0) {
            for (Command command : commands) {
                command.execute(skeleton);
            }
        }
    }
}
