package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;

public class RelOpTree extends AST {
    private Symbol symbol;

    public RelOpTree(Token tok) {
        this.symbol = tok.getSymbol();
    }

    public Object accept(ASTVisitor v) {
        return v.visitRelOpTree(this);
    }

    public Symbol getSymbol() {
        return symbol;
    }

}

