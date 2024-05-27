import java.util.ArrayList;
import java.util.Scanner;

//OOP
public class Author {
    private long id;
    private String name;
    private String surname;

    public Author() {

    }

    public Author(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public static void printAuthor(ArrayList<String> AuthorList, Scanner sc) {
        System.out.println("Enter Authors ID");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Authors Name");
        String name = sc.nextLine();
        System.out.println("Enter Authors Surname");
        String surname = sc.nextLine();
        Author author = new Author(id, name, surname);
        AuthorList.add(String.valueOf(author));
        System.out.println("Author added successfully");
}

    public static void printList(ArrayList<String> AuthorList){
    for (int i = 0; i < AuthorList.size(); i++) {
        System.out.println(AuthorList.get(i));
    }
}


    @Override
    public java.lang.String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
