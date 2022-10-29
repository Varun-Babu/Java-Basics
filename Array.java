package BasicsOfJava;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[6]; //creating an empty array with size 6
        names[0] = " ram"; // assigning value
        String[] names2 = {"bv","cv","jv"};
        System.out.println(names2[0]); //accesing values from arrays
        String[] names3 = new String[6];

        // add values inside array using for loop
        for(int i =0; i<6; i++){
            names3[i] = input.next();
        }

        // printing values inside array using for loop
        for(int i =0; i<6; i++){
            System.out.print(names3[i] + " ");
        }


    }
}
