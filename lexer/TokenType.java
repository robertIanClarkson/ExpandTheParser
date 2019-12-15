package lexer;

/**
 * This file is automatically generated<br>
 * it contains the table of mappings from token
 * constants to their Symbols
 */
public class TokenType {
    public static java.util.HashMap<Tokens, Symbol> tokens = new java.util.HashMap<Tokens, Symbol>();

    public TokenType() {
        tokens.put(Tokens.Program, Symbol.symbol("program", Tokens.Program));
        tokens.put(Tokens.Int, Symbol.symbol("int", Tokens.Int));
        tokens.put(Tokens.BOOLean, Symbol.symbol("boolean", Tokens.BOOLean));
        tokens.put(Tokens.If, Symbol.symbol("if", Tokens.If));
        tokens.put(Tokens.Then, Symbol.symbol("then", Tokens.Then));
        tokens.put(Tokens.Else, Symbol.symbol("else", Tokens.Else));
        tokens.put(Tokens.While, Symbol.symbol("while", Tokens.While));
        tokens.put(Tokens.Function, Symbol.symbol("function", Tokens.Function));
        tokens.put(Tokens.Return, Symbol.symbol("return", Tokens.Return));
        tokens.put(Tokens.Identifier, Symbol.symbol("<id>", Tokens.Identifier));
        tokens.put(Tokens.INTeger, Symbol.symbol("<int>", Tokens.INTeger));
        tokens.put(Tokens.LeftBrace, Symbol.symbol("{", Tokens.LeftBrace));
        tokens.put(Tokens.RightBrace, Symbol.symbol("}", Tokens.RightBrace));
        tokens.put(Tokens.LeftParen, Symbol.symbol("(", Tokens.LeftParen));
        tokens.put(Tokens.RightParen, Symbol.symbol(")", Tokens.RightParen));
        tokens.put(Tokens.Comma, Symbol.symbol(",", Tokens.Comma));
        tokens.put(Tokens.Assign, Symbol.symbol("=", Tokens.Assign));
        tokens.put(Tokens.Equal, Symbol.symbol("==", Tokens.Equal));
        tokens.put(Tokens.NotEqual, Symbol.symbol("!=", Tokens.NotEqual));
        tokens.put(Tokens.Less, Symbol.symbol("<", Tokens.Less));
        tokens.put(Tokens.LessEqual, Symbol.symbol("<=", Tokens.LessEqual));
        tokens.put(Tokens.Plus, Symbol.symbol("+", Tokens.Plus));
        tokens.put(Tokens.Minus, Symbol.symbol("-", Tokens.Minus));
        tokens.put(Tokens.Or, Symbol.symbol("|", Tokens.Or));
        tokens.put(Tokens.And, Symbol.symbol("&", Tokens.And));
        tokens.put(Tokens.Multiply, Symbol.symbol("*", Tokens.Multiply));
        tokens.put(Tokens.Divide, Symbol.symbol("/", Tokens.Divide));
        tokens.put(Tokens.Comment, Symbol.symbol("//", Tokens.Comment));
        tokens.put(Tokens.Greater, Symbol.symbol(">", Tokens.Greater));
        tokens.put(Tokens.GreaterEqual, Symbol.symbol(">=", Tokens.GreaterEqual));
        tokens.put(Tokens.Void, Symbol.symbol("void", Tokens.Void));
        tokens.put(Tokens.STring, Symbol.symbol("string", Tokens.STring));
        tokens.put(Tokens.StringLit, Symbol.symbol("<string>", Tokens.StringLit));
        tokens.put(Tokens.Number, Symbol.symbol("number", Tokens.Number));
        tokens.put(Tokens.NumberLit, Symbol.symbol("<number>", Tokens.NumberLit));
        tokens.put(Tokens.DO, Symbol.symbol("do", Tokens.DO));
        tokens.put(Tokens.FOR, Symbol.symbol("for", Tokens.FOR));
        tokens.put(Tokens.To, Symbol.symbol("to", Tokens.To));
        tokens.put(Tokens.Semicolon, Symbol.symbol(";", Tokens.Semicolon));
    }
}
