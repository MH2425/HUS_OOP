package hus.oop.lab04.exercises_on_composition.self_create_author_and_book_classes;

public class Author {
    private String name;
    private String email;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name = " + this.name
                + ", email = " + this.email
                + "]";
    }
}
