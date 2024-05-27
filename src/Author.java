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



    @Override
    public java.lang.String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
