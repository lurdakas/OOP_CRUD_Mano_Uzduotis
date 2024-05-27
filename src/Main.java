import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> AuthorList = new ArrayList<>();
        Author autorius = new Author();

        System.out.println(autorius.toString());


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("_______________");
            System.out.println("1. Enter Authors ID");
            System.out.println("1. Enter Authors Name");
            System.out.println("1. Enter Authors Surname");
            System.out.println("2. Print out Authors List");
            System.out.println("3. To End the Programm");
            System.out.println("_______________");
            System.out.println();
            int item = sc.nextInt();
            sc.nextLine();
            switch (item) {
                case 1:
                    Author.printAuthor(AuthorList, sc);
                    break;
                case 2:
                    Author.printList(AuthorList);
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }



}