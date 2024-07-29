package hus.oop.lab04.exercises_on_composition.introduction_to_composition_author_and_book_classes_advanced;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println("Authors' name: " + javaDummy.getAuthorNames());
    }
}
