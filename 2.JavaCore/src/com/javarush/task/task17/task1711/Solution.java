package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        int index;
        Person person;
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 3; i++) {
                        index = allPeople.size();
                        if (args[2 + (i * 3)] == "м")
                            allPeople.add(Person.createMale(args[1 + (i * 3)], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + (i * 3)])));
                        else
                            allPeople.add(Person.createFemale(args[1 + (i * 3)], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + (i * 3)])));
                        System.out.println(index);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 4; i++) {
                        index = Integer.parseInt(args[1 + (i * 4)]);
                        person = allPeople.get(index);
                        person.setName(args[2 + (i * 4)]);
                        if (args[3 + (i * 4)] == "м") person.setSex(Sex.MALE);
                        else person.setSex(Sex.FEMALE);
                        person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4 + (i * 4)]));
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length - 1; i++) {
                        index = Integer.parseInt(args[1 + i]);
                        person = allPeople.get(index);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople){
                    for (int i = 0; i < args.length - 1; i++) {
                        person = allPeople.get(Integer.parseInt(args[1 + i]));
                        if (person.getSex() == Sex.MALE) System.out.println(String.format("%s %s %s",person.getName(),"м",new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH).format(person.getBirthDate())));
                        else System.out.println(String.format("%s %s %s",person.getName(),"ж",new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH).format(person.getBirthDate())));
                    }
                }
                break;
        }
    }
}
