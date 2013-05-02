package edu.macalester.cs124.grammar;


/**
 * A substitution rule that performs multiple child substitutions in order.
 */
public class Sequence implements Substitution {
    
    /**
     * Adds a new child substitution to the end of this sequence.
     */
    public void add(Substitution sub) {
        throw new UnsupportedOperationException("Sequence.add() not implemented yet"); // TODO
    }
    
    /**
     * Calls generate() on each children substitution in turn.
     */
    @Override
    public void generate(GeneratorContext context) {
        throw new UnsupportedOperationException("Sequence.generate() not implemented yet"); // TODO
    }
}
