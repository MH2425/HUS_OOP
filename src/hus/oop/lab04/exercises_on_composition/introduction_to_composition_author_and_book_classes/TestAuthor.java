package hus.oop.lab04.exercises_on_composition.introduction_to_composition_author_and_book_classes;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck",
                "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
