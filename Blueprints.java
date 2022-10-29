package BasicsOfJava;

import java.util.Scanner;

public class Blueprints {
    private double length;
    private double width;

    //default constructor
    public Blueprints(){//CONSTRUCTOR
        length = 0;
        width = 0 ;
    }
    public Blueprints(double length2 ,double width2){
        setLength(length2);
        setWidth(width2);
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }
    public double calculateArea(){
        return length*width;
    }
    //getter and setter methods

    public double getLength(){ //get length value
        return length;
    }
    public void setLength(double length){ // assign it global length
        this.length = length;
    }

    public double getWidth(){ //get width value
        return width;
    }
    public void setWidth(double width){ // assign it to global width
        this.width = width;
    }

    public static void main(String[] args){
        Blueprints b1 = new Blueprints(); //default
        b1.setWidth(25);
        b1.setLength(50);
        double area = b1.calculateArea();

        Blueprints b2 = new Blueprints(5,7);
        double area2 = b2.calculateArea();

        // pass objects as method parameters

        Blueprints kitchen = new Blueprints(200,400);
        Blueprints bathroom = new Blueprints(300,700);
//        double a = kitchen.calculateArea(); debug
//        double b = bathroom.calculateArea();
//        System.out.print(a+b);
        double totalArea = calculateTotalArea(kitchen,bathroom); // objects as parameters
        System.out.println("total area is "+ totalArea);

        //object as method return types
        Blueprints kitchen2 = getRoom();
        Blueprints bathroom2 = getRoom();

        double area3 = calculateTotalArea(kitchen2,bathroom2);
        System.out.println(area3);
//        Account account1 = new Account(); creating account
    }

    public static double calculateTotalArea(Blueprints first, Blueprints second){
        return first.calculateArea() + second.calculateArea();
    }
    public static Blueprints getRoom(){
        System.out.println("enter length");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("enter width");
        double width = input.nextDouble();

        return new Blueprints(length,width); //returns an object
    }
// records immutable
    public record Account(
            int id,
            String type,
            double balance){
            public void newMethod(){
                System.out.println("rec");
        }
}

}
