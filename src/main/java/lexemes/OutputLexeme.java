package lexemes;

public class OutputLexeme implements BrainfuckLexeme {

    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}
