package edu.macalester.cs124.grammar;


/**
 * A multiple choice substitution. When generating content, objects of this class select one of
 * their choices.
 */
public class Choice implements Substitution {
    
    /**
     * Adds the given substitutions to the existing list of choices.
     */
    public void addChoice(Substitution substitution) {
        throw new UnsupportedOperationException("Choice.addChoice() not implemented yet"); // TODO
    }
    
    /**
     * Randomly selects one of the choices, and calls its generate() method.
     * Raises an exception if addChoice() has never been called and there are no choices.
     */
    @Override
    public void generate(GeneratorContext context) {
        throw new UnsupportedOperationException("Choice.generate() not implemented yet"); // TODO
    }
}
