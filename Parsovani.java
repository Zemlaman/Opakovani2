package educanet;

import java.util.Scanner;

public class Parsovani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte text.");
        String text = sc.nextLine();

        text = text.replaceAll("[^0-9]" , "");

        int number = Integer.parseInt(text);
        int sum;

        for(sum=0; number!=0; number=number/10)
        {
            sum = sum + number % 10;
        }
        System.out.println(sum);
    }

}

