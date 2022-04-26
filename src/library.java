import java.util.ArrayList;
import java.util.List;

public class library {
    public static void mangalibrary(){

        List<book> bookshelf = new ArrayList<>();
        List<book> customerCheckedBooks = new ArrayList<>();

        book OnePiece = new book("One Piece", "Eiichiro Oda", true);
        book NarutoShippuden = new book("Naruto Shippuden", "Masashi Kishimoto", false);
        book Inuyasha = new book("Inuyasha", "Rumiko Takahashi", true);
        book KimetsuNoYaiba = new book("Kimetsu No Yaiba", "Koyoharu Gotouge", true);
        book YuYuHakusho = new book("Yu Yu Hakusho", "Yoshihiro Togashi", false);


        bookshelf.add(OnePiece);
        bookshelf.add(NarutoShippuden);
        bookshelf.add(Inuyasha);
        bookshelf.add(KimetsuNoYaiba);

        System.out.println("Welcome to Miyamoto's Manga library, we have all the best manga to rent. \n " +
                "Please select something to rent." + bookshelf);


        for(int i = 0; i < bookshelf.size(); i++) {
            System.out.println(i);
        }
    }
}
