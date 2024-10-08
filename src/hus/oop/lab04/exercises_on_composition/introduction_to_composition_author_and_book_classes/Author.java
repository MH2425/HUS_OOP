package hus.oop.lab04.exercises_on_composition.introduction_to_composition_author_and_book_classes;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name = " + this.name
                + ", email = " + this.email
                + ", gender = " + this.gender
                + "]";
    }
}
