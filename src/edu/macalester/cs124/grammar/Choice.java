package edu.macalester.cs124.grammar;

import java.util.List;
import java.util.ArrayList;


/**
 * A multiple choice substitution. When generating content, objects of this class select one of
 * their choices.
 */
public class Choice implements Substitution {
    
	List<Substitution> subs = new ArrayList<Substitution>();
    /**
     * Adds the given substitutions to the existing list of choices.
     */
    public void addChoice(Substitution substitution) {
        subs.add(substitution);
    }
    
    /**
     * Randomly selects one of the choices, and calls its generate() method.
     * Raises an exception if addChoice() has never been called and there are no choices.
     */
    @Override
    public void generate(GeneratorContext context) {
    	subs.get(context.getRandom().nextInt(subs.size())).generate(context);
    }
}
