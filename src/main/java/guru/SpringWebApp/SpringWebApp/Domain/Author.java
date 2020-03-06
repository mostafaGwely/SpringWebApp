package guru.SpringWebApp.SpringWebApp.Domain;

import java.util.Set;

public class Author
{
    private String fristName;
    private String lastName;
    private Set<Book> books;

    public Author() {
    }

    public Author(String fristName, String lastName, Set<Book> books) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
