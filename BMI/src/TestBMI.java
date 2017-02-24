import java.util.Scanner;

/**
 * Created by Anderson on 2/23/17.
 * Class to test our BMI class
 */
public class TestBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.next();

        System.out.print("How old are you? ");
        int age = input.nextInt();

        System.out.print("What's your weight? ");
        double weight = input.nextDouble();

        System.out.print("What's your height? ");
        double height = input.nextDouble();

        //Close our Scanner object
        input.close();

        //Create a new object

        BMI person1 = new BMI(name, age, weight, height);

        //Display the status

        System.out.println(person1.getStatus() + " Your BMI is " + person1.getBMI());

    }
}
