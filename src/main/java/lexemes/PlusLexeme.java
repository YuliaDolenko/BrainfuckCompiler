package lexemes;

public class PlusLexeme implements BrainfuckLexeme {

    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}
