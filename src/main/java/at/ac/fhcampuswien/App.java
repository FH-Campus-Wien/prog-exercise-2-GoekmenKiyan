package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        Scanner scan = new Scanner(System.in);

        double max = 0;
        int count = 1;
        double number;

        do {
            System.out.print("Number " + count + ": ");
            number = scan.nextDouble();

            if (number <= 0 && count == 1) {
                System.out.println("No number entered.");
                return;

            } else if (number > max) {
                max = number;
            }
            count++;
        }
        while (1 < max);
        System.out.printf("The largest number is %.2f",max);
        System.out.println();
    }

    //todo Task 2
    public void stairs(){

        Scanner scan = new Scanner(System.in);

        int k = 1;
        int line = scan.nextInt();

        if (line > 0) {
            System.out.print("n: ");
            for (int i = 0; i < line; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        } else {
            System.out.println("n: " + "Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){

        int row = 6;
        int k = 0;
        for (int i = 1; i<=row; i++, k = 0){
            for (int j = 1; j<=row-i; ++j){
                System.out.print(" ");
            }
            while (k != 2 * i -1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){

        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan.nextInt(); // height
        System.out.print("c: ");
        char c = scan.next().charAt(0); // char is at position 0

        if(h % 2 == 0){
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }
        for (int i = 1; i<h/2+2;i++){
            for (int j = 0; j < h /2 - i + 1; j++){
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                char x = (char) (c + 1 - k);
                System.out.print(x);
            }
            for (int a = 2; a <= i; a++){
                char y = (char) (c + 1 - a);
                System.out.print(y);
            }
            System.out.println();
        }
        for (int i = 0; i < h / 2; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = i; k <= h / 2 - 1 ; k++){
                char x = (char) ((c-h/2+1) + k);
                System.out.print(x);
            }
            for (int k = i; k <= h / 2-2 ;k++){
                char y = (char) (c-1-k);
                System.out.print(y);
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){

        Scanner scan = new Scanner(System.in);

        int x=1,y=0,note;
        float sum=0;

        do {
            note = scan.nextInt();
            System.out.print("Mark "+x+": ");

            if (note<0 || note>5){
                System.out.println("Invalid mark!");
            }

            if (note==5){
                y++;
            }

            if (note<=5 && note>=1){
                x++;
                sum+=note;
            }
        }
        while (note>0);
        double z = sum/(x-1);
        if (Double.isNaN(z)){
            z = 0;
        }
        System.out.printf("Average: %.2f",z);
        System.out.println();
        System.out.println("Negative marks: "+y);
    }

    //todo Task 6
    public void happyNumbers(){

        Scanner scan = new Scanner(System.in);

        int n, digit, number, sum=0;
        System.out.print("n: ");
        n = scan.nextInt();
        number = n;

        while (number != 1 && number != 4){
            while (number > 0){
                digit = number % 10;
                sum = (digit*digit) + sum;
                number = number /10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1){
            System.out.println("Happy number!");
        }
        else{
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}