package edu.macalester.cs124.grammar;

/**
 * A substitution that always generates the same string.
 */
public class Literal implements Substitution {
    
	private String value;
    /**
     * @param value The output of this generator.
     */
    public Literal(String value) {
    	this.value = value;
    }
    
    /**
     * Appends this literal's value to the context's result.
     */
    @Override
    public void generate(GeneratorContext context) {
        context.getResult().append(value);
    }
}
