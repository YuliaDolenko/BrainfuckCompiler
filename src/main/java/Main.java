import brainfuck.BrainfuckCompiler;
import brainfuck.Memory;
import commands.Command;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Memory memory = new Memory();
        BrainfuckCompiler compiler = new BrainfuckCompiler();
        List<Command> commands = compiler.compileProgram(helloWorld);

        for (Command command: commands) {
            command.execute(memory);
        }
    }
}
