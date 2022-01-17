package se.lexicon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * Recommended Reading.
 * http://tutorials.jenkov.com/java-collections/index.html
 */
public class App 
{
    public static void main( String[] args )
    {

        Array_vs_Collection();
        wrappers_of_Primitives();
        traversing_an_Collection();

    }

    private static void Array_vs_Collection() {
        //Simple Array, you have ALL control over it.
        String[] strings = new String[2];
        strings[0] = "Hello";
        strings[1] = "World";

        System.out.println(strings[0]);
        System.out.println(strings[1]);

        //A Collection have build in features. like adding searching and removing.
        Collection<String> collectionStrings = new ArrayList<>();
        collectionStrings.add("Hello");
        collectionStrings.add("World");
        collectionStrings.add("!");
//        collectionStrings.add(1299);

        System.out.println(collectionStrings.size());

        collectionStrings.remove("Hello");
        System.out.println(collectionStrings.size());
        System.out.println(collectionStrings.contains("Hello")); //False
    }

    /**
     * For More Examples have a look here.
     * https://www.geeksforgeeks.org/iterate-through-list-in-java
     */
    private static void traversing_an_Collection() {
        /*
         How we can create an ArrayList of numbers.
         (Note the "Integer" in the Angle Brackets using Generics. Integer is Wrapper Class of int)
         */
        Collection<Integer> integers = new ArrayList<Integer>();
        integers.add(500);
        integers.add(550);
        integers.add(580);
        integers.add(560);
//        integers.add("1999");

        System.out.println("--- For-Loop ---");
        for (Integer integer : integers) {
            System.out.println(integer);

            //Don't Remove in a for-loop. Throws and concurrent modification exception.
            //Use iterator instead.
//            if (integer == 550){
//                integers.remove(integer);
//            }
        }

        System.out.println("--- Iterator ---");

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){

            Integer numbToRemove = 550;
            Integer tempNumber = iterator.next();

            if (numbToRemove.equals(tempNumber)){
                iterator.remove();
                continue;
            }

            System.out.println(tempNumber);
        }

        System.out.println("Is 550 removed from integers?  = " + integers);
    }

    private static void wrappers_of_Primitives() {
        //Wrappers of primitives
        Double d = 1230.023;
        Integer i = 123;
        Byte b = 41;
        Float f = 123.62F;
        Short s = 123;
        Long l = 9182393L;
        Character c = 's';
        Boolean bool = true;
    }
}
