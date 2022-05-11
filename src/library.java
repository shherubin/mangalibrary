import jdk.internal.icu.text.UnicodeSet;

import javax.print.MultiDocPrintService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class library {
    public static void runMangalibrary(){

        Scanner stdin = new Scanner(System.in);
        String userChoice = "";
        boolean dashboard = true;
        List<book> customerCheckedBooks = new ArrayList<>();

        while(dashboard) {
            System.out.println("Welcome to Miyamoto's Manga library, we have all the best manga to rent. \n " +
                    "Please select an option \n" +
                     "1. Take a book. \n " +
                     "2. Return a book. \n" +
                     "3. Add a book cover. \n" +
                     "4. See your cart. \n" +
                     "5. Checkout.");

            userChoice = stdin.nextLine();
            switch(userChoice) {
                case "1", "take a book" -> customerCheckedBooks.add((book)runShelfInventory(stdin));
                case "2", "return a book" ->
            }
        }
    }

    private static Object runShelfInventory(Scanner stdin) {

        List<book> bookShelf = new ArrayList<>();
        List<book> cart = new ArrayList();
        String input = "";

        book OnePiece = new book("One Piece", "Eiichiro Oda", true, 1);
        book NarutoShippuden = new book("Naruto Shippuden", "Masashi Kishimoto", true, 2);
        book Inuyasha = new book("Inuyasha", "Rumiko Takahashi", true, 3);
        book KimetsuNoYaiba = new book("Kimetsu No Yaiba", "Koyoharu Gotouge", true, 4);
        book YuYuHakusho = new book("Yu Yu Hakusho", "Yoshihiro Togashi", true, 5);


        bookShelf.add(OnePiece);
        bookShelf.add(NarutoShippuden);
        bookShelf.add(Inuyasha);
        bookShelf.add(KimetsuNoYaiba);
        bookShelf.add(YuYuHakusho);

        System.out.println(bookShelf + "Please enter the book ID number to check it.");
        input = stdin.nextLine();
        cart.add(bookShelf.get(Integer.parseInt(input) - 1));
        //how do I write it so we check the availability of the books and 
        if (book )

        return cart;
    }
}
