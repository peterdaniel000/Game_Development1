import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMCounter{

    static String[] words = {"envelope", "cantelope", "the", "all of you", "i love you",
     "you are a beautiful person", "hello", "elephant", "biscuit"};
    public static void main(String[] args) throws InterruptedException{

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i = 0; i <= 9; i++){
        System.out.print(words[rand.nextInt(9)] + " ");
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        String typedwords = scan.nextLine();

        System.out.println(typedwords);
        scan.close();

    }
}