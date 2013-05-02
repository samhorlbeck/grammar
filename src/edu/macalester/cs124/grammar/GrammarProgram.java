package edu.macalester.cs124.grammar;

import java.awt.Font;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class GrammarProgram extends ConsoleProgram {
    
    @Override
    public void run() {
        setFont(new Font("Helvetica Neue", Font.BOLD, 24));
        try {
            Grammar grammar = GrammarParser.parseGrammar("/headlines.grammar");
            
            for(int n = 0; n < 20; n++)
                println(grammar.generate("start"));
            
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

}
