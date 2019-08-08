package lexemes;

import java.util.HashMap;
import java.util.Map;

public class LexemeFactory {

    private final Map<Character, BrainfuckLexeme> lexemeMap = new HashMap<Character, BrainfuckLexeme>() {{

        put('+', new PlusLexeme());
        put('-', new MinusLexeme());
        put('>', new IncrementPointerLexeme());
        put('<', new DecrementPointerLexeme());
        put('.', new OutputLexeme());
        put('[', new StartCycleLexeme());
        put(']', new EndCycleLexeme());

    }};

    public BrainfuckLexeme createLexeme(Character charValue) {

        BrainfuckLexeme lexeme = lexemeMap.get(charValue);

        if (lexeme == null) {
            throw new IllegalArgumentException("Undefined char value in brainfuck: " + charValue);
        }

        return lexeme;
    }

}
