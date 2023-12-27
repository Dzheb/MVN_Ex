package com.mycompany.app;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
        {
            public static void main( String[] args )
            {

                List<Person> list = Arrays.asList(new Person(1, "Jack Daniels"), new Person(2, "Liz Taylor"));
                list.forEach((it) -> System.out.println(it.toString()));
                Gson gson = new Gson();
                String jsonString = gson.toJson(list);
                System.out.println("Persons list JSON format");
                System.out.println("JSON format: "+jsonString);

            }
        }
