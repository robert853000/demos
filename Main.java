import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Compile to java bytecode");
        System.out.println("javac main.java");
        System.out.println("swimming ...");
        System.out.println("1 2 3 4 5");
        System.out.println("Getting started with Java");
        System.out.println("--------------------------------------");

        /* Primitive types */
        int num = 1;
        double weight = 3.2;
        char oneChar = 'K';
        boolean isTrue= false;

        System.out.println(num);

        /* Reference */
        String message = "The quick brown fox jumps over the lazy dog.";

        /* End */

        System.out.println(message.charAt(
                1
        ));

        System.out.println("Type your message below" );

        Scanner input = new Scanner(System.in);
        String message2= input.nextLine();

        System.out.println("You wrote:" + message2 + ".");

        if (message2.equals("Java")){
            System.out.println("You win new car");
            System.out.println("Type number");

            int favoriteNumber = input.nextInt();
            if (favoriteNumber < 5){
                System.out.println("Your inputted num:" + favoriteNumber);
            }
        }else {
            System.out.println ("If you had written Java, you would win new car");
        }

        boolean isOnRepeat =true;
        int i = 0;
        while (isOnRepeat){
            System.out.println(message.charAt(
                  i
            ));
            i = i + 1;
            if (i >= message.length()){
                isOnRepeat = false;
            }
        }

        announceTeaTime();
    }

    public static void announceTeaTime(){
        System.out.println("Waiting for tea ...");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Awesome... ");
    }
}
