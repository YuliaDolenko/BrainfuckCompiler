package lexemes;

public class StartCycleLexeme implements BrainfuckLexeme {

    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}
