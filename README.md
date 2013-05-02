Comp 124: Homework 4
====


The Game of Ghost (30 points)
---

Implement the [game of Ghost](http://en.wikipedia.org/wiki/Ghost_\(game\)).

This assignment is meant as a breather after Breakout, and a warm-up for the final homework, so I've given you a head start! GhostProgram already implements the rules of the game. There are a few things missing that will give you a little more practice (1) working with collections and (2) decomposing a problem by creating a new class. Here's what you need to do:

### 1. Implement the dictionary

The project includes a dictionary file. The Dictionary class has a snippet of code that demonstrates how to read words from that file — but it is otherwise unimplemented. Implement all the empty methods.

Dictionary should do its heavy lifting on initialization; the methods isWord() and isPrefixOfWord() should be very efficient. Think about what data structure(s) you can use and what work you can do in the Dictionary constructor to make that happen.

### 2. Keep track of strikes

The code currently tracks the names of the players, but not how many strikes each one has. Create a new Player class that tracks both the player name and the number of strikes against them, and change GhostProgram so it keeps a list of Players instead of a list of Strings. Then add code to print out the score after each round.

### Keep it simple!

This assignment requires some thought, but it does not require much code. The methods you add will all be short; many — most! — of them should be just a single line long. If you find yourself creating a long and complex method, look for simplifications.

As always, ask Nick and me for help early and often!

### Example output

When you're all done, gameplay should look like this:

    Reading dictionary...
    Dictionary contains 270163 words with 593708 prefixes.

    How many players? 3
    Player 0 name: Sally
    Player 1 name: Harold
    Player 2 name: Justine

    Sally, your move: a
    A
    Harold, your move: asdf
    You must enter exactly one letter.
    Harold, your move: 
    You must enter exactly one letter.
    Harold, your move: q
    AQ
    Justine, your move: u
    AQU
    Sally, your move: x
    No words in the dictionary begin with "AQUX". Please try another letter.
    Sally, your move: e
    AQUE
    Harold, your move: o
    AQUEO
    Justine, your move: u
    AQUEOU
    Sally, your move: l
    No words in the dictionary begin with "AQUEOUL". Please try another letter.
    Sally, your move: s
    AQUEOUS
    That's a word! One strike against Sally.

    Sally: 1 strike
    Harold: 0 strikes
    Justine: 0 strikes

    Harold, your move: a
    A
    Justine, your move: n
    AN
    Sally, your move: t
    ANT
    Harold, your move: o
    ANTO
    Justine, your move: n
    ANTON
    Sally, your move: y
    ANTONY
    Harold, your move: m
    ANTONYM
    That's a word! One strike against Harold.

    Sally: 1 strike
    Harold: 1 strike
    Justine: 0 strikes
