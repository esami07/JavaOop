import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6)+4;
        // yani burda normalde random.nextInt(6) ifadesi 0 ile 5 arasında bir sayı üretir.
        //+4 ise bu aralığı 4 birim kaydırır, yani sonuç 4 ile 9 arasında olur.
        System.out.println(x);
        }
    }
