Comp 124: Grammar Lab
====

Remember the [headline generator](https://github.com/Macalester-CS124-2013-S/class-exercises/blob/master/src/edu/macalester/cs124/HeadlineGenerator.java) from earlier in the semester? It works all right, but the way it is all hard-coded is not ideal. There is a lot of useless text — repeated case and return statements — and because the argument to rand.nextInt() must match the number of cases, adding a new choice to one of the methods is quite error-prone!

Wouldn’t it be nice to have a a friendly, concise, purpose-specific file format? In other words, instead of this:

    public String headline() {
        switch(rand.nextInt(3)) {
            case  1: return person() + " TO WED " + person();
            case  2: return person() + " ANNOUNCES " + issue() + " PLAN";
            default: return person() + " ESCAPES FROM " + place();
        }
    }
  
…we’d rather have this:

    headline: {person} TO WED {person}
    headline: {person} ANNOUNCES {issue} PLAN
    headline: {person} ESCAPES FROM {place}

In this lab, we’ll do exactly that.

I have already written the parsing code for the file format above, and included a sample input file (headlines.grammar). I’ve also laid out a class structure. Your job is to understand that class structure, then fill in the missing pieces.

When you arrive in the lab, I will explain the class structure at the board. Then, do the usual drill one last time:

  * Find a partner.
  * Fork this repository.
  * Clone it to your lab machine.

…and go through the code to implement the missing methods. (Look for the "not implemented yet" exceptions.)

You will have to think carefully about how you want to approach this! You can’t use GrammarParser and my sample input file until there are now missing pieces. Will you try to implement _everything_ before you test _anything?_ (You might get a long way down the wrong path!) Or will you devise a strategy for testing small pieces? (That takes extra time!)

Once you have the pieces working, experiment with the headlines file, or create a different grammar altogether.

__Challenge:__ If you are feeling adventurous, modify the code so that it won’t reuse the same choice within a headline (i.e. prevent “ELVIS TO WED ELVIS”).