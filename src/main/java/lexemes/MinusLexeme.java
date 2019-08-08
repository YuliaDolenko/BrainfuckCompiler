package lexemes;

public class MinusLexeme implements BrainfuckLexeme {

    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}

