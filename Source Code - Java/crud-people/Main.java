import dto.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static data.PeopleData.addPeopleData;
import static data.PeopleData.deletePeopleData;
import static data.PeopleData.getPeopleData;
import static data.PeopleData.searchPeopleByName;
import static data.PeopleData.updatePeopleDataByName;

public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        menu(peopleList);
    }

    public static void menu(List<People> peopleList) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String status;
        boolean married;
        String search;

        System.out.println("CRUD MENU");
        System.out.println("1. Get All Data");
        System.out.println("2. Update Data By Name");
        System.out.println("3. Add Data");
        System.out.println("4. Delete Data By Name");
        System.out.println("5. Search Data");
        System.out.println("");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        System.out.println("");

        if (choice == 1) {
            List<People> finalPeopleList = getPeopleData(peopleList);
            System.out.println();
            System.out.println("===============");
            System.out.println("===============");
            System.out.println();
            menu(finalPeopleList);
        } else if (choice == 2) {
            List<People> finalPeopleList = getPeopleData(peopleList);
            System.out.println("UPDATE DATA");
            System.out.println("");
            System.out.print("Input name that want to updated: ");
            name = scanner.next();
            List<People> list = updatePeopleDataByName(finalPeopleList, name);
            menu(list);
        } else if (choice == 3) {
            List<People> finalPeopleList = getPeopleData(peopleList);
            System.out.println("ADD NEW DATA");
            System.out.println("");
            System.out.print("Input name: ");
            name = scanner.next();
            System.out.print("Input age: ");
            age = scanner.nextInt();
            System.out.print("Input marital status (M/S/D/W): ");
            status = scanner.next();
            married = status.equalsIgnoreCase("M") ? true : false;
            People people = new People(name, age, married);
            List<People> list = addPeopleData(finalPeopleList, people);
            System.out.println();
            System.out.println("===============");
            System.out.println("===============");
            System.out.println();
            menu(list);
        } else if (choice == 4) {
            List<People> finalPeopleList = getPeopleData(peopleList);
            System.out.println("DELETE DATA BY NAME");
            System.out.println("");
            System.out.print("Input name that want to delete: ");
            name = scanner.next();
            List<People> list = deletePeopleData(finalPeopleList, name);
            System.out.println();
            System.out.println("===============");
            System.out.println("===============");
            System.out.println();
            menu(list);
        } else if (choice == 5) {
            List<People> finalPeopleList = getPeopleData(peopleList);
            System.out.println("SEARCH DATA");
            System.out.println("");
            System.out.print("Search something: ");
            search = scanner.next();
            List<People> list = searchPeopleByName(finalPeopleList, search);
            System.out.println();
            System.out.println("===============");
            System.out.println("===============");
            System.out.println();
            menu(list);
        }
    }
}
