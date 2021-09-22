package educanet;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo.");
        int x = sc.nextInt();
        int fact = 1;

        for(int y = 1; y <= x; y++){
            fact = fact * y;
        }

        System.out.println(fact);
    }
}
