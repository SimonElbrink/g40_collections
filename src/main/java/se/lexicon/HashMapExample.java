package se.lexicon;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

       Person simon =  new Person("123", "Simon Elbrink","simon@lexicon.se", LocalDate.MAX);
       Person erik = new Person("1236-12-12-9201", "Erik", "erik@lexicon.com", LocalDate.MAX);


        //  Email  PersonObject
        Map<String, Person> personMap =new HashMap<>();

        personMap.put(simon.getEmail(), simon);
        personMap.put(erik.getEmail(), erik);

        //Updating
//        personMap.remove(simon.getEmail());
//        simon.setEmail("asdgfa");
//        personMap.put(simon.getEmail(), simon);


        System.out.println("personMap.size() = " + personMap.size());

        System.out.println("personMap.get returns the value" + personMap.get("simon@lexicon.se"));

        System.out.println(personMap);

        for (Map.Entry<String, Person> e : personMap.entrySet()) {
            System.out.println("The Key: " + e.getKey() + "\t" + "Value: " + e.getValue());
        }

        for (String key: personMap.keySet()) {

            System.out.println("Key: " + key);

        }



    }
}
