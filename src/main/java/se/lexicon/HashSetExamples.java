package se.lexicon;

import java.util.HashSet;

public class HashSetExamples {

    public static void main(String[] args) {


        String simon = "Simon";

        HashSet<String> lexiconOfficeVXO = new HashSet<>();
        lexiconOfficeVXO.add(simon);
        lexiconOfficeVXO.add("Erik");
        lexiconOfficeVXO.add("Ulf");
        lexiconOfficeVXO.add("Fredrik");
        lexiconOfficeVXO.add("Mehrdad");

        HashSet<String> lexiconOfficeJKPG = new HashSet<>();
        lexiconOfficeJKPG.add("Kent");
        lexiconOfficeJKPG.add("Marcus");
        lexiconOfficeJKPG.add("Jonas");
        lexiconOfficeJKPG.add("Martina");
        lexiconOfficeJKPG.add("Elisabeth");
        lexiconOfficeVXO.add(simon);

        HashSet<String> lexiconOffice = new HashSet<>();
        lexiconOffice.addAll(lexiconOfficeVXO);
        lexiconOffice.addAll(lexiconOfficeJKPG); // Will Ignore second "Simon" because no duplicates allowed.

        System.out.println("Does lexicon Växjö contain Simon: " + lexiconOfficeVXO.contains(simon));

        //Not keeping Insertion Order.
        System.out.println("Some of The employees of Lexicon: " + lexiconOffice);

        //One-By-One Removing
//        lexiconOffice.remove("Erik");
//        lexiconOffice.remove("Ulf");

        //Remove all from a Collection
        HashSet<String> removeThese = new HashSet<>();
        removeThese.add("Ulf");
        removeThese.add("Erik");
        removeThese.add("Fredrik");
        removeThese.add("asdasd");

        System.out.println("lexiconOfficeVXO = " + lexiconOfficeVXO);
        lexiconOfficeVXO.removeAll(removeThese);
        System.out.println("lexiconOfficeVXO = " + lexiconOfficeVXO);

        //Add duplicates.
        lexiconOfficeVXO.add(simon);
        System.out.println("lexiconOfficeVXO = " + lexiconOfficeVXO);


        // Q: can you do HashSet<HashSet>? Multidimensional.
        HashSet<HashSet<String>> foo = new HashSet<>();






    }
}
