package brainfuck;

import commands.*;
import lexemes.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CompilationVisitor implements LexemeVisitor {

    private final Deque<List<Command>> commands = new ArrayDeque<List<Command>>();

    public CompilationVisitor() {

        commands.push(new ArrayList<Command>());
    }

    public void visit(PlusLexeme lexeme) {

        commands.peek().add(new PlusCommand());
    }

    public void visit(MinusLexeme lexeme) {

        commands.peek().add(new MinusCommand());
    }

    public void visit(IncrementPointerLexeme lexeme) {

        commands.peek().add(new IncrementMoveCommand());
    }

    public void visit(DecrementPointerLexeme lexeme) {

        commands.peek().add(new DecrementMoveCommand());
    }

    public void visit(OutputLexeme lexeme) {

        commands.peek().add(new OutputCommand());
    }

    public void visit(StartCycleLexeme lexeme) {

        commands.push(new ArrayList<Command>());
    }

    public void visit(EndCycleLexeme lexeme) {

        List<Command> cycleInnerCommands = commands.pop();
        commands.peek().add(new LoopCommand(cycleInnerCommands));
    }

    public List<Command> getCommands() {
        return commands.pop();
    }
}
