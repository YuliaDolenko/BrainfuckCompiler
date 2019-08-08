package lexemes;

public class EndCycleLexeme implements BrainfuckLexeme {

    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}
