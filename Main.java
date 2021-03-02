import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Compile to java bytecode");
        System.out.println("javac main.java");
        System.out.println("swimming ...");
        System.out.println("1 2 3 4 5");

        System.out.println("Getting started with Java");
        System.out.println("--------------------------------------");


        /* Primitive */
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

        System.out.println("You wrote:" + message2);





    }

}
