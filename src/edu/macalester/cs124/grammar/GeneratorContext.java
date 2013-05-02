package edu.macalester.cs124.grammar;

import java.util.Random;

/**
 * Provides objects shared by the various {@link Substitution}s while generating grammar output.
 */
public class GeneratorContext {
    private Random random = new Random();
    private StringBuilder result = new StringBuilder();
    
    /**
     * A source of randomness for substitutions.
     */
    public Random getRandom() {
        return random;
    }
    
    /**
     * The buffer to which substitutions append their output.
     */
    public StringBuilder getResult() {
        return result;
    }
}
