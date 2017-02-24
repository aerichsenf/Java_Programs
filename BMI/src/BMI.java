/**
 * Created by Anderson on 2/23/17.
 * Class to calculate the BMI
 */
public class BMI {
    //member variables
    private String name;
    private int age;
    private double weight;
    private double height;

    //Creates a BMI object with the specified name, age, weight, and height.
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Creates a BMI object with the specified name, weight, height, and a default age 20.
    public BMI(String name, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.age = 20;
    }

    // return the BMI
    public double getBMI(){
        //to return rounded to two decimal places
        return Math.round(this.weight / (this.height * this.height) * 100.0) / 100.0;
    }

    public String getStatus(){
        //18.6 and 24.9 . You are overweight at values ​​between 25.0 and 29.9.
        // You are obese with a BMI of over 30.
        if (getBMI() <= 18.6)
            return "You are underweight";
        else if(getBMI() >= 30)
            return "You are overweight";
        return "You are normal";
    }
}
