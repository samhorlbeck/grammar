package edu.macalester.cs124.grammar;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarParser {
    
    /**
     * Creates a new Grammar from a text file. See {@link #parseGrammar(InputStream)} for grammar file syntax.
     * 
     * @param resourceName  The name of a resource on the classpath.
     */
    public static Grammar parseGrammar(String resourceName) throws IOException {
        return parseGrammar(
            Grammar.class.getResourceAsStream(resourceName));
    }
    
    /**
     * Creates a new Grammar from a text file. The syntax is as follows:
     * <pre>
     *    # This is a comment
     *    
     *    greeting: Hello, {name}!
     *    name: Alice
     *    name: Bob 
     * </pre>
     * 
     * @param in  The grammar description as a UTF-8 encoded input stream.
     */
    public static Grammar parseGrammar(InputStream in) throws IOException {
        Grammar grammar = new Grammar();
        
        Scanner scanner = new Scanner(in, "utf-8");
        int lineNum = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;
            
            // Comment?
            if(commentPat.matcher(line).matches())
                continue;
            
            // Something we know how to parse at all?
            Matcher ruleMatcher = rulePat.matcher(line);
            if(!ruleMatcher.matches())
                throw new IOException("Can't parse line " + lineNum + " of grammar file: \"" + line + "\"");
            
            // OK, it's a rule
            String symbol = ruleMatcher.group(1),
                   subs   = ruleMatcher.group(2);
            grammar.addSubstitution(symbol, parseSubstitution(grammar, subs));
        }
        
        return grammar;
    }

    private static Substitution parseSubstitution(Grammar grammar, String subs) {
        Sequence seq = new Sequence();
        Matcher tokMatcher = ruleTokenPat.matcher(subs);
        while(tokMatcher.find()) {
            String symbol  = tokMatcher.group(1),
                   literal = tokMatcher.group(2);
            
            // If the token is a symbol, grab the corresponding substitution from the grammar
            // and add it to this sequence. It's OK if the substitution doesn't exist
            // yet; the grammar will create an empty Choice, and we'll add choices later.
            if(symbol != null)
                seq.add(grammar.substitutionForSymbol(symbol));
            
            // If the token is a chunk of liter text, just drop it into the sequence.
            if(literal != null)
                seq.add(new Literal(literal));
        }
        return seq;
    }
    
    private static final Pattern
        commentPat   = Pattern.compile("\\s*(#.*)?"),                    // spaces followed by an optional #comment
        rulePat      = Pattern.compile("\\s*(\\w+)\\s*:\\s*(.*?)\\s*"),  // a symbol name, a colon, then a rule
        ruleTokenPat = Pattern.compile("\\{(\\w+)\\}|([^{]+)");          // either symbol name in curly braces, or text without curly braces
}
