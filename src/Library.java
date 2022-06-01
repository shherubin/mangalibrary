import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Library {
    private static Scanner stdin = new Scanner(System.in);
    private static Object Book;


    public static void runMangalibrary(){

        String userChoice = "";
        boolean dashboard = true;
        List<Book> customerCheckedBooks = new ArrayList<>();
        List<Book> bookShelf = new ArrayList();

        Book onePiece = new Book("One Piece", "Eiichiro Oda", true, 1);
        Book narutoShippuden = new Book("Naruto Shippuden", "Masashi Kishimoto", true, 2);
        Book inuyasha = new Book("Inuyasha", "Rumiko Takahashi", true, 3);
        Book kimetsuNoYaiba = new Book("Kimetsu No Yaiba", "Koyoharu Gotouge", true, 4);
        Book yuYuHakusho = new Book("Yu Yu Hakusho", "Yoshihiro Togashi", true, 5);


        bookShelf.add(onePiece);
        bookShelf.add(narutoShippuden);
        bookShelf.add(inuyasha);
        bookShelf.add(kimetsuNoYaiba);
        bookShelf.add(yuYuHakusho);



        while(dashboard) {
            System.out.println("Welcome to Miyamoto's Manga library, we have all the best manga to rent. \n " +
                    "Please select an option \n" +
                    "1. See the library. \n" +
                    "2. Take/Return a book \n" +
                    "3. See my books \n" +
                    "4. Checkout \n" +
                    "5. Exit");

            userChoice = stdin.nextLine();

            switch(userChoice.toLowerCase(Locale.ROOT)) {
                case "1", "see the library" -> printBookshelf(bookShelf);
                case "2", "take/return a book", "take", "return" -> customerCheckedBooks.add(bookSelection(bookShelf))  ;
                case "3", "see my books" ->  printBookshelf(customerCheckedBooks);
                case "4", "checkout" -> checkout(customerCheckedBooks, Book(setAvailability));
                case "5", "exit" -> System.out.println("Have a good day.");
                default -> System.out.println("Please select a viable option or type exit to leave.");
                }
            }
        }

    private static void printBookshelf(List<Book> bookShelf) {
        for (int i = 0; i < bookShelf.size(); i++) {
            System.out.println(bookShelf.get(i).toString());
        }
    }

    private static Book bookSelection (List<Book> bookShelf) {
        return bookShelf.get(0);

    }
    //in the following I need to pass my customer's books in as well as change their availability. Do I pass the Book book thru or just setavailability
    private static Book checkout(List<Book> customerCheckedBooks, Book bookAvailability) {
        System.out.println("Your basket contains the following \n" + customerCheckedBooks);
        bookAvailability.setAvailability(true);
        for (int i = 0; i < customerCheckedBooks.size(); i++) {
            bookAvailability.setAvailability(true);

            return ;
        }
    }
}


