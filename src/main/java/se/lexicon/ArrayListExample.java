package se.lexicon;

import java.time.LocalDate;
import java.util.*;

/**
1. ArrayList can contain duplicate elements.
2. ArrayList maintains insertion order.
3. ArrayList in non synchronized.
4. AArrayList allows random access because it works at the index base.
*/
public class ArrayListExample {

    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();

        personList.add(new Person("1235-12-12-9200", "Simon", "simon@lexicon.com", LocalDate.MAX));
        personList.add(new Person("1236-12-12-9201", "Erik", "erik@lexicon.com", LocalDate.MAX));




    }

    private static void ex1() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        //remove()
        strings.remove(0);

        //AddAll()
        strings.addAll(Arrays.asList("asd","asd","ras"));

        strings.forEach(System.out::println);

        //.size()
        System.out.println("strings.size() = " + strings.size());


        //.toArray()
        Object[] stringsToArray = strings.stream().toArray();

    }


}
