package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        int index;
        Person person;
        switch (args[0]){
            case "-c":
                index = allPeople.size();
                if (args[2] == "м") allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));
                else allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));
                System.out.println(index);
                break;
            case "-r":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person.getSex() == Sex.MALE) System.out.println(String.format("%s %s %s",person.getName(),"м",new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH).format(person.getBirthDate())));
                else System.out.println(String.format("%s %s %s",person.getName(),"ж",new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH).format(person.getBirthDate())));
                break;
            case "-u":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setName(args[2]);
                if (args[3] == "м") person.setSex(Sex.MALE);
                else person.setSex(Sex.FEMALE);
                person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[4]));
                break;
            case "-d":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
        }
    }
}
