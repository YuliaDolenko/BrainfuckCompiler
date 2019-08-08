package brainfuck;

import commands.*;
import lexemes.BrainfuckLexeme;
import lexemes.LexemeFactory;

import java.util.ArrayList;
import java.util.List;

public class BrainfuckCompiler {

    public List<Command> compileProgram(String brainfuckProgram){

        CompilationVisitor visitor = new CompilationVisitor();

        LexemeFactory factory = new LexemeFactory();

        for (Character value : brainfuckProgram.toCharArray()) {

            BrainfuckLexeme lexeme = factory.createLexeme(value);

            lexeme.acceptVisitor(visitor);
        }

        return visitor.getCommands();
    }

}
