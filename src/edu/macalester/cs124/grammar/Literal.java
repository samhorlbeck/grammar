package edu.macalester.cs124.grammar;

/**
 * A substitution that always generates the same string.
 */
public class Literal implements Substitution {
    
    /**
     * @param value The output of this generator.
     */
    public Literal(String value) {
        throw new UnsupportedOperationException("Literal.Literal() not implemented yet"); // TODO
    }
    
    /**
     * Appends this literal’s value to the content’s result.
     */
    @Override
    public void generate(GeneratorContext context) {
        throw new UnsupportedOperationException("Literal.generate() not implemented yet"); // TODO
    }
}
