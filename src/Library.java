import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Library {

    public static void runMangalibrary(){

        Scanner stdin = new Scanner(System.in);
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
                     "1. See the library. \n " +
                     "2. Take/Return a book \n " +
                     "3.

            userChoice = stdin.nextLine();
            switch(userChoice.toLowerCase(Locale.ROOT)) {
                case "1", "see the library" -> printBookshelf(bookShelf);
                case "2", "take/return a book", "take", "return" -> customerCheckedBooks((Book)bookSelection());

                }
            }
        }
    private Book updateBook(Book book, boolean updateFlag){
        //non static method 'setAvailability' cannot be reference from a static context? what does that mean and how do I fix it
        Book.setAvailability(updateFlag);
                return book;
    }
    private static void printBookshelf(List<Book> bookShelf) {
        for (int i = 0; i < bookShelf.size(); i++) {
            System.out.println(bookShelf.size());
        }
    }

    private static String bookSelection (Scanner stdin) {
        String input = "";
        System.out.println("Select from the following. Enter the number below \n 1.Select a book \n 2.Return a book");
        input = stdin.nextLine();
        if (input.equals("1")) {
            System.out.println("Enter the book ID to take it from the shelf.");
            input = stdin.nextLine();
            return input;
        }
        else {
            System.out.println("Select the book you would like to return.");
            input = stdin.nextLine();
            return input;
        }



    }
}


