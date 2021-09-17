package educanet;

import java.util.Scanner;

public class Sifra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte vetu.");
        String text = sc.nextLine();

        for (int y = 0; y < text.length(); y+=2){
            char x = text.charAt(y);
            System.out.println(x);
        }
    }
}
