package lexemes;

public interface LexemeVisitor {

    void visit(PlusLexeme lexeme);

    void visit(MinusLexeme lexeme);

    void visit(IncrementPointerLexeme lexeme);

    void visit(DecrementPointerLexeme lexeme);

    void visit(OutputLexeme lexeme);

    void visit(StartCycleLexeme lexeme);

    void visit(EndCycleLexeme lexeme);
}
