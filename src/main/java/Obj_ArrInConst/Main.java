package Obj_ArrInConst;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];

        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double r = scanner.nextDouble();
            c[i] = new Circle(x, y, r);
        }

         for(Circle _c: c) {
            _c.show();
         }
        /*
        for(int i=0; i<c.length; i++) {
            c[i].show();
        }
         */
    }
}
