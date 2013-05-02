package edu.macalester.cs124.grammar;


/**
 * A substitution in a grammar, capable of generating output according to the rules of the grammar.
 */
public interface Substitution {
    /**
     * Generates text, appending it to the context’s “result” property. 
     */
    void generate(GeneratorContext context);
}
