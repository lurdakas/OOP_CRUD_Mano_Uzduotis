import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> AuthorList = new ArrayList<>();
        Author autorius = new Author();
        Author author1 = new Author(1,"John Ronald Reuel", "Tolkien");

        System.out.println(autorius.toString());




        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("_______________");
            System.out.println("1. Enter Authors ID");
            System.out.println("2. Enter Authors Name");
            System.out.println("3. Enter Authors Surname");
            System.out.println("4. Print out Authors List");
            System.out.println("5. To End the Programm");
            System.out.println("_______________");
            System.out.println();
            int item = sc.nextInt();
            sc.nextLine();
            switch (item) {
                case 1:
                    System.out.println("Enter Authors ID");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Enter Authors Name");
                    String name = sc.nextLine();
                    System.out.println("Enter Authors Surname");
                    String surname = sc.nextLine();
                    Author author = new Author (id, name, surname);
                    AuthorList.add(String.valueOf(author));
                    System.out.println("Author added successfully");
                    break;
                case 2:
                    for (int i = 0; i < AuthorList.size(); i++) {
                        System.out.println(AuthorList.get(i));
                    }
                    break;
                case 3:
                    System.exit(0);
                    }
            }
        }




}