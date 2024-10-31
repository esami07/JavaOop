package mathclass;

import java.util.Scanner;

public class mathclass {
    public static void main(String[] args) {
//        double x =3.43;
//        double y = -10;
//
//        double z = Math.min(x,y);
//        System.out.println(z);
        double x,y,z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter a side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println(z);
    }
}
