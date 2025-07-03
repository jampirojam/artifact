package data;

import dto.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleData {

    static Scanner scanner = new Scanner(System.in);
    static String input;

    public static List<People> getPeopleData(List<People> peopleList) {
        int number = 0;
        List<People> finalPeopleList = new ArrayList<>();

        if (peopleList.isEmpty()) {
            // Add data dummy
            finalPeopleList.add(new People("Ojam", 25, true));
            finalPeopleList.add(new People("Machrush", 25, false));
        } else {
            finalPeopleList = peopleList;
        }


        for (People people : finalPeopleList) {
            String name = people.getName();
            int age = people.getAge();
            boolean married = people.isMarried();

            System.out.println("===============");
            number += 1;
            System.out.format("%d. %s, %d, %b %n", number, name, age, married);
        }

        System.out.println();
        return finalPeopleList;
    }

    public static List<People> deletePeopleData(List<People> peopleList, String name) {
        int number = 0;
        for (People people : peopleList) {
            if (people.getName().equals(name)) {
                peopleList.remove(people);
            }
        }

        for (People people : peopleList) {
            String finalName = people.getName();
            int age = people.getAge();
            boolean married = people.isMarried();

            number += 1;
            System.out.format("%d. %s, %d, %b %n", number, finalName, age, married);
        }

        System.out.println();
        return peopleList;
    }

    public static List<People> addPeopleData(List<People> peopleList, People people) {
        int number = 0;
        peopleList.add(people);

        for (People peopleDetail : peopleList) {
            String name = peopleDetail.getName();
            int age = peopleDetail.getAge();
            boolean married = peopleDetail.isMarried();

            System.out.println("===============");
            number += 1;
            System.out.format("%d. %s, %d, %b %n", number, name, age, married);
        }

        System.out.println();
        return peopleList;
    }

    public static List<People> updatePeopleDataByName(List<People> peopleList, String name) {
        int number = 0;
        String finalName;
        int age;
        String status;
        boolean married;

        for (People people : peopleList) {
            if (people.getName().equals(name)) {
                System.out.print("Change Name (Y/N): ");
                input = scanner.next();
                if (input.equalsIgnoreCase("Y")) {
                    System.out.print("Input name: ");
                    finalName = scanner.next();
                    people.setName(finalName);
                }

                System.out.print("Change Age (Y/N): ");
                input = scanner.next();
                if (input.equalsIgnoreCase("Y")) {
                    System.out.print("Input age: ");
                    age = scanner.nextInt();
                    people.setAge(age);
                }

                System.out.print("Change Marital Status (Y/N): ");
                input = scanner.next();
                if (input.equalsIgnoreCase("Y")) {
                    System.out.print("Input marital status (M/S/D/W): ");
                    status = scanner.next();
                    married = status.equalsIgnoreCase("M") ? true : false;
                    people.setMarried(married);
                }
            }
        }

        for (People peopleDetail : peopleList) {
            String detailName = peopleDetail.getName();
            int detailAge = peopleDetail.getAge();
            boolean detailMarried = peopleDetail.isMarried();
            
            System.out.println("===============");
            number += 1;
            System.out.format("%d. %s, %d, %b %n", number, detailName, detailAge, detailMarried);
        }

        System.out.println();
        return peopleList;
    }

    public static List<People> searchPeopleByName(List<People> peopleList, String search) {
        System.out.println(search);
        int number = 0;
        List<People> newPeopleList = new ArrayList<>();
        for (People people : peopleList) {
            if (people.getName().contains(search)) {
                newPeopleList.add(people);
            }
        }


        for (People peopleDetail : newPeopleList) {
            String detailName = peopleDetail.getName();
            int detailAge = peopleDetail.getAge();
            boolean detailMarried = peopleDetail.isMarried();
            
            System.out.println("===============");
            number += 1;
            System.out.format("%d. %s, %d, %b %n", number, detailName, detailAge, detailMarried);
        }

        return peopleList;
    }
}
